package chapter10_Exercise;

public class Banana extends Fruit{

    public Banana (){
        setCalories(140);
    }

    @Override
    public void makeJuice() {
        System.out.println("This is banana shake");
    }
    public void peel(){
        System.out.println("Please peel banana before making shake");

    }
}
