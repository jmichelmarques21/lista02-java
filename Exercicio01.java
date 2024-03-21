import java.util.Scanner;

public class Exercicio01 {
  public static void executar(){

    /* Exercício 01 - Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, 
    calcule a média e apresente na tela quais valores são menores, iguais ou superiores à média. */

    Scanner scan = new Scanner(System.in);

    int vetor[] = new int[5];

    for(int i = 0; i < 5; i++){
      System.out.println("Informe o valor " + (i+1) + ": ");
      vetor[i] = scan.nextInt();
    }

    System.out.println();
    int media = 0;

    System.out.println("Valores do vetor: ");
    for(int i = 0; i < 5; i++) {
      System.out.println(vetor[i]);
      media += vetor[i];
      }

      media = media / 5;
      System.out.println("Média: " + media);

      System.out.println("Valores menores do que a média: ");
      for(int i = 0; i < 5; i++) {
        if (vetor[i] < media) {
          System.out.println(vetor[i]);
        }
      }

      System.out.println("Valores maiores do que a média: ");
      for(int i = 0; i < 5; i++) {
        if (vetor[i] > media) {
          System.out.println(vetor[i]);
        }
      }

      System.out.println("Valores iguais à média: ");
      for(int i = 0; i < 5; i++) {
        if (vetor[i] == media) {
          System.out.println(vetor[i]);
        }
      }








    scan.close();

  }
}
