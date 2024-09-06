import physics.*;

 class test {
    public static void main(String[] args) {
        try {
            //Constructor test
            Circle c = new Circle(0, 0, 0, 1);

            //setter test
            c.setxPosition(1);
            c.setyPosition(2);
            c.setzPosition(3);
            c.setRadius(4);

            //getter test
            System.out.println(c.getxPosition());
            System.out.println(c.getyPosition());
            System.out.println(c.getzPosition());
            System.out.println(c.getRadius());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}