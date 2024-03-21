import java.util.Scanner;

public class Exercicio03 {
  public static void executar(){

    /* Exercicio 03 - Faça um programa que leia em um vetor uma sequência finita de números digitados pelo usuário. 
    Crie um segundo vetor que armazene o dobro de cada número do primeiro vetor e depois apresente os valores deste vetor. */

    Scanner scan = new Scanner(System.in);

    int vetor[] = new int[5];
    int dobro[] = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.println("Informe o " + (i + 1) + "º número: ");
      vetor[i] = scan.nextInt();
    }

    System.out.println("Primeiro vetor: ");
    for(int i = 0; i < 5; i++) {
      System.out.println(i + ": " + vetor[i]);
    }

    for(int i = 0; i < 5; i++){
      dobro[i] = vetor[i] * 2;
    }

    System.out.println("Segundo vetor: ");
    for(int i = 0; i < 5; i++){
      System.out.println(i + ": " + dobro[i]);
    }


    scan.close();

  }
}
