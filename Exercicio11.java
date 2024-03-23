import java.util.Scanner;

public class Exercicio11 {
  public static void executar(){

    /* Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de tamanho igual a 5. 
    Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 8*9 = 140 */

    Scanner scan = new Scanner(System.in);

    int a[] = new int[5];
    int b[] = new int[5];

    for(int i = 0; i < 5; i++) {
      System.out.println("Informe o valor dos vetores na " + (i + 1) + "ª posição: ");
      a[i] = scan.nextInt();
      b[i] = scan.nextInt();
    }

    int produto = 0;

    for(int i = 0; i < 5; i++){
      produto += a[i] * b[i];
    }

    System.out.println("Valor do produto escalar: " + produto);

    scan.close();
  }
}
