package methodoverriding24;
// Test class creat to object and call the method
public class Test2 {
    public static void main(String[] args) {

           SBI  s = new SBI();
        IcIcI i = new IcIcI();
        Axis  a= new Axis();
        System.out.println("SBI Rate Of Intrest :"+ s.getRateOfIntrest());
        System.out.println("IcIcIRate of Intrest:" + i.getRateOfIntrest());
        System.out.println("Axis Rate Of Intrest :"+ a.getRateOfIntrest());

    }
}
