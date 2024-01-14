package chapter6;

public class AreaOfHouse {
    /*
    Room1
    */
    public static void main(String [] args){
        Rectangle room1 = new Rectangle();
        room1.setWidth(20);
        room1.setLength(50);
       double areaOfRoom1 = room1.calculateArea();
        System.out.println("Area of the room1 is " +areaOfRoom1);

        /*
    Room2
    */
        Rectangle room2 = new Rectangle(35,25);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("Area of the room2 is " +areaOfRoom2);

        double areaOfHouse = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of the house is "+ areaOfHouse);
    }

}
