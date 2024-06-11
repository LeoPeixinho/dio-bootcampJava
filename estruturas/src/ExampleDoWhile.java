import java.util.Random;
public class ExampleDoWhile{
    public static void main (String[]args){
        do {
            boolean cardCredit = false;
            System.out.println(" Active credit card verification...");
        } while (balance());
    }
    private static boolean balance(){
        boolean charge = new Random().nextInt(3)==1;
        System.out.println("Charge?" + charge);
        return ! charge;
    }
}