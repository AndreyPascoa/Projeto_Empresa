import java.util.ArrayList;

public class Professor extends Funcionarios {
    
    private String urlCurriculoLattes;

    ArrayList<Disciplina> listaDisciplinas;

    public Professor(String urlCurriculoLattes, ArrayList<Disciplina> listaDisciplina) {
        this();
        this.urlCurriculoLattes = urlCurriculoLattes;
        this.listaDisciplinas = listaDisciplina;
    }

    public Professor(){
        listaDisciplinas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + "Curriculo: " + urlCurriculoLattes;
    }

    public void addDisciplina(Disciplina disciplina){
        listaDisciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina){
        listaDisciplinas.remove(disciplina);
    }

    public Disciplina getDisciplina(int index){
        return listaDisciplinas.get(index);
    }

    public void removerDisciplina(int index){
        listaDisciplinas.remove(index);
    }

}
