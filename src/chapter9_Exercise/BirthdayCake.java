package chapter9_Exercise;

public class BirthdayCake extends Cake{
    public int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public BirthdayCake(){
        setFlavor("Strawberry");
        setCandles(10);
        setPrice(49.99);


    }
}
