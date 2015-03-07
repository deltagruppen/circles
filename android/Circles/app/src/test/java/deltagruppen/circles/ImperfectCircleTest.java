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

        float f1,f2,f3,f4;
        f1 = 0;
        f2 = 1;
        f3 = 2;
        f4 = 3;

        ps.add( new PointF(f1,f2));
        ps.add( new PointF(f3,f2));     // Symmetry of points where + is an intersection:
        ps.add( new PointF(f4,f2));     //   *
        ps.add( new PointF(f4,f3));     // * + * *
        ps.add( new PointF(f4,f4));     //   *   *
        ps.add( new PointF(f3,f4));     //   * * *
        ps.add( new PointF(f2,f4));
        ps.add( new PointF(f2,f3));
        ps.add( new PointF(f2,f1));

        //There is trouble creating an IC from the current data for unknown reasons.
        ImperfectCircle ic = new ImperfectCircle(ps);

        double expectedPerimeterLength = 8;

        assertEquals(expectedPerimeterLength, ic.getPerimeterLength());

    }

    /**
     *
     * @throws Exception
     */

    public void testGetArea() throws Exception {

        List<PointF> ps = new ArrayList<>();

        float f1,f2,f3,f4;
        f1 = 0;
        f2 = 1;
        f3 = 2;
        f4 = 3;

        ps.add( new PointF(f1,f2));
        ps.add( new PointF(f3,f2));
        ps.add( new PointF(f4,f2));
        ps.add( new PointF(f4,f3));
        ps.add( new PointF(f4,f4));
        ps.add( new PointF(f3,f4));
        ps.add( new PointF(f2,f4));
        ps.add( new PointF(f2,f3));
        ps.add( new PointF(f2,f1));

        ImperfectCircle ic = new ImperfectCircle(ps);

        double expectedArea = 4;

        assertEquals(expectedArea, ic.getArea());

    }

}