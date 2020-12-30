package textstatistics;
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
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{     // typical setup uses its base layout as BorderPane. 


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
         
        TextArea field = new TextArea("sup: ");         // textarea is just textfield, but can type multiple lines. 
        Label label = new Label("Letters: 0");
        Label label1 = new Label("Words: 0");
        Label label2 = new Label ("The longest word is:");
     
        
        
   
        BorderPane layout = new BorderPane();
        HBox box = new HBox();
        
        box.getChildren().add(label);
        box.getChildren().add(label1);
        box.getChildren().add(label2);

        
        layout.setCenter(field);
        layout.setBottom(box);                  // bottom of the screen is horizontal textbox with componetns in them. 
        
        
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }

}
