import java.util.Scanner;

public class Exercicio08 {
  public static void executar(){

    /* Exercício 08 - Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a concatenação de A e B, 
    ou seja, C contém os elementos de A seguidos dos elementos de B. */

    Scanner scan = new Scanner(System.in);

    int vetA[] = new int[5];
    int vetB[] = new int[5];
    String vetC[] = new String[5];
    String concat;

    for(int i = 0; i < 5; i++) {
      System.out.println("Digite o " + (i + 1) + "º número de cada vetor: ");
      vetA[i] = scan.nextInt();
      vetB[i] = scan.nextInt();
    }
    
    System.out.println("Vetor C: ");
    for(int i = 0; i < 5; i++){
      concat = vetA[i] + " " + vetB[i];
      vetC[i] = concat;
      System.out.println("Posição " + i + ": " + vetC[i]);
    }


    scan.close();

  }
}
