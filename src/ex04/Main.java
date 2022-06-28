package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor = 0;
        int numDivisores = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro entre 3 e 999: ");
        valor = sc.nextInt();

        while (valor < 3 || valor > 999) {
            System.out.println("Valor incorreto, digite um valor inteiro entre 3 e 999: ");
            valor = sc.nextInt();;
        }

        for (int i = 3; i < valor ; i++){
            if (valor % i == 1 ){
                System.out.println("Entre os numeros 3 e " +valor + " são primos entre si os numeros: "+ i +" e " + valor);
            }
        }
    }
}
