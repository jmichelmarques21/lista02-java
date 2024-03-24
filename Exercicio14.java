import java.util.Scanner;

public class Exercicio14 {
  public static void executar(){

    /* Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione o maior elemento na última posição do vetor. 
    Nenhum número do vetor pode ser apagado ou duplicado. Apresente o vetor atualizado na tela. */

    Scanner scan = new Scanner(System.in);

    int vet[] = new int[5];

    for(int i = 0; i < vet.length; i++) {
      System.out.println("Informe o valor da posição " + (i + 1) + " do vetor: ");
      vet[i] = scan.nextInt(); 
    }

    System.out.println("Apresentando o vetor original: ");
    for(int i = 0; i < vet.length; i++) {
      System.out.println(vet[i]);
    }

    int indiceMaiorValor = 0;
    for(int i = 0; i < vet.length; i++) {
      if(vet[i] > vet[indiceMaiorValor]) {
        indiceMaiorValor = i;
      }
    }

    int troca = vet[indiceMaiorValor];
    vet[indiceMaiorValor] = vet[vet.length - 1];
    vet[vet.length - 1] = troca; 
  
    System.out.println("Os valores trocados do vetor: ");
    for(int i = 0; i < vet.length; i++){
      System.out.println(vet[i] + " ");
    }


    scan.close();
  }
}
