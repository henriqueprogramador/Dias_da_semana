
package dias_da_semana;

import java.util.Scanner;


public class Dias_da_semana {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia = 7;
        System.out.println("Digite um número: ");
        dia = entrada.nextInt();
        switch (dia) {
        case 1: 
        System.out.println("Domingo");
          break;
        case 2: 
          System.out.println("Segunda");
          break;
        case 3:
          System.out.println("Terça");
          break;
        case 4:
          System.out.println("Quarta");
          break;
        case 5:
          System.out.println("Quinta");
          break;
        case 6:
          System.out.println("Sexta");
          break;
        case 7:
          System.out.println("Sabado");
          break;
   
        default:
            System.out.println("Numeros de 1 a 7, por favor!");
        }
    }
    
}
