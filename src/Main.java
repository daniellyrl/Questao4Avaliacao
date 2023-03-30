import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente c1 = new Cliente();
        System.out.println("Olá. você deseja realizar uma operação de saque ou depósito? \n" +
                "Se deseja realizar depósito digite 1, mas se desejar realizar saque digite 2");
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Você escolheu a opção de depósito.");
                System.out.println("Qual o valor que voce deseja depositar? ");
                c1.setValor(sc.nextInt());
                System.out.println("Operação realizada com sucesso.");
                break;
            case 2:
                System.out.println("Você escolheu a opção de saque.");
                System.out.println("Qual o valor que você tem no saldo da sua conta?");
                c1.setSaldo(sc.nextInt());
                System.out.println("Qual o valor que deseja sacar? ");
                c1.setValor(sc.nextInt());
                System.out.println("O saldo presente na conta é: " + c1.getSaldo());

                if (c1.getSaldo() < c1.getValor()){
                    System.out.println("Saldo insuficiente");
                }else {
                    System.out.println("Saldo suficiente");
                }
                System.out.println("Operação realizada com sucesso?");
                break;
        }
    }
}
