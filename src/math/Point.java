public class Point {

    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double get_X() {
        return x;
    }

    public double get_Y() {
        return y;
    }

    public double get_Z() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Point subtract(Point p) {
        x -= p.get_X();
        y -= p.get_Y();
        z -= p.get_Z();
        return this;
    }

    public Point add(Point p) {
        x += p.get_X();
        y += p.get_Y();
        z += p.get_Z();
        return this;
    }

}
