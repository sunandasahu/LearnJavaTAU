package chapter10_Exercise;

public class Market {

    public static void main(String[] args){
        Apple apple = new Apple();
        apple.makeJuice();
        apple.removeSeed();

        Fruit fuji = new Apple();
        fuji.makeJuice();

        fuji= new Banana();
        fuji.makeJuice();
    }

}
