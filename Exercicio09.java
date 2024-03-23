import java.util.Scanner;

public class Exercicio09 {
  public static void executar(){
    
    /* Exercício 09 - Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C de acordo com as seguintes regras: 
     * a. Os elementos das posições pares de C são os elementos das posições pares de A;
     * b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B; */

     Scanner scan = new Scanner(System.in);

    int vetA[] = new int[5];
    int vetB[] = new int[5];
    int vetC[] = new int[5];

    for(int i = 0; i < 5; i++) {
      System.out.println("Informe o " + (i + 1) + "º elemento dos vetores A e B: ");
      vetA[i] = scan.nextInt();
      vetB[i] = scan.nextInt();
    }

    for(int i = 0; i < 5; i++) {
      if (i % 2 == 0) {
        vetC[i] = vetA[i];
      } else {
        vetC[i] = vetB[i];
      }
    }

    for(int i = 0; i < 5; i++) {
      System.out.println("Vetor C na posição [" + i + "]: " + vetC[i]);
    }



     scan.close();
  }
}
