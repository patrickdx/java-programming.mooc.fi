package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage){
        
        BorderPane layout = new BorderPane();
        Button button = new Button("To the second view!");
        Label label = new Label("First view!");
        
        layout.setCenter(button);
        layout.setTop(label);
        
        VBox layout2 = new VBox();
        Button button2 = new Button ("To the third view!");
        Label label2 = new Label("Second view!");
        layout2.getChildren().add(button2);
        layout2.getChildren().add(label2);
        
        GridPane layout3 = new GridPane();
        layout3.add(new Label("Third view!"), 0, 0);
        Button button3 = new Button("To the first view!");
        layout3.add(button3, 1, 1);
       
        
        Scene first = new Scene(layout);
        Scene second = new Scene(layout2);
        Scene third =  new Scene(layout3);
        
        button.setOnAction((event) -> {
            stage.setScene(second);
            
        });
        
        button2.setOnAction((event) ->{
            
            stage.setScene(third);
            
        });
        
          button3.setOnAction((event) -> {
            stage.setScene(first);
        
        
        });

        
        
        stage.setScene(first);
        stage.show();
        
    }
    

}
