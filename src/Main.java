import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();

        int codigo, opc = 0;
        String nome, cpf, curso, funcao, ra, setor, urlCurriculoLattes;
        double salario;

        while(opc != 7){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Inserir aluno\n2-Inserir professor\n3-Inserir Atendent\n4-Inserir aluno\n5-Adicionar disciplina ao professor\n6-Mostrar pessoas\n7-Sair"));
            switch(opc){
                case 1:
                                        
                break;
            }
        }
    }
}
