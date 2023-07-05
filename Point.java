public class Point {
    private float x;
    private float y;

    // Constructor with parameters
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Default constructor
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Getter for x
    public float getX() {
        return x;
    }

    // Setter for x
    public void setX(float x) {
        this.x = x;
    }

    // Getter for y
    public float getY() {
        return y;
    }

    // Setter for y
    public void setY(float y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Get x and y as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Override toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
