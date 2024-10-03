// Classe Gerente que herda de Pessoa
class Gerente extends Pessoa {
    private double salarioBase;     // Salário base do gerente
    private String departamento;    // Departamento do gerente
    private String dataContratacao; // Data de contratação do gerente

    // Construtor da classe Gerente
    public Gerente(String nome, String cpf, String dataNascimento, String dataContratacao, double salarioBase, String departamento) {
        super(nome, cpf, dataNascimento); // Chama o construtor da classe base Pessoa para inicializar nome, cpf e data de nascimento
        this.dataContratacao = dataContratacao; // Inicializa o atributo data de contratação com o valor fornecido
        this.salarioBase = salarioBase;          // Inicializa o atributo salário base com o valor fornecido
        this.departamento = departamento;        // Inicializa o atributo departamento com o valor fornecido
    }

    // Método que exibe os dados do gerente
    @Override
    public void mostrarDados() {
        System.out.println("Gerente:"); // Imprime a identificação do gerente
        System.out.println("Nome: " + getNome()); // Chama o método getNome() da classe base para obter o nome
        System.out.println("CPF: " + getCpf()); // Chama o método getCpf() da classe base para obter o CPF
        System.out.println("Data de Nascimento: " + getDataNascimento()); // Chama o método getDataNascimento() para obter a data de nascimento
        System.out.println("Data de Contratação: " + dataContratacao); // Exibe a data de contratação do gerente
        System.out.println("Salário Base: " + salarioBase); // Exibe o salário base do gerente
        System.out.println("Departamento: " + departamento); // Exibe o departamento do gerente
    }
}
