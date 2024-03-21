import java.util.Scanner;

public class Exercicio05 {
  public static void executar(){

    /* Elabore um programa que leia 5 números do teclado e os armazene em um vetor. 
    Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes que o número n aparece no vetor. */

    Scanner scan = new Scanner(System.in);

    int vetor[] = new int[5];
    int n;
    int soma = 0;

    for(int i = 0; i < 5; i++) {
      System.out.println("Informe o " + (i + 1) + "º número: ");
      vetor[i] = scan.nextInt();
    }
    System.out.println();

    System.out.println("Informe um número: ");
    n = scan.nextInt();

    System.out.println();

    for(int i = 0; i < 5; i++) {
      if (vetor[i] == n) {
        soma++;
      }
    }

    System.out.println("O número " + n + " apareceu " + soma + " vez(es) no vetor.");




    scan.close();
  }
}
