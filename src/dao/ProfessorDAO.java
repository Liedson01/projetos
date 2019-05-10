/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Professor;

/**
 *
 * @author igor soares
 */
public class ProfessorDAO {
    public void salvar(Professor professor){
      Connection con = Conexao.getConnection();
      PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO prof (telefone, nome, sexo, projetos) VALUES (?, ?, ?, ?)");
            ps.setInt(1, professor.getTelefone());
            ps.setString(2, professor.getNome());
            ps.setString(3, professor.getSexo());
            ps.setString(4, professor.getProjeto());
            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }finally{
            Conexao.fecharConexao(con, ps);
    }
    }
}
