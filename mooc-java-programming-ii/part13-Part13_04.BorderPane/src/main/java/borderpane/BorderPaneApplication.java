package borderpane;


import javafx.scene.control.Label;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application{


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage stage) {
        
        Label label = new Label ("NORTH");
        Label label1 = new Label ("EAST");
        Label label2 = new Label ("SOUTH");

   
        BorderPane layout = new BorderPane();
        layout.setTop(label);
        layout.setRight(label1);
        layout.setBottom(label2);
        
        Scene view = new Scene(layout);
        
        
        stage.setScene(view);
        stage.show();
    }

}
