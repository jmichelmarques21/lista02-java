import java.util.Scanner;

public class Exercicio04 {
  public static void executar(){

    /* Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável de um número n qualquer, 
    depois mostre na tela o índice dos elementos que são inferiores a n. */

    Scanner scan = new Scanner(System.in);

    int vetor[] = new int[5];
    int n;

    for(int i = 0; i < 5; i++) {
      System.out.println("Informe o " + (i + 1) + "º número: ");
      vetor[i] = scan.nextInt();
    }

    System.out.println("Informe um número: ");
    n = scan.nextInt();

    System.out.println("Números inferiores a " + n + ": ");
    for(int i = 0; i < 5; i++) {
      if (vetor[i] < n) {
        System.out.println("Posição " + i + ": " + vetor[i]);
      } 
    }



    scan.close();
  }
}
