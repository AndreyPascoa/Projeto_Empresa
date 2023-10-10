public class Alunos extends Pessoa {
    
    private String ra;
    private String curso;
    
    public Alunos(String nome, String cpf, String ra, String curso) {
        super(nome, cpf);
        this.ra = ra;
        this.curso = curso;
    }

    public Alunos() {
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString(){
        return super.toString() + "Ra:\n" + ra + "Curso:\n" + curso;
    }

}
