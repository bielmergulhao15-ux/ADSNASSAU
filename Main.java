import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = teclado.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Digite seu CPF: ");
        long cpf = teclado.nextLong();


        Cliente cliente1 = new Cliente(nome, idade, endereco, cpf);

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("CPF: " + cliente1.getCpf());

        teclado.close();
    }
}