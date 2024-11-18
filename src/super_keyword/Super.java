package super_keyword;

public class Super {

    /*
    Super keyword in Java is a reference variable that allows -
    a subClass (Child clas) to reference Parent Class
     */

    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with Constructor

    // Using SUPER keyword - This concept is also called as CONSTRUCTOR CHAINING

    public static void main(String[] args) {
        Car c = new Car();
    }
}


class Vehicle {
    public int maxSpeed = 180;

    public Vehicle() {
        System.out.println("DC Vehicle");
    }

    public Vehicle(int a) {
        System.out.println("PC Vehicle");
    }

    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle");
    }

    void display() {
        System.out.println("Vehicle Display");
    }


}


class Car extends Vehicle {
    private int maxSpeed = 281;

    void display() {
        System.out.println("Car Display");
    }


    Car() {
//        super(10);
        super();
        System.out.println("DC Car");
        System.out.println(this.maxSpeed); //child speed
        System.out.println(super.maxSpeed); //parent speed
        this.display();  // child display
        super.display(); //parent display
    }
}
