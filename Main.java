import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldoTotal = 2500;
        int operacao = 0;
        double valor = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println("Nome:            Eduardo Fonseca");
        System.out.println("Tipo de conta:   Corrente");
        System.out.println("Saldo inicial:   R$ " + saldoTotal);
        System.out.println("********************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("Operações:");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println("");

        while (operacao < 4){
            System.out.println("Informe o numero da operação desejada:");
            operacao += input.nextInt();
            switch (operacao){
                case 1:
                    System.out.println(saldoTotal);
                    operacao = 0;
                    System.out.println(operacao);
                    break;

                case 2:
                    System.out.println("Informe o valor a receber:");
                    saldoTotal += input.nextInt();
                    System.out.println("Saldo atualizado: " + saldoTotal);
                    System.out.println("");
                    operacao = 0;
                    break;

                case 3:
                    System.out.println("Informe o valor a transferir:");
                    valor = input.nextInt();
                    if (valor > saldoTotal){
                        System.out.println("Saldo insuficiente para a operação!");
                    }else {
                        saldoTotal -= valor;
                        System.out.println("Saldo atualizado: " + saldoTotal);
                        System.out.println("");
                        valor = 0;
                    }
                    operacao = 0;
                    break;

                case 4:
                    break;
            }
            if (operacao > 4){
                System.out.println("comando invalido");
                operacao = 0;
            }
        }





    }
}