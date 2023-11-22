import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Nome do usuario
        System.out.println("Qual o seu nome?");
        String name = reader.nextLine();
        //Tipo de conta do usuario
        System.out.println("Qual seu tipo de conta?");
        String tipoDeConta = reader.nextLine();
        //Saldo da conta
        double saldoDaConta = 2500.00;
        //Dados inicias
        String dadosInicias = """
                **********************************
                Dados inicias do cliente
                
                Nome:               %s.
                Tipo de conta:      %s.
                Saldo da conta:     R$ %.2f.
                **********************************
                """.formatted(name, tipoDeConta, saldoDaConta);
        System.out.println(dadosInicias);
        //Operações que podem ser realizadas usando.
        int option = 0;
        while (option != 4) {
            String menu = """
                        Operações
                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Trasferir valor
                    4- Sair
                    """;
            System.out.println(menu);
            //Escolha de uma das opções
            System.out.println("Digite a opção desejada:");
            option = reader.nextInt();
            //Casos possiveis para cada opção
            switch (option) {
                case 1:
                    System.out.printf("Seu saldo é de R$ %.2f%n", saldoDaConta);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber");
                    double valorReceber = reader.nextDouble();
                    saldoDaConta += valorReceber;
                    break;
                case 3:
                    System.out.println("Informe o valor que dejesa transferir");
                    double transferirValor = reader.nextDouble();
                    if (saldoDaConta < transferirValor || saldoDaConta == 0) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldoDaConta -= transferirValor;
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Operação invalida.");
                    break;
            }
        }

    }
}
