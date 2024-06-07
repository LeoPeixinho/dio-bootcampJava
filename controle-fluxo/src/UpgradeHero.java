import java.util.Scanner;

public class UpgradeHero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o seu nível atual?");
        int nivel = sc.nextInt();
            for(;nivel <=20; nivel ++){
                System.out.println("Subindo nível " + nivel);
            }
        System.out.println("Você pode avançar de fase");
    }
}
