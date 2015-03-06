package deltagruppen.circles;
import android.graphics.PointF;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class ImperfectCircleTest extends TestCase {

    public void testGetPerimeterLength() throws Exception {

        List<PointF> points = new ArrayList<>();

        PointF p1,p2,p3,p4;

        p1 = new PointF(0,0);
        p2 = new PointF(1,0);
        p3 = new PointF(1,1);
        p4 = new PointF(0,1);

        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);

        ImperfectCircle ic = new ImperfectCircle(points);

        double pLength = 4;

        assertEquals(pLength, ic.getPerimeterLength());

    }

    public void testGetArea() throws Exception {

        List<PointF> points = new ArrayList<>();

        PointF p1,p2,p3,p4;

        p1 = new PointF(0,0);
        p2 = new PointF(1,0);
        p3 = new PointF(1,1);
        p4 = new PointF(0,1);

        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);

        ImperfectCircle ic = new ImperfectCircle(points);

        double area = 1;

        assertEquals(area, ic.getArea());

    }

}