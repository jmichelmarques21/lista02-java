import java.util.Scanner;

public class Exercicio10 {
  public static void executar(){

    /* Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie os elementos de A em B de forma invertida. 
    Ou seja, o primeiro elemento de A é o último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim por diante. */

    Scanner scan = new Scanner(System.in);

    int vetA[] = new int[5];
    int vetB[] = new int[5];

    for(int i = 0; i < 5; i++) {
      System.out.println("Insira o número " + (i + 1) + "º do vetor A: ");
      vetA[i] = scan.nextInt();
    }

    for(int i = 0; i < 5; i++) {
      vetB[vetB.length - 1 - i] = vetA[i];
    }


    System.out.println("Valores no vetor A e B: ");
    for(int i = 0; i < 5; i++){
    System.out.println("A[" + i + "]: " + vetA[i] + " - B[" + i + "]: " + vetB[i]);
    }


    scan.close();
  }
}
