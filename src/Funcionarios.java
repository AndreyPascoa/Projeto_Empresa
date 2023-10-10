public class Funcionarios extends Pessoa {

    private int numeroCracha;
    private double salario;
    
    public Funcionarios(String nome, String cpf, int numeroCracha, double salario) {
        super(nome, cpf);
        this.numeroCracha = numeroCracha;
        this.salario = salario;
    }

    public Funcionarios() {
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return super.toString() + "Numero do cracha:\n" + numeroCracha + "Salario:\n" + salario;
    }
    
}
