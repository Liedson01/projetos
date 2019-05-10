
package view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;


public class Palco extends Application {
      public static Stage stage;
      public static Scene sceneMenu;
      public static Scene sceneAluno;
      private static Scene sceneProfessor;
    @Override
    public void start(Stage Pstage) throws IOException{
        stage = Pstage;
        
        
       Parent viewMenu = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
       sceneMenu = new Scene(viewMenu);
        
        
        Parent viewAluno = FXMLLoader.load(getClass().getResource("FXMLCadastroAluno.fxml"));
        sceneAluno = new Scene(viewAluno);
        
         Parent viewProfessor = FXMLLoader.load(getClass().getResource("FXMLCadastrarProf.fxml"));
         sceneProfessor = new Scene(viewProfessor);
        
        
        stage.setTitle("Menu");
        stage.setScene(sceneMenu);
        stage.setResizable(false);
        stage.show();
    }
    public static void trocaTela(String op){
        switch (op){
            case "menu":
                stage.setTitle("Menu");
                stage.setScene(sceneMenu);
                break;         
            case "aluno":
                stage.setTitle("Cadastrar Aluno");
                   stage.setScene(sceneAluno);break;
            case "professor":
                stage.setTitle("Cadastrar Professor");
                stage.setScene(sceneProfessor);
                break;
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
