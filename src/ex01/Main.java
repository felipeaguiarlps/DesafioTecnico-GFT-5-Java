package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de linhas da Matriz");
        int n = sc.nextInt();

        System.out.println("Digite o valor de colunas da Matriz");
        int m = sc.nextInt();

        int [][] matriz = new int [n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                System.out.println("Digite um numero: ");
                matriz[i][j] = sc.nextInt() ;
                }
            }




    }
}
