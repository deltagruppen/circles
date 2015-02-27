package deltagruppen.circles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Iterator;
import java.util.LinkedList;

public class DrawView extends View
{
    private final LinkedList<PointF> points;
    private final Paint              paint;
    private Path path;
    private float lastTouchX;
    private float lastTouchY;
    private final RectF dirtyRect = new RectF();

    public DrawView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        points = new LinkedList<>();
        paint  = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setColor(Color.BLACK);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (points.size() == 0) return;

        Iterator<PointF> iterator = points.iterator();
        PointF point = iterator.next();

        while (iterator.hasNext()) {
            PointF next = iterator.next();
            //canvas.drawLine(point.x, point.y, next.x, next.y, paint);
            Path path = new Path();
            boolean first = true;
            for(int i = 0; i < points.size(); i += 2){
                 point = points.get(i);
                if(first){
                    first = false;
                    path.moveTo(point.x, point.y);
                }

                else if(i < points.size() - 1){
                    next = points.get(i + 1);
                    path.quadTo(point.x, point.y, next.x, next.y);
                }else if (points.size() == 0) {return;}
                else{
                    path.lineTo(point.x, point.y);
                }
            }

            canvas.drawPath(path, paint);
            point = next;
        }
    }

    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            points.clear();
            points.add(new PointF(event.getX(), event.getY()));
            invalidate();
            return true;
        }
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            resetDirtyRect(event.getX(), event.getY());
            for (int i = event.getHistorySize() - 1; i >= 0; i--) {

                points.add(new PointF(event.getHistoricalX(i), event.getHistoricalY(i)));
                expandDirtyRect(event.getHistoricalX(i), event.getHistoricalY(i));
            }
            points.add(new PointF(event.getX(), event.getY()));
            invalidate();
            return true;
        }
        return false;
    }
    private void expandDirtyRect(float historicalX,float historicalY){
        if(historicalX < dirtyRect.left) {
            dirtyRect.left = historicalX;
        }else if(historicalX > dirtyRect.right){
            dirtyRect.right = historicalX;
        }
        if(historicalX < dirtyRect.top){
            dirtyRect.top = historicalY;
        } else if (historicalX > dirtyRect.right){
            dirtyRect.bottom = historicalY;

        }
    }

    private void resetDirtyRect(float eventX, float eventY){
        dirtyRect.left = Math.min(lastTouchX, eventX);
        dirtyRect.right = Math.max(lastTouchX,eventX);
        dirtyRect.top = Math.min(lastTouchY,eventY);
        dirtyRect.bottom = Math.max(lastTouchY, eventY);
    }
}