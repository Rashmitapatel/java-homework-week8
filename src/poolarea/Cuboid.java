package poolarea;
// Cuboid class
public class Cuboid extends Rectangle {
    private double hight;
    // costructor

    public Cuboid(double width, double length, double hight) {
        super(width, length);
        this.hight = hight;


        if (hight > 0) {
            this.hight = hight;
        } else {
            hight = 0;
        }
    }
// instance metod
    public double getHight() {
        return hight;
    }
// method
    public double getVlome() {
        double volume = getHight() * getArea();
return volume;

    }

}
