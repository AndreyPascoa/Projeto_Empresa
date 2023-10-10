public class Disciplina {

    private int codigo;
    private String nome;

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Disciplina(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "Nome: " + nome;
    }
    
}
