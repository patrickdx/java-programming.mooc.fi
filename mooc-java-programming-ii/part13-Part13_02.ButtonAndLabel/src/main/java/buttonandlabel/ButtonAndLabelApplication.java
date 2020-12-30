package buttonandlabel;

import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
       launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Label label = new Label("sup");
        Button button = new Button("sup");
        
        
   
        FlowPane layout = new FlowPane();
        
        layout.getChildren().add(label);
        layout.getChildren().add(button);
        
        
        Scene view = new Scene(layout);
        
        
        stage.setScene(view);
        stage.show();
    }

}
