/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AlunoDAO;
import dao.ProfessorDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.Aluno;
import model.Professor;
import view.Palco;

/**
 * FXML Controller class
 *
 * @author Liedson
 */
public class FXMLCadastrarProfController implements Initializable {

  
    @FXML
    private Button rbSair;

    @FXML
    private RadioButton rbF;

    @FXML
    private Button rbCadastrar;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtNumero;

    @FXML
    private RadioButton rbM;

    @FXML
    private TextField txtProjeto;

    @FXML
    void salvar(ActionEvent event) {
        Professor professor = new Professor();
         ProfessorDAO dao = new ProfessorDAO();
        professor.setTelefone(Integer.parseInt(txtNumero.getText()));
        professor.setNome(txtNome.getText());
        if(rbM.isSelected()){
            professor.setSexo("M");            
        }else if(rbF.isSelected()){
             professor.setSexo("F");
        }
        professor.setProjeto(txtProjeto.getText());
       
        dao.salvar(professor);
    }

    @FXML
    void sair(ActionEvent event) {
        Palco.trocaTela("menu");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
