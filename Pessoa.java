// Classe base Pessoa
abstract class Pessoa {
    private String nome;                // Nome da pessoa
    private String cpf;                 // CPF da pessoa
    private String dataNascimento;      // Data de nascimento da pessoa

    // Construtor da classe Pessoa
    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;               // Inicializa o atributo nome com o valor fornecido
        this.cpf = cpf;                 // Inicializa o atributo cpf com o valor fornecido
        this.dataNascimento = dataNascimento; // Inicializa o atributo data de nascimento com o valor fornecido
    }

    // Métodos getters para acessar os atributos
    public String getNome() {
        return nome; // Retorna o nome da pessoa
    }

    public String getCpf() {
        return cpf; // Retorna o CPF da pessoa
    }

    public String getDataNascimento() {
        return dataNascimento; // Retorna a data de nascimento da pessoa
    }

    // Método abstrato para mostrar os dados da pessoa
    public abstract void mostrarDados(); // Deve ser implementado pelas classes filhas
}
