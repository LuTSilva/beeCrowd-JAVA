import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // definindo como serão considerados os dias contidos em um mês, e em um ano
        final int DIAS_ANO = 365;
        final int DIAS_MES = 30;

        // leitura do tempo, em dias
        int n = sc.nextInt();

        // calculo
        int diasAno = n / DIAS_ANO;
        int diasMes = (n % DIAS_ANO) / DIAS_MES;
        int dias = (n % DIAS_ANO) % DIAS_MES;

        // impressão do tempo
        System.out.println(diasAno + " ano(s)\n"
                + diasMes + " mes(es)\n"
                + dias + " dia(s)");

        sc.close();
    }
}