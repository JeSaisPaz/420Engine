public class Triangle {

    // Attributes

    private Point pointA;
    private Point pointB;
    private Point pointC;

    private double sideAB;
    private double sideBC;
    private double sideCA;

    private double perimeter;
    private double area;

    private Vector normal;

    private VectorMath vectorMath = new VectorMath();

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        updateComponents();
    }

    private void updateComponents() {
        this.sideAB = distance(get_A(), get_B());
        this.sideBC = distance(get_B(), get_C());
        this.sideCA = distance(get_C(), get_A());
        this.perimeter = get_sideAB() + get_sideBC() + get_sideCA();
        this.area = computeArea();
        this.normal = normalize();
    }

    private double distance(Point p1, Point p2) {
        double dx = p2.get_X() - p1.get_X();
        double dy = p2.get_Y() - p1.get_Y();
        double dz = p2.get_Z() - p1.get_Z();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    private double computeArea() {
        double s = perimeter / 2.0;
        return Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));
    }

    // Setters and getters
    public double get_area() {
        return area;
    }

    public double get_perimeter() {
        return perimeter;
    }

    public Point get_A() {
        return pointA;
    }

    public Point get_B() {
        return pointB;
    }

    public Point get_C() {
        return pointC;
    }

    void set_pointA(Point pointA) {
        this.pointA = pointA;
        updateComponents();
    }

    void set_pointB(Point pointB) {
        this.pointB = pointB;
        updateComponents();
    }

    void set_pointC(Point pointC) {
        this.pointC = pointC;
        updateComponents();
    }

    public double get_sideAB() {
        sideAB = distance(pointA, pointB);
        return sideAB;
    }

    public double get_sideBC() {
        sideBC = distance(pointB, pointC);
        return sideBC;
    }

    public double get_sideCA() {
        sideCA = distance(pointC, pointA);
        return sideCA;
    }

    public Vector get_normal() {
        return normal;
    }

    // methods

    private Vector normalize() {
        Vector U = new Vector(this.pointA, this.pointB);
        Vector V = new Vector(this.pointA, this.pointC);
        Vector N = vectorMath.crossProduct(U, V);
        this.normal = vectorMath.unitVector(N);
        return this.normal;
    }

}
