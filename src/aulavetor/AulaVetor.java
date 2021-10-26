package aulavetor;

import java.util.Scanner;

public class AulaVetor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String[3];
        float notas[] = new float[3];
        float maior, menor;
        int posicaoMaior, posicaoMenor;
        for (int i = 0; i < notas.length; i++) {

            System.out.println("Digite o nome do aluno " + (i + 1));
            nomes[i] = entrada.next();

            System.out.println("Digite a nota do aluno " + nomes[i]);
            notas[i] = entrada.nextFloat();
        }
        maior = notas[0];
        menor = notas[0];
        posicaoMaior = 0;
        posicaoMenor = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
                posicaoMaior = i;
            } 
            else if (notas[i] < menor) {
                menor = notas[i];
                posicaoMenor = i;
            }

        }

        System.out.println("O aluno " + nomes[posicaoMaior] + " tirou a MAIOR nota");
        System.out.println("O aluno " + nomes[posicaoMenor] + " tirou a MENOR nota");

    }

}
