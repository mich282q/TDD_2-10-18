package Test_Experiment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LineTest {
    @Test
    void testGetx() {
        Point point = new Point();
        int pointx;


        point.setX(3);


        pointx = point.getX();


        assertEquals(3, pointx);


    }

    @Test
    void textGety() {
        Point point1 = new Point();
        int pointy;

        point1.setY(4);

        pointy = point1.getY();

        assertEquals(4, pointy);
    }

    @Test
    void testLength1() {
        Point a = new Point();
        a.setX(3);
        a.setY(0);

        Point b = new Point();
        b.setX(0);
        b.setY(4);

        Line line = new Line(a,b);

    double length = line.calculateLength();
        assertEquals(5.0,length);


    }
    @Test
    void testLength2() {
        Point a = new Point();
        a.setX(5);
        a.setY(2);

        Point b = new Point();
        b.setX(-7);
        b.setY(1);

        Line line = new Line(a,b);

        double length = line.calculateLength();
        assertEquals(12.041594578792296,length);


    }
}
