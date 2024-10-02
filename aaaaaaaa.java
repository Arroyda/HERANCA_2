import java.util.Scanner;

// Classe base Pessoa
abstract class Pessoa {
    private String nome;        // Nome da pessoa
    private String cpf;         // CPF da pessoa
    private String dataNascimento; // Data de nascimento da pessoa

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;                 // Inicializa o atributo nome
        this.cpf = cpf;                   // Inicializa o atributo cpf
        this.dataNascimento = dataNascimento; // Inicializa o atributo data de nascimento
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // Método abstrato para mostrar os dados da pessoa
    public abstract void mostrarDados();
}

// Classe Vendedor que herda de Pessoa
class Vendedor extends Pessoa {
    private double salarioBase;     // Salário base do vendedor
    private double percentualComissao; // Percentual de comissão do vendedor
    private String dataContratacao; // Data de contratação do vendedor

    public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
        super(nome, cpf, dataNascimento); // Chama o construtor da classe base
        this.dataContratacao = dataContratacao; // Inicializa o atributo data de contratação
        this.salarioBase = salarioBase;          // Inicializa o atributo salário base
        this.percentualComissao = percentualComissao; // Inicializa o atributo percentual de comissão
    }

    @Override
    public void mostrarDados() {
        System.out.println("Vendedor:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Percentual de Comissão: " + percentualComissao + "%");
    }
}

// Classe Gerente que herda de Pessoa
class Gerente extends Pessoa {
    private double salarioBase;     // Salário base do gerente
    private String departamento;    // Departamento do gerente
    private String dataContratacao; // Data de contratação do gerente

    public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNascimento); // Chama o construtor da classe base
        this.dataContratacao = dataContratacao; // Inicializa o atributo data de contratação
        this.salarioBase = salarioBase;          // Inicializa o atributo salário base
        this.departamento = departamento;        // Inicializa o atributo departamento
    }

    @Override
    public void mostrarDados() {
        System.out.println("Gerente:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Departamento: " + departamento);
    }
}

// Classe Cliente que herda de Pessoa
class Cliente extends Pessoa {
    private String email;                     // Email do cliente
    private String numeroCartaoFidelidade;   // Número do cartão de fidelidade
    private String telefone;                   // Telefone do cliente

    public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento); // Chama o construtor da classe base
        this.email = email;                     // Inicializa o atributo email
        this.numeroCartaoFidelidade = numeroCartaoFidelidade; // Inicializa o atributo número do cartão de fidelidade
        this.telefone = telefone;               // Inicializa o atributo telefone
    }

    @Override
    public void mostrarDados() {
        System.out.println("Cliente:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Email: " + email);
        System.out.println("Número do Cartão de Fidelidade: " + numeroCartaoFidelidade);
        System.out.println("Telefone: " + telefone);
    }
}

// Classe principal para testar
public class SistemaEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de cadastro:");
        System.out.println("1 - Vendedor");
        System.out.println("2 - Gerente");
        System.out.println("3 - Cliente");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        switch (tipo) {
            case 1: // Cadastro de Vendedor
                System.out.print("Nome: ");
                String nomeVendedor = scanner.nextLine();
                System.out.print("CPF: ");
                String cpfVendedor = scanner.nextLine();
                System.out.print("Data de Nascimento: ");
                String dataNascimentoVendedor = scanner.nextLine();
                System.out.print("Data de Contratação: ");
                String dataContratacaoVendedor = scanner.nextLine();
                System.out.print("Salário Base: ");
                double salarioBaseVendedor = scanner.nextDouble();
                System.out.print("Percentual de Comissão: ");
                double percentualComissao = scanner.nextDouble();

                Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, dataNascimentoVendedor, dataContratacaoVendedor, salarioBaseVendedor, percentualComissao);
                vendedor.mostrarDados();
                break;

            case 2: // Cadastro de Gerente
                System.out.print("Nome: ");
                String nomeGerente = scanner.nextLine();
                System.out.print("CPF: ");
                String cpfGerente = scanner.nextLine();
                System.out.print("Data de Nascimento: ");
                String dataNascimentoGerente = scanner.nextLine();
                System.out.print("Data de Contratação: ");
                String dataContratacaoGerente = scanner.nextLine();
                System.out.print("Salário Base: ");
                double salarioBaseGerente = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer
                System.out.print("Departamento: ");
                String departamento = scanner.nextLine();

                Gerente gerente = new Gerente(nomeGerente, cpfGerente, dataNascimentoGerente, dataContratacaoGerente, salarioBaseGerente, departamento);
                gerente.mostrarDados();
                break;

            case 3: // Cadastro de Cliente
                System.out.print("Nome: ");
                String nomeCliente = scanner.nextLine();
                System.out.print("CPF: ");
                String cpfCliente = scanner.nextLine();
                System.out.print("Data de Nascimento: ");
                String dataNascimentoCliente = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Número do Cartão de Fidelidade: ");
                String numeroCartaoFidelidade = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                Cliente cliente = new Cliente(nomeCliente, cpfCliente, dataNascimentoCliente, email, numeroCartaoFidelidade, telefone);
                cliente.mostrarDados();
                break;

            default:
                System.out.println("Tipo de cadastro inválido.");
        }

        scanner.close(); // Fecha o scanner
    }
}
