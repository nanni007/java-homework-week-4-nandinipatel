
public class Point {
    // declaring two variables
    int x;
    int y;

    //creating no args constructors
    public Point() {
        this(0, 0); //Calls the second constructor with default values (0, 0)
    }

    //creating constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //get method for x
    public int getX() {
        return x;
    }

    //get method for y
    public int getY() {
        return y;
    }

    //set method for x
    public void setX(int x) {
        this.x = x;
    }

    //set method for y
    public void setY(int y) {
        this.y = y;
    }

    //Calculating the distance between this point and the origin (0,0) using formula given
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    //Calculating the distance between this point and a specific (x,y) coordinates
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    //Calculating the distance between this point and another point object
    public double distance(Point another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
