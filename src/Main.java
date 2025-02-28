import java.util.Scanner;

import static java.lang.System.out;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numero = 1;

        Scanner teclado = new Scanner(System.in);
        int op;

        do {
            out.println("--------------");
            out.println("Menu Principal");
            out.println("--------------");
            out.println("Selecione uma das opçoes abaixo");
            out.println("1 - Aluno");
            out.println("2 - Professor");
            out.println("3 - Coordenador");
            out.println("0 - Sair");


            out.println("Digite uma Opção: ");
            op = teclado.nextInt();

            if (op == 0)
                break;

            switch (op) {
                case 1:
                    out.println("Você escolheu Aluno");
                break;

                case 2:
                    out.println("Você escolheu Professor");
                break;

                case 3:
                    out.println("Você escolheu Coordenador");
                break;

                default:
                    out.println("Você escolheu uma opção invalida");



            }

        } while (true);

        out.println("Fim");
    }
}