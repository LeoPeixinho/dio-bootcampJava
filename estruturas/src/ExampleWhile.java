import java.util.concurrent.ThreadLocalRandom;
public class ExampleWhile{
    public static void main (String[]args){
    double money = 50.0;
    while(money > 0) {
        double sweetValue = aleatoryValue ();
        if (sweetValue > money)
            sweetValue = money;

            System.out.printf("Sweet value %.2f added to cart\n ",  sweetValue );
            money = money - sweetValue;

    }
            System.out.printf("New value of money: %.2f%n", money);
    }
    private static double aleatoryValue(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}