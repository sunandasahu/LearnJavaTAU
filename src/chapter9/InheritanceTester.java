package chapter9;

public class InheritanceTester {
    public static void main(String [] args){
        Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        rectangle.print();
        square.print("square");

        Mother mom = new Mother();
        mom.setName("Soudamini");
        System.out.println("My mom is "+ mom.getGender() + " AND her name is " + mom.getName());

    }
}
