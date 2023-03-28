package cylinder;

public class Cylinder extends Circel{
private double hight;
public Cylinder (double radius, double hight) {
    super(radius);
    this.hight = hight;
     if (hight > 0) {
            hight = hight;
        } else {
            this.hight = 0;
        }
    }
        // methods
        public double getHight(){
            return  hight ;

        }
        public double getVolume(){
    double area = getArea()*getHight();
    return area;
    }
}
