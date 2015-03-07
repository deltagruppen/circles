package deltagruppen.circles;
import android.graphics.PointF;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class ImperfectCircleTest extends TestCase {

    /**
     *
     * @throws Exception
     */

    public void testGetPerimeterLength() throws Exception {

        List<PointF> ps = new ArrayList<>();

        float f1,f2;
        f1 = 0;
        f2 = 1;

        ps.add( new PointF(f1,f1));
        ps.add( new PointF(f2,f1));
        ps.add( new PointF(f2,f2));
        ps.add( new PointF(f1,f2));
        ps.add( new PointF(f1,f1));

        //There is trouble creating an IC from the current data for unknown reasons.
        ImperfectCircle ic = new ImperfectCircle(ps);

        double expectedPerimeterLength = 4;
        double actualPerimeterLength = 4;

        //assertEquals(expectedPerimeterLength, actualPerimeterLength);
        assertEquals(expectedPerimeterLength, ic.getPerimeterLength());

    }

    /**
     *
     * @throws Exception
     */

    public void testGetArea() throws Exception {

        List<PointF> ps = new ArrayList<>();

        float f1,f2;
        f1 = 0;
        f2 = 1;

        ps.add( new PointF(f1,f1));
        ps.add( new PointF(f2,f1));
        ps.add( new PointF(f2,f2));
        ps.add( new PointF(f1,f2));
        ps.add( new PointF(f1,f1));

        ImperfectCircle ic = new ImperfectCircle(ps);

        double expectedArea = 1;
        //double actualArea = 1;

        //assertEquals(expectedArea, actualArea);
        assertEquals(expectedArea, ic.getArea());

    }

}