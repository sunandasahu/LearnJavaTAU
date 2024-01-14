package chapter10_Exercise;

public class Apple extends Fruit{

    public Apple(){
        setCalories(95);
    }

    @Override
    public void makeJuice() {
        System.out.println("This is apple juice");
    }
    public void removeSeed(){
        System.out.println("Please remove seed before making juice");
    }

}
