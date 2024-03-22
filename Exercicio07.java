import java.util.Scanner;

public class Exercicio07 {
  public static void executar(){

    /* Exercício 07 - Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles são iguais ou não. 
    Para serem iguais, todos os elementos dos dois vetores devem coincidir. */

    Scanner scan = new Scanner(System.in);

    int vet1[] = new int[5];
    int vet2[] = new int[5];

    for(int i = 0; i < 5; i++){
      System.out.println("Informe os valores da posição " + (i + 1) + " dos dois vetores: ");
      vet1[i] = scan.nextInt();
      vet2[i] = scan.nextInt();
    }

    // for(int i = 0; i < 5; i++) {
    //   System.out.println("Valores dos vetores na posição " + (i + 1) + ": " + vet1[i] + " - " + vet2[i]);
    // }

    // System.out.println("\nValores iguais: ");
    // for(int i = 0; i < 5; i++) {
    //   if(vet1[i] == vet2[i]) {
    //     System.out.println(vet1[i] + " - " + vet2[i]);
    //   }
    // }

    // System.out.println("\nValores diferentes: ");
    // for(int i = 0; i <  5; i++) {
    //   if(vet1[i] != vet2[i]){
    //     System.out.println("Os vetores são diferentes");
    //     break;
    //   } 
    // }

    for(int i = 0; i < 5; i++) {
      if (vet1[i] == vet2[i]){
        System.out.println("Os vetores são iguais.");
        break;
      } else {
        System.out.println("Os vetores são diferentes.");
        break;
      }
    }



    scan.close();

  }
}
