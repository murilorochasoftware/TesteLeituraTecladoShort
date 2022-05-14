import java.util.Scanner;

public class TesteLeituraTecladoShort {

    public static void main(String[] args) {
        short dadoShortDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dado do tipo short e aperte a tecla enter:");
        dadoShortDigitado = scanner.nextShort();

        System.out.printf("O dado do tipo short digitado foi: %d", dadoShortDigitado);
    }
}
