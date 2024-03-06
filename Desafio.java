public class Desafio {

    public static void main(String[] args) {

        // Número 1
        // Resposta: 91
        varSoma();

        // Número 2
        pertenceFibonacci(0);
        pertenceFibonacci(9);
        pertenceFibonacci(21);
        pertenceFibonacci(50);

        // Número 3
        /*
        *   a) 1, 3, 5, 7, ___
        *        Resposta: 1, 3, 5, 7, 9
        *
        *    b) 2, 4, 8, 16, 32, 64, ____
        *        Resposta: 2, 4, 8, 16, 32, 64, 128
        *
        *   c) 0, 1, 4, 9, 16, 25, 36, ____
        *        Resposta: 0, 1, 4, 9, 16, 25, 36, 49
        *
        *    d) 4, 16, 36, 64, ____
        *        Resposta: 4, 16, 36, 64, 100
        *
        *    e) 1, 1, 2, 3, 5, 8, ____
        *        Resposta: 1, 1, 2, 3, 5, 8, 13
        *
        *    f) 2, 10, 12, 16, 17, 18, 19, ____
        *        Resposta: 2, 10, 12, 16, 17, 18, 19, 200
        *
        * */


        // Número 4
        /*
        * Acenderia uma lâmpada, e a deixaria ligada por alguns minutos, e a desligaria em seguida.
        * Deixaria um segundo interruptor ligado.
        * Iria à uma sala. Se a lâmpada estiver desligada e quente, pertence ao primeiro interruptor que eu liguei.
        * Se estiver ligada, pertence ao segundo interruptor. Se estiver desligada e fria, pertence ao
        * último interruptor, o qual eu não liguei.
        * Aplicaria essa mesma lógica na segunda sala, descobrindo, assim, a qual sala cada interruptor pertence.
        * */

        // Número 5
        System.out.println(inverteString("laranja"));
        System.out.println(inverteString("Ribeirão Preto"));
        System.out.println(inverteString("Socorram-me Subi No Ônibus Em Marrocos"));
    }


    // Número 1
    public static void varSoma() {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }

        System.out.println(soma); // Resposta: 91
    }

    // Número 2
    public static boolean pertenceFibonacci(int num) {

        StringBuilder sequencia = new StringBuilder();

        if (num < 0) {
            return false;
        } else if (num == 0) {
            sequencia.append("0 ");
            System.out.println("O número %d pertence à sequência Fibonacci\n--> %s".formatted(num, sequencia));
            return true;
        } else if (num == 1) {
            sequencia.append("0 1 ");
            System.out.println("O número %d pertence à sequência Fibonacci\n--> %s".formatted(num, sequencia));
            return true;
        } else {
            sequencia.append("0 1 ");

            int ultimo = 1;
            int penultimo = 0;
            int proximo = 1;

            while (ultimo + penultimo <= num) {

                proximo = ultimo + penultimo;

                sequencia.append(" " + proximo + " ");

                penultimo = ultimo;
                ultimo = proximo;

                if (proximo == num) {
                    System.out.println("O número %d pertence à sequência Fibonacci\n--> %s".formatted(num, sequencia));
                    return true;
                }
            }

            sequencia.append(" %d ".formatted(ultimo + penultimo));

            System.out.println("O número %d NÃO pertence à sequência Fibonacci\n--> %s".formatted(num, sequencia));

            return false;
        }
    }

    // Número 5
    public static String inverteString(String str) {

        StringBuilder newStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }

        return newStr.toString();
    }
}
