// Classe Vendedor que herda de Pessoa
class Vendedor extends Pessoa {
    private double salarioBase;          // Salário base do vendedor
    private double percentualComissao;   // Percentual de comissão do vendedor
    private String dataContratacao;      // Data de contratação do vendedor

    // Construtor da classe Vendedor
    public Vendedor(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, double percentualComissao) {
        super(nome, cpf, dataNascimento); // Chama o construtor da classe base Pessoa para inicializar os atributos herdados
        this.dataContratacao = dataContratacao; // Inicializa o atributo data de contratação com o valor fornecido
        this.salarioBase = salarioBase;          // Inicializa o atributo salário base com o valor fornecido
        this.percentualComissao = percentualComissao; // Inicializa o atributo percentual de comissão com o valor fornecido
    }

    // Método que exibe os dados do vendedor
    @Override
    public void mostrarDados() {
        System.out.println("Vendedor:"); // Imprime a identificação do vendedor
        System.out.println("Nome: " + getNome()); // Chama o método getNome() da classe base para obter o nome
        System.out.println("CPF: " + getCpf()); // Chama o método getCpf() da classe base para obter o CPF
        System.out.println("Data de Nascimento: " + getDataNascimento()); // Chama o método getDataNascimento() para obter a data de nascimento
        System.out.println("Data de Contratação: " + dataContratacao); // Exibe a data de contratação do vendedor
        System.out.println("Salário Base: " + salarioBase); // Exibe o salário base do vendedor
        System.out.println("Percentual de Comissão: " + percentualComissao + "%"); // Exibe o percentual de comissão do vendedor
    }
}
