import java.util.Scanner;

public class Exercicio12 {
  public static void executar(){

    /* Elabore um programa que leia um vetor de 12 elementos apresente na tela o produto dos elementos pares positivos (desconsiderar o zero). 
    Exemplo: {0, 5, 8, 1, - 6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840 */

    Scanner scan = new Scanner(System.in);

    int vet[] = new int[12];
    int produto = 1;

    for(int i = 0; i < vet.length; i++) {
      System.out.println("Informe o valor da posição " + (i) + ": ");
      vet[i] = scan.nextInt();
    }

    for(int i = 0; i < vet.length; i++){
      if (vet[i] % 2 == 0 & vet[i] > 0) {
        produto *= vet[i];
      }
    }

    System.out.println("Apresentando os valores: ");
    for(int i = 0; i < vet.length; i++) {
      System.out.println("Valor na posição " + i + ": ");
    }

    System.out.println("Produto: " + produto) ;






    scan.close();

  }
}
