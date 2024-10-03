import java.util.Scanner; // Importa a classe Scanner para leitura de entradas do usuário

// Classe principal para testar
public class Heranca2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler dados do usuário

        // Menu para o usuário escolher o tipo de cadastro
        System.out.println("Escolha o tipo de cadastro:");
        System.out.println("1 - Vendedor");
        System.out.println("2 - Gerente");
        System.out.println("3 - Cliente");
        int tipo = scanner.nextInt(); // Lê a escolha do usuário
        scanner.nextLine(); // Limpa o buffer do Scanner para evitar problemas com a leitura de strings

        // Switch para tratar cada tipo de cadastro
        switch (tipo) {
            case 1: // Cadastro de Vendedor
                System.out.print("\n\nNome: ");
                String nomeVendedor = scanner.nextLine(); // Lê o nome do vendedor
                System.out.print("CPF: ");
                String cpfVendedor = scanner.nextLine(); // Lê o CPF do vendedor
                System.out.print("Data de Nascimento: ");
                String dataNascimentoVendedor = scanner.nextLine(); // Lê a data de nascimento do vendedor
                System.out.print("Data de Contratação: ");
                String dataContratacaoVendedor = scanner.nextLine(); // Lê a data de contratação do vendedor
                System.out.print("Salário Base: ");
                double salarioBaseVendedor = scanner.nextDouble(); // Lê o salário base do vendedor
                System.out.print("Percentual de Comissão: ");
                double percentualComissao = scanner.nextDouble(); // Lê o percentual de comissão do vendedor

                // Cria uma nova instância de Vendedor e exibe os dados
                Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, dataNascimentoVendedor, dataContratacaoVendedor, salarioBaseVendedor, percentualComissao);
                vendedor.mostrarDados(); // Chama o método para mostrar os dados do vendedor
                break;

            case 2: // Cadastro de Gerente
                System.out.print("\n\nNome: ");
                String nomeGerente = scanner.nextLine(); // Lê o nome do gerente
                System.out.print("CPF: ");
                String cpfGerente = scanner.nextLine(); // Lê o CPF do gerente
                System.out.print("Data de Nascimento: ");
                String dataNascimentoGerente = scanner.nextLine(); // Lê a data de nascimento do gerente
                System.out.print("Data de Contratação: ");
                String dataContratacaoGerente = scanner.nextLine(); // Lê a data de contratação do gerente
                System.out.print("Salário Base: ");
                double salarioBaseGerente = scanner.nextDouble(); // Lê o salário base do gerente
                scanner.nextLine(); // Limpa o buffer
                System.out.print("Departamento: ");
                String departamento = scanner.nextLine(); // Lê o departamento do gerente

                // Cria uma nova instância de Gerente e exibe os dados
                Gerente gerente = new Gerente(nomeGerente, cpfGerente, dataNascimentoGerente, dataContratacaoGerente, salarioBaseGerente, departamento);
                gerente.mostrarDados(); // Chama o método para mostrar os dados do gerente
                break;

            case 3: // Cadastro de Cliente
                System.out.print("\n\nNome: ");
                String nomeCliente = scanner.nextLine(); // Lê o nome do cliente
                System.out.print("CPF: ");
                String cpfCliente = scanner.nextLine(); // Lê o CPF do cliente
                System.out.print("Data de Nascimento: ");
                String dataNascimentoCliente = scanner.nextLine(); // Lê a data de nascimento do cliente
                System.out.print("Email: ");
                String email = scanner.nextLine(); // Lê o email do cliente
                System.out.print("Número do Cartão de Fidelidade: ");
                String numeroCartaoFidelidade = scanner.nextLine(); // Lê o número do cartão de fidelidade
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine(); // Lê o telefone do cliente

                // Cria uma nova instância de Cliente e exibe os dados
                Cliente cliente = new Cliente(nomeCliente, cpfCliente, dataNascimentoCliente, email, numeroCartaoFidelidade, telefone);
                cliente.mostrarDados(); // Chama o método para mostrar os dados do cliente
                break;

            default:
                System.out.println("Tipo de cadastro inválido."); // Mensagem para escolha inválida
        }

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}
