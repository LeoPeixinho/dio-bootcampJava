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


    }
}
