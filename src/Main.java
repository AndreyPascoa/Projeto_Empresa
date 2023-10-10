import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        
        ArrayList <Pessoa> listaPessoa = new ArrayList<>();
        ArrayList <Disciplina> listaDisciplina = new ArrayList<>();

        int codigo, opc = 0;
        String nome, cpf, curso, funcao, ra, setor, urlCurriculoLattes;
        Disciplina disciplina = null;


        while(opc != 7){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Inserir aluno\n2-Inserir professor\n3-Inserir Atendent\n4-Inserir aluno\n5-Adicionar disciplina ao professor\n6-Mostrar pessoas\n7-Sair"));
            if(opc == 4){
                String msg = "";
                for(Disciplina D : listaDisciplina){
                    msg += D;
                }
                codigo = Integer.parseInt(JOptionPane.showInputDialog(msg + "Codigo do curso:"));
                for(Disciplina D : listaDisciplina){
                    if(D.getCodigo() == codigo){
                        disciplina = D;
                    }
                }
                if(disciplina == null)
                    continue;
            }
            switch(opc){
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
                    nome = JOptionPane.showInputDialog("Nome do Curso");    
                    listaDisciplina.add(new Disciplina(codigo, nome));            
                break;
                case 2:
                    nome = JOptionPane.showInputDialog("Nome");
                    cpf = JOptionPane.showInputDialog("CPF");
                    urlCurriculoLattes = JOptionPane.showInputDialog("Informe sua Expecializacao");
                    listaPessoa.add(new Professor(nome, cpf, urlCurriculoLattes));
                break;
                case 3:
                    nome = JOptionPane.showInputDialog("Nome");
                    cpf = JOptionPane.showInputDialog("CPF");
                    setor = JOptionPane.showInputDialog("Setor");
                    funcao = JOptionPane.showInputDialog("Funcao");
                    listaPessoa.add(new Atedente(nome, cpf, setor, funcao));
                break;
                case 4:
                    nome = JOptionPane.showInputDialog("Nome");
                    cpf = JOptionPane.showInputDialog("CPF");
                    ra = JOptionPane.showInputDialog("RA");
                    curso = JOptionPane.showInputDialog("Curso");
                    listaPessoa.add(new Alunos(nome, cpf, ra, curso));
                break;
                case 5:
                    cpf = JOptionPane.showInputDialog("Informe o CPF do Professor:");
                    Professor professor = null;
                    for (Pessoa p : listaPessoa) {
                        if (p instanceof Professor && p.getCpf().equals(cpf)) {
                            professor = (Professor) p;
                            break;
                        }
                    }
                    if (professor == null) {
                        JOptionPane.showMessageDialog(null, "Professor não encontrado.");
                        continue;
                    }
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da disciplina:"));
                    disciplina = null;
                    for (Disciplina d : listaDisciplina) {
                        if (d.getCodigo() == codigo) {
                            disciplina = d;
                            break;
                        }
                    }
                    if (disciplina == null) {
                        JOptionPane.showMessageDialog(null, "Disciplina não encontrada com o código fornecido.");
                        continue;
                    }
                    professor.addDisciplina(disciplina);
                    JOptionPane.showMessageDialog(null, "Disciplina adicionada com sucesso ao professor.");
                break;
                case 6:
                    String msg = "";
                    for(Pessoa P : listaPessoa){
                        msg += P;
                    }
                    JOptionPane.showMessageDialog(null, msg);
                break;
                case 7:
                break;
            }
        }
    }
}
