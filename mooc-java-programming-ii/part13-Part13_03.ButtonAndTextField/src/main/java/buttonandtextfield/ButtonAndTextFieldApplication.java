package buttonandtextfield;

import javafx.scene.control.Label;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
       launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        TextField field = new TextField("sup: ");
        Button button = new Button("sup");
        
        
   
        FlowPane layout = new FlowPane();
        
        layout.getChildren().add(field);
        layout.getChildren().add(button);
        
        
        Scene view = new Scene(layout);
        
        
        stage.setScene(view);
        stage.show();
    }

}
