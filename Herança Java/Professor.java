public class Professor extends Pessoa{
    protected Double salario;
    protected String nomeCurso;


    public Professor(){
        super();

    }

    public Professor(String nome, String endereco, String telefone, String cpf, Double salario, String nomeCurso){
        super(nome, endereco, telefone, cpf); 
        this.salario = salario;
        this.nomeCurso = nomeCurso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public String obterEtiquetaEndereco(){

        String s = "Endereço do Professor: ";

        s += this.getEndereco();

        return s;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", endereco = " + endereco + ", telefone = " + telefone + ", cpf = " + cpf + ", salario = " + salario + ", nomeCurso = " + nomeCurso;
    }

    

    

}

    





