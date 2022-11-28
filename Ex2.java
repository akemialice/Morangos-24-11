/*Crie um programa que solicite ao usuário para digitar um número positivo.
 Depois faça a soma de todos os números antecessores até o número escolhido.
 Exemplo, caso o usuário escolha o número 5, você
 deverá somar: 1 + 2 + 3 + 4 + 5  e e imprimir o total de 15.*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[]args) {

        Scanner leitura = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        System.out.println("Digite um número:");
        numero =  leitura.nextInt();
        System.out.println("Numero digitado: " + numero);


        for(int ant = 0; ant <= numero; ant++){
            System.out.println("Antecessores: " + ant);
            soma = ant + soma;
        }
        System.out.println("A soma é:  " + soma);
    }
}
