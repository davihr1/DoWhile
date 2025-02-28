import java.util.Scanner;
import static java.lang.System.*;

public class ExercicioFor {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner imput = new Scanner(System.in);

        out.println("Digite a nota 1");
        nota1 = imput.nextDouble();

        out.println("Digite a nota 2");
        nota2 = imput.nextDouble();

        media = (nota1 + nota2)/2;
        out.println("Sua média é: " + media);

        for ( int na = 1; na<=2; na++ ) {

            out.println("Aluno: " + na);
            out.println("Digite a nota 1");
            nota1 = imput.nextDouble();

            out.println("Digite a nota 2");
            nota2 = imput.nextDouble();

            media = (nota1 + nota2)/2;
            out.println("Sua média é: " + media);

        }
    }
}
