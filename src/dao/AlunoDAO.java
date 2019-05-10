
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;

public class AlunoDAO {
   
    public void salvar(Aluno aluno){
      Connection con = Conexao.getConnection();
      PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO alunos(numero, nome, sexo, projeto) VALUES (?, ?, ?, ?)");
            ps.setInt(1, aluno.getNumero());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getSexo());
            ps.setString(4, aluno.getProjeto());
            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }finally{
            Conexao.fecharConexao(con, ps);
    }
    }
    }
   
