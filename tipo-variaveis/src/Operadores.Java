public class Operadores {
    public static void main (String[]args){
        /** Manipulação de variável*/
        int numero = - 5;
        numero = numero * -1;    
        System.out.println( numero);
        int numero2= 5;
        numero2= - numero;
        System.out.println(numero2);

        /** Incrementação de número */
        numero++; 
        System.out.println(numero);

        /**Manipulando valores booleanos */
        boolean variavel = true; 
        System.out.println(!variavel);

        /**Exemplo de estrutura condiconal */
        String semana = "Segunda";
        if (semana == "Domingo"){
            System.out.println("Hoje é dia de descanso");
        }else if  (semana == "Segunda"){   
            System.out.println ("Hoje é dia de trabalho");                                                       
        }  

        /**Utilizando operador ternário para verificar condição */
        int a,b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
            System.out.println(resultado);
        /**Utilizando operadores relacionais */
        
        String boss1 = "Lasaxya";
        String boos2 = "Victor";
        
        boolean yesOrNo = boss1 != boos2;
        System.out.print("O número Um é diferente do número 2?" + yesOrNo + "\n");

        if(boss1 != boos2){
            System.out.println("Você pode continuar suar jornada");

        } else if (boss1 == boos2){
            System.out.println("Você não pode continuar sua jornada");
        }

        /** Utilizando operadores lógicos */

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println ("Você passou de fase");
        }
        if (condicao1 || condicao2){
            System.out.println("Você precisa resgatar um item");
        }
    }
}
