import java.util.Scanner;

public class Exercicio06 {
  public static void executar(){

    /* Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor com 5 pesos e calcule a média ponderada do aluno.  */

    Scanner scan = new Scanner(System.in);

    double notas[] = new double[5];
    double pesos[] = new double[5];
    double somaNotas = 0;
    double somaPesos = 0;
    double mediaPonderada;

    System.out.println("Vetor das notas: ");
    for(int i = 0; i < 5; i++) {
      System.out.println("Informe a " + (i + 1) + "ª nota: ");
      notas[i] = scan.nextDouble();
      somaNotas += notas[i];
    }

    System.out.println("Vetor dos pesos: ");
    for(int i = 0; i < 5; i++) {
      System.out.println("Informe o " + (i + 1) + "º peso: ");
      pesos[i] = scan.nextDouble();
      somaPesos += pesos[i];
    }

    System.out.println();

    System.out.println("Relatório: ");
    for(int i = 0; i < 5; i++) {
      System.out.println("Nota " + (i + 1) + ": " + notas[i] + " - Peso " + (i + 1) + ": " + pesos[i]);
    }

    System.out.println();

    System.out.println("Média ponderada: " + (somaNotas * somaPesos) / somaPesos);



    scan.close();
  }
}
