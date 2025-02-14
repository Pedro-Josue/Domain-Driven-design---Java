import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, endereco;
        int idade;
        System.out.println("Digite o seu nome");
        nome = scanner.nextLine();
        System.out.println("Digite a sua idade");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o seu endereço");
        endereco = scanner.nextLine();
        System.out.println("Olá " + nome + " que tem " + idade + " anos e mora em " + endereco);
        scanner.close();
    }
}