package poolarea;
// class main

public class Main {
    // main method
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectangel.width="+rectangle.getWidth());
        System.out.println("rectangel.lenght="+rectangle.getLength());
        System.out.println("rectangel.area="+rectangle.getArea());
        Cuboid cuboid =new Cuboid(5,10,5);
        System.out.println("cuboid.width="+ cuboid.getWidth());
        System.out.println("cuboid.lenght="+cuboid.getLength());
        System.out.println("cuboid.area ="+ cuboid.getArea());
        System.out.println("cuboid.hight="+cuboid.getHight());
        System.out.println("cuboid.volume"+cuboid.getVlome());

    }
}
