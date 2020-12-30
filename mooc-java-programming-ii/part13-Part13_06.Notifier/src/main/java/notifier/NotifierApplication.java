package notifier;
import javafx.scene.control.Label;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
            
        TextField field = new TextField();         // textarea is just textfield, but can type multiple lines. 
        Button button = new Button("Update");
        Label label1 = new Label("");
     
        
        
   
        VBox box = new VBox();
        box.getChildren().add(field);
        box.getChildren().add(button);
        box.getChildren().add(label1);


       
        
        button.setOnAction(event -> {       // action handler on button. lamba expression
            label1.setText(field.getText());
        });
        
        Scene view = new Scene(box);
        stage.setScene(view);
        stage.show();
    }

}
