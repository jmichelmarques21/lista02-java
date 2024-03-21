import java.util.Scanner;

public class Exercicio02 {
  public static void executar(){

    /* Exercício 02 - Escreva um algoritmo que leia em um vetor uma sequência finita de números digitados pelo usuário e, 
    logo após, mostre o número de cada posição do vetor e se ele é positivo, negativo ou zero. */

    Scanner scan = new Scanner(System.in);

    int vetor[] = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.println("Informe o " + (i + 1) + "º número: ");
      vetor[i] = scan.nextInt();
    }

    System.out.println("Valores positivos: ");
    for(int i = 0; i < 5; i++) {
      if (vetor[i] >= 0) {
        System.out.println(i + ": " + vetor[i]);
      }
    } 

    System.out.println("Valores negativos: ");
    for(int i = 0; i < 5; i++){
      if (vetor[i] < 0) {
        System.out.println(i + ": " + vetor[i]);
      }
    }






    scan.close();
  }
}
