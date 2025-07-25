ppackage com.mycompany.formulario01;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        
        AnchorPane pane = new AnchorPane();
        pane.setPrefSize(400, 300);
        
        TextField txNome = new TextField();
        pane.getChildren().add(txNome);
        
        TextField txSenha = new TextField();
        txSenha.setPromptText("Adicione sua senha");
        pane.getChildren().add(txSenha);
        
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
        
        txNome.setLayoutX( (pane.getWidth() - txNome.getWidth()) / 2);
        txNome.setLayoutY(50);
        
        txSenha.setLayoutX( (pane.getWidth() - txSenha.getWidth()) / 2);
        txSenha.setLayoutY(100);
    }
    public static void main(String []args){
        launch(args);
    }
}
