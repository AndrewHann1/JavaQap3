public class MovablePointDemo {
    public static void main(String[] args) {
        Point point = new Point(2.5f, 3.8f);

        System.out.println("Point coordinates: " + point.toString());

        MovablePoint movablePoint = new MovablePoint(1.2f, -0.5f, 0.1f, -0.2f);

        System.out.println("MovablePoint coordinates and speed: " + movablePoint.toString());

        movablePoint.move();
    
        System.out.println("MovablePoint coordinates after moving: " + movablePoint.toString());
    }
}
