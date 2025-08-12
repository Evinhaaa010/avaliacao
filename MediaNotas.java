package entradasaida;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[8]; // 8 notas anuais;
        double[] mediasBimestrais = new double[4]; // 4 bimestres;

        System.out.println("Digite as 8 notas anuais do aluno:");

        // Ler as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }
        // Calcular as médias bimestrais (cada bimestre tem 2 notas)
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }
        // Calcular as médias bimestrais (cada bimestre tem 2 notas)
            for (int i = 0; i < 4; i++) {
                mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;

                // Calcular as médias semestrais (2 bimestres por semestre)
                   double primeiroSemestre = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
                   double segundoSemestre = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

               // Calcular a média final (média dos dois semestres)
                  double mediaFinal = (primeiroSemestre + segundoSemestre) / 2;

                // Exibir resultados
                System.out.println("\nPráticas\n");
                System.out.println("1o Bimestre: " + mediasBimestrais[0]);
                System.out.println("2o Bimestre: " + mediasBimestrais[1]);
                System.out.println("1o Semestre: " + primeiroSemestre);
                System.out.println("----------------------");
                System.out.println("3o Bimestre: " + mediasBimestrais[2]);
                System.out.println("4o Bimestre: " + mediasBimestrais[3]);
                System.out.println("2o Semestre: " + segundoSemestre);
                System.out.println("-----------------------");
                System.out.println("Média Final: " + mediaFinal);

                entrada.close();
            }
        }
