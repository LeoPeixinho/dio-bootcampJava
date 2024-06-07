import java.util.Scanner;

public class Rotinas {
    public static void main (String[]args){
    Scanner sc = new Scanner (System.in);

    System.out.println("Digite o dia da semana: ");
    String diaAtual = sc.nextLine();

    switch (diaAtual) {
        case "Segunda":{
            System.out.println("Dia de estudo");
            break;
        }
        case "Terça":{
            System.out.println("Dia de trabalho");
            break;
        }
        case "Quarta":{
            System.out.println("Dia de academia");
            break;
        }
        case "Quinta":{
            System.out.println("Dia de estudo");
            break;
        }
        case "Sexta":{
            System.out.println("Dia de comer fora");
            break;
        }
        case "Sabado" :{
            System.out.println("Dia de Passear");
            break;
        }
        case "Domingo": {
            System.out.println("Dia de descanso");
            break;
        }
        default:
        System.out.println("Erroe");
        
    }
    }
}
