public class Atedente extends Pessoa {
    
    private String setor;
    private String funcao;
    
    public Atedente(String nome, String cpf, String setor, String funcao) {
        super(nome, cpf);
        this.setor = setor;
        this.funcao = funcao;
    }

    public Atedente() {
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }
    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString(){
        return super.toString() + "Setor:\n" + setor + "Funcao:\n" + funcao;
    }
}
