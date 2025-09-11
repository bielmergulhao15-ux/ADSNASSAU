class Cliente {
    private String nome;
    private int idade;
    private String endereco;
    private long cpf; // melhor usar long, pois CPF não é número para cálculos

    public Cliente(String nome, int idade, String endereco, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public long getCpf() {
        return cpf;
    }
}