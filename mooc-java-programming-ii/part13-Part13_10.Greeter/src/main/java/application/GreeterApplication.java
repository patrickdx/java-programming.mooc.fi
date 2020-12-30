package application;

import java.lang.reflect.Modifier;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
       
        GridPane layout = new GridPane();
        Label enter = new Label ("Enter your name and start.");
        Button button = new Button("Start");
        TextField field = new TextField();
        
        layout.add(enter, 0, 0);
        layout.add(field, 0, 1);
        layout.add(button, 0, 2);
        
        //style
        layout.setVgap(15);  // set vgap for gridlayout's components
        layout.setPadding(new Insets(20,20,20,20));
        layout.setAlignment(Pos.CENTER);
        layout.setPrefSize(300, 180);           

        
        FlowPane welcome = new FlowPane();
        Label label = new Label("sup");
        welcome.setPrefSize(300, 180);          // set preferred size so upon layout change, size of window does not change!
                                                // flowpane size is to equal its elemnt's size, but its perferred size is set!
        welcome.getChildren().add(label);
        welcome.setAlignment(Pos.CENTER);
        
        
        
        button.setOnAction((event) ->{          // display welcome (name) 
                
            stage.setScene(new Scene (welcome));
            String name = field.getText();
            label.setText("Welcome " + name + "!");
        });
        
       
        
        Scene scene = new Scene (layout);
        stage.setScene(scene);
        stage.show();
        
        
    }
}
