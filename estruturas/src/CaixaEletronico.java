import java.util.Scanner;
import java.util.Locale;
public class CaixaEletronico {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    /*Vamos utilizar uma estrutura condicional simples */
    double saldo = 15.00;
    
    System.out.println("Seja bem vindo, digite o valor de saque:");
    double saque = scanner.nextDouble();

    if (saque <= saldo)
        saldo = saldo - saque;
    /*Caso quiser adicionar uma estrutura condicional composta, basta adicionar o `else` */
    else 
        System.out.println("Saldo indisponível");
        
    
    
    System.out.println("Seu saldo disponível é: " + saldo);

    
    }
}

