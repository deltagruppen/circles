package deltagruppen.circles;

import java.util.List;
import android.graphics.PointF;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImperfectCircleTest{

    //Test if function getPerimeterLength works as expected
    @Test
    public void testGetPerimeterLength() throws Exception {

        List<PointF> ps = new ArrayList<>();

        float f1,f2,f3;
        f1 = 0;
        f2 = 1;
        f3 = 2;

        ps.add( new PointF(f1,f2));
        ps.add( new PointF(f3,f2));
        ps.add( new PointF(f3,f3));
        ps.add( new PointF(f2,f3));
        ps.add( new PointF(f2,f1));

        //There is trouble creating an IC from the current data for unknown reasons.
        ImperfectCircle ic = new ImperfectCircle(ps);

        double expectedPerimeterLength = 4;

        assertEquals(expectedPerimeterLength, ic.getPerimeterLength(), 0.01);

    }

    //Test if function getArea works as expected
    @Test
    public void testGetArea() throws Exception {

        List<PointF> ps = new ArrayList<>();

        float f1,f2,f3;
        f1 = 0;
        f2 = 1;
        f3 = 2;

        ps.add( new PointF(f1,f2));
        ps.add( new PointF(f3,f2));
        ps.add( new PointF(f3,f3));
        ps.add( new PointF(f2,f3));
        ps.add( new PointF(f2,f1));

        ImperfectCircle ic = new ImperfectCircle(ps);

        double expectedArea = 1;

        assertEquals(expectedArea, ic.getArea(), 0.01);

    }

}