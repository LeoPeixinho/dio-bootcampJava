import java.util.Scanner;
public class BoletimEscolar {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);

    /*Vamos utilizar uma estrutura condicional composta */
    System.out.println ("Digite a nota do aluno: ");
    int nota = sc.nextInt();

    if (nota >= 7 ){
         System.out.println("O aluno foi aprovado");

    } else if (nota >= 5 && nota < 7){
        System.out.println("O aluno está de recuperação");
    }else{ 
        System.out.println("O aluno foi reprovado");
    }
 }

}
