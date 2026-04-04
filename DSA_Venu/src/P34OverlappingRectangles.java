import java.util.Scanner;

public class P34OverlappingRectangles {
    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static public boolean isOverlapping(Point p1, Point p2, Point p3, Point p4) {
        int r1Left = Math.min(p1.x, p2.x);
        int r1Right = Math.max(p1.x, p2.x);
        int r1Bottom = Math.min(p1.y, p2.y);
        int r1Top = Math.max(p1.y, p2.y);

        int r2Left = Math.min(p3.x, p4.x);
        int r2Right = Math.max(p3.x, p4.x);
        int r2Bottom = Math.min(p3.y, p4.y);
        int r2Top = Math.max(p3.y, p4.y);

        if (r1Left >= r2Right || r2Left >= r1Right) {
            return false;
        }
        if (r1Bottom >= r2Top || r2Bottom >= r1Top) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point(sc.nextInt(), sc.nextInt());
        Point p2 = new Point(sc.nextInt(), sc.nextInt());
        Point p3 = new Point(sc.nextInt(), sc.nextInt());
        Point p4 = new Point(sc.nextInt(), sc.nextInt());

        System.out.println(isOverlapping(p1, p2, p3, p4));
    }
}
