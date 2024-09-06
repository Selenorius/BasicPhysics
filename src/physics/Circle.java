package physics;

public class Circle {
    private double xPosition, yPosition, zPosition, radius;

    public Circle(double x, double y, double z, double radius) {
        xPosition = x;
        yPosition = y;
        zPosition = z;
        this.radius = radius;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public void setzPosition(double zPosition) {
        this.zPosition = zPosition;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getxPosition() {
        return xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public double getzPosition() {
        return zPosition;
    }

    public double getRadius() {
        return radius;
    }
}
