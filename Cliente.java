// Classe Cliente que herda de Pessoa
class Cliente extends Pessoa {
    private String email;                     // Email do cliente
    private String numeroCartaoFidelidade;   // Número do cartão de fidelidade
    private String telefone;                   // Telefone do cliente

    // Construtor da classe Cliente
    public Cliente(String nome, String cpf, String dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        super(nome, cpf, dataNascimento); // Chama o construtor da classe base Pessoa para inicializar nome, cpf e data de nascimento
        this.email = email;                     // Inicializa o atributo email com o valor passado como parâmetro
        this.numeroCartaoFidelidade = numeroCartaoFidelidade; // Inicializa o atributo número do cartão de fidelidade
        this.telefone = telefone;               // Inicializa o atributo telefone com o valor passado como parâmetro
    }

    // Método que exibe os dados do cliente
    @Override
    public void mostrarDados() {
        System.out.println("\n\nCliente:"); // Imprime a identificação do cliente
        System.out.println("Nome: " + getNome()); // Chama o método getNome() da classe base para obter o nome
        System.out.println("CPF: " + getCpf()); // Chama o método getCpf() da classe base para obter o CPF
        System.out.println("Data de Nascimento: " + getDataNascimento()); // Chama o método getDataNascimento() para obter a data de nascimento
        System.out.println("Email: " + email); // Exibe o email do cliente
        System.out.println("Número do Cartão de Fidelidade: " + numeroCartaoFidelidade); // Exibe o número do cartão de fidelidade
        System.out.println("Telefone: " + telefone); // Exibe o telefone do cliente
    }
}
