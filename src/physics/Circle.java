package physics;

public class Circle {
    private double xPosition, yPosition, zPosition, radius;

    public Circle(double xPosition, double yPosition, double zPosition, double radius) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.zPosition = zPosition;
        if(radius > 0) {
            this.radius = radius;
        } else throw new IllegalArgumentException("Radius must be greater than 0");
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
        if(radius > 0) {
            this.radius = radius;
        } else throw new IllegalArgumentException("Radius must be greater than 0");
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
