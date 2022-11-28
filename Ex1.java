/*Crie um programa para ler as notas dos alunos de uma turma e depois calcular a média,
 baseado no total de notas digitadas. Exemplo, caso sejam digitadas 5 notas,
 some todas e divida por 5 para calcular a média. Para encerrar a digitação de notas,
 o usuário deve digitar -99. Depois imprima a quantidade de números digitados e a média das notas.*/

import java.util.Scanner;

public class Ex1{

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int nota = 0;
        int soma= 0;
        int quantidade = 0;

        System.out.println("******** Entre com as notas: ********");
        System.out.println("Para sair, digite -99: ");

        while(true){
            nota = leitura.nextInt();

            if (nota == -99) {
                break;
            }
            soma = soma + nota;
            quantidade++;
        }

        double media= soma / quantidade;

        System.out.println("Notas digitadas: " + quantidade);
        System.out.println("Média das notas : " + media);

    }
}
