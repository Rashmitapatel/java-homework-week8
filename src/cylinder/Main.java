package cylinder;


public class Main {
    public static void main(String[] args) {
        Circel circel= new Circel(3.75);
        System.out.println("circle.radius= " + circel.getRadius());
        System.out.println("circle.area= " + circel.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

    }







}
