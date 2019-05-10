/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import view.Palco;

/**
 * FXML Controller class
 *
 * @author Liedson
 */
public class FXMLMenuController implements Initializable {

    
    @FXML
    private Button btnProfessor;

    @FXML
    private Button btnAluno;

    @FXML
    void cadastrarAluno(ActionEvent event) {
       Palco.trocaTela("aluno");
    }

    @FXML
    void cadastrarProfessor(ActionEvent event) {
        Palco.trocaTela("professor");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
