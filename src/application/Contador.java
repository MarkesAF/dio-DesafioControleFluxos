package application;

import java.util.Scanner;

import Exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro Parâmetro: ");
            int parametroUm = in.nextInt();

            System.out.print("Digite o segundo Parâmetro: ");
            int parametroDois = in.nextInt();

            contar(parametroUm,parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
           throw new ParametrosInvalidosException("O Parâmetro Dois deve ser maior que o Parâmetro Um");
        }

        int contagem = parametroDois - parametroUm;
        for(int x = 1;x<=contagem;x++){
            System.out.println("Imprimindo o numero "+x);
        }
    }
}
