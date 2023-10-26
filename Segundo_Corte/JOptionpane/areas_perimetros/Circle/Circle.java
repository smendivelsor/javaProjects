package circle;

public class Circle {
    private double pi = 3.14;
    private double radio ;

    public Circle(double diameter) {
        System.out.println("Creating circle with diameter " + diameter);
        this.radio = diameter / 2;
    }

    public double circumference() {
        return 2 * this.pi * this.radio;
    }
   
    public double area(){
        return this.pi * this.radio * this.radio;
    }

    public static void main(String[] args) {
        Circle mediumPizza = new Circle(12);
        Circle teachingTable = new Circle(36);
        Circle roundRoom = new Circle(11460);
     

        System.out.println(mediumPizza.circumference());
        System.out.println(teachingTable.circumference());
        System.out.println(roundRoom.circumference());
       
        System.out.println(mediumPizza.area());
        System.out.println(teachingTable.area());
        System.out.println(roundRoom.area());
    }
}
