package application;

import com.sun.javafx.scene.NodeHelper;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {        // main program


    private dictionary dict;
    
    public void init(){
        dict = new dictionary();
    }
    
    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    @Override
    public void start(Stage stage) {
        
        BorderPane main = new BorderPane();
        
        HBox box = new HBox();
        Button button = new Button ("Enter new Words");
        Button prac = new Button ("Practice");
        box.getChildren().addAll(button,prac);
        
        main.setTop(box);
        
        inputview layout = new inputview(dict);
        practice layout2 = new practice(dict);
        
        button.setOnAction((event) ->{
            main.setCenter(layout.createView());
            
        });
        
        prac.setOnAction((event) ->{
            
            main.setCenter(layout2.createView());
        });
        
        main.setCenter(layout.createView());
        
        Scene scene = new Scene (main, 400,300);
        stage.setScene(scene);
        stage.show();
        
        
    }
}
