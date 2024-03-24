import java.util.Scanner;

public class Exercicio15 {
  public static void executar(){

    /* Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de acordo com a seguinte regra: 
    com exceção do 1º número, só é permitido armazenar um número se ele for maior que o anterior. 
    Ex.: se o primeiro valor lido for 5, o próximo valor lido só poderá ser maior que 5. */

    Scanner scan = new Scanner(System.in);

    int vet[] = new int[5];

    System.out.println("Informe o 1º valor do vetor: " );
    vet[0] = scan.nextInt();

    for(int i = 1; i < vet.length; i++) {
      int numero;
      do{
        System.out.println("Informe o valor o " + (i + 1) + "º número (Precisa ser maior do que " + vet[i - 1] + ")");
        numero = scan.nextInt();
      } while (numero <= vet[i - 1]);
      vet[i] = numero;
    }

    System.out.println("Valores do vetor: ");
    for(int i = 0; i < vet.length; i++) {
      System.out.println(vet[i]);
    }





    scan.close();
  }
}
