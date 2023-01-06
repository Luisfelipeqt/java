
public class Aluno extends Pessoa{ 
    private String curso;
    private Double[] notas;

    public Aluno(){
        super();

    }

    public Aluno(String nome, String endereco, String telefone, String cpf, String curso, Double[] notas){
        super(nome, endereco, telefone, cpf);
        this.curso = curso;
        this.notas = notas;
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
   
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Double[] getNotas() {
        return notas;
    }
    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }

    @Override
    public String obterEtiquetaEndereco(){

        String s = "Endereço do Aluno: ";

        s += this.getEndereco();

        return s;
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", endereco = " + endereco + ", telefone = " + telefone + ", cpf = " + cpf + ", curso = " + curso + ", notas = " + notas;
    }

}

