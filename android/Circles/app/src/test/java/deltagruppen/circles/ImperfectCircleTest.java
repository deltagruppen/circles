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

        PointF p1,p2,p3,p4,p5;

        p1 = new PointF(0,0);
        p2 = new PointF(1,0);
        p3 = new PointF(1,1);
        p4 = new PointF(0,1);
        p5 = new PointF(0,0);

        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        ps.add(p4);
        ps.add(p5);

        ImperfectCircle ic = new ImperfectCircle(ps);

        double pLength = 4;

        assertEquals(pLength, ic.getPerimeterLength());

    }

    /**
     *
     * @throws Exception
     */

    public void testGetArea() throws Exception {

        List<PointF> ps = new ArrayList<>();

        PointF p1,p2,p3,p4,p5;

        p1 = new PointF(0,0);
        p2 = new PointF(1,0);
        p3 = new PointF(1,1);
        p4 = new PointF(0,1);
        p5 = new PointF(0,0);

        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        ps.add(p4);
        ps.add(p5);

        ImperfectCircle ic = new ImperfectCircle(ps);

        double area = 1;

        assertEquals(area, ic.getArea());

    }

}