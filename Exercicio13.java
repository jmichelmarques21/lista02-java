import java.util.Scanner;

public class Exercicio13 {
  public static void executar(){

    /* Elabore um algoritmo que receba um número n e retorne um vetor com os n primeiros termos da sequência de Fibonacci. 
    Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8, 13, 21}. */

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int n = scan.nextInt();
    int fibo[] = new int[n];
    fibo[0] = 1;
    fibo[1] = 1;


    for(int i = 2; i < n; i++) {
      fibo[i] = fibo[i - 1] + fibo[i -2];
    }

    System.out.println("Os " + n + " primeiros números da sequência Fibonacci são: ");
    for(int i = 0; i < n; i++) {
      System.out.print(fibo[i] + " ");
    }

   



    scan.close();
  }
}
