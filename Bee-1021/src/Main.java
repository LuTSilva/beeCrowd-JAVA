import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // defininido como serão considerados os valores, transformados em centavos
        final int NOTA_100 = 10000;
        final int NOTA_50 = 5000;
        final int NOTA_20 = 2000;
        final int NOTA_10 = 1000;
        final int NOTA_5 = 500;
        final int NOTA_2 = 200;
        final int MOEDA_100 = 100;
        final int MOEDA_050 = 50;
        final int MOEDA_025 = 25;
        final int MOEDA_010 = 10;
        final int MOEDA_005 = 5;
        final int MOEDA_001 = 1;

        double n = sc.nextDouble();
        // transformando o valor informado pelo usuário em centavos
        int valor  = (int) (n * MOEDA_100);

        // calculo
        int nota100 = valor / NOTA_100; valor %= NOTA_100;
        int nota50 = valor / NOTA_50;   valor %= NOTA_50;
        int nota20 = valor / NOTA_20;   valor %= NOTA_20;
        int nota10 = valor / NOTA_10;   valor %= NOTA_10;
        int nota5 = valor / NOTA_5;     valor %= NOTA_5;
        int nota2 = valor / NOTA_2;     valor %= NOTA_2;

        int moeda100 = valor / MOEDA_100; valor %= MOEDA_100;
        int moeda050 = valor / MOEDA_050; valor %= MOEDA_050;
        int moeda025 = valor / MOEDA_025; valor %= MOEDA_025;
        int moeda010 = valor / MOEDA_010; valor %= MOEDA_010;
        int moeda005 = valor / MOEDA_005; valor %= MOEDA_005;
        int moeda001 = valor / MOEDA_001;


        System.out.println("NOTAS:"
                + "\n" + nota100 + " nota(s) de R$ 100.00"
                + "\n" + nota50 + " nota(s) de R$ 50.00"
                + "\n" + nota20 + " nota(s) de R$ 20.00"
                + "\n" + nota10 + " nota(s) de R$ 10.00"
                + "\n" + nota5 + " nota(s) de R$ 5.00"
                + "\n" + nota2 + " nota(s) de R$ 2.00"
                + "\n" + "MOEDAS:"
                + "\n" + moeda100 + " moeda(s) de R$ 1.00"
                + "\n" + moeda050 + " moeda(s) de R$ 0.50"
                + "\n" + moeda025 + " moeda(s) de R$ 0.25"
                + "\n" + moeda010 + " moeda(s) de R$ 0.10"
                + "\n" + moeda005 + " moeda(s) de R$ 0.05"
                + "\n" + moeda001 + " moeda(s) de R$ 0.01");

        sc.close();
    }
}