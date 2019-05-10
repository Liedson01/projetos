
package controller;


import dao.AlunoDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.Aluno;

import view.Palco;

/**
 * FXML Controller class
 *
 * @author Liedson
 */
public class FXMLCadastroAlunoController{

    @FXML
    private RadioButton rbF;

    @FXML
    private Button btSair;
    @FXML
    private Button btSalvar;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtNumero;

    @FXML
    private RadioButton rbM;
    
    @FXML
    private TextField txtProjeto;

    @FXML
    void salvar() {
       Aluno aluno = new Aluno();
        AlunoDAO dao = new AlunoDAO();
        aluno.setNumero(Integer.parseInt(txtNumero.getText()));
        aluno.setNome(txtNome.getText());
        if(rbM.isSelected()){
            aluno.setSexo("M");            
        }else if(rbF.isSelected()){
             aluno.setSexo("F");
        }
        aluno.setProjeto(txtProjeto.getText());
       
        dao.salvar(aluno); 
    }
        @FXML
    void sair() {
        Palco.trocaTela("menu");

    }

    
    @FXML
    void cadastroProf(){
        Palco.trocaTela("professor");
    }
    
    
    
    
    
    
}
