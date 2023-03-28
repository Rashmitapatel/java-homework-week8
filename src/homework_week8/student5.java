package homework_week8;
/*Example of Constructor Overloading
//Java program to overload constructors
class Student5{
    int id;
    String name;
    int age;
    //creating two arg constructor
    Student5(int i,String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    Student5(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    public void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        Student5 s1 = new Student5(111,"Karan");
        Student5 s2 = new Student5(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
Output:
        111 Karan 0
        222 Aryan 25   */
        public class student5 {
    int id;
    String name;
    int age;


    public student5(int id, String name) {
        this.id = id;
        this.name = name;
    }





    // creating three arg Constuctor


    public student5(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


        public void display () {
            System.out.println(id + "" + name + "" + age);
        }
            public static void main (String[]args){
                student5 s1 = new student5(111, "Karan");
                student5 s2 = new student5(222, "Aryan", 25);
                s1.display();
                s2.display();
            }
        }








