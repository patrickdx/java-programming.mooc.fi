package textstatistics;

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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TextStatisticsApplication  extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
               
        TextArea field = new TextArea();         // textarea is just textfield, but can type multiple lines. 
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestword = new Label("The longest word is:");

        
        
   
        BorderPane box = new BorderPane();
        HBox horz = new HBox();
        
        horz.getChildren().add(letters);
        horz.getChildren().add(words);
        horz.getChildren().add(longestword);
        horz.setSpacing(20);
    
        field.textProperty().addListener((change, oldvalue, newvalue) -> {
               String ltrs = newvalue.replaceAll("\\s+","");           // problem asked for letters but its actually characters ¯\_(ツ)_/¯
                String parts[] = newvalue.split("\\s+");                     // array of words 
                if (ltrs.length() > 0){                                            
                    words.setText("Words: " + parts.length);
                }else{
                    words.setText("Words: 0");
                }
                
                letters.setText("Letters: " + newvalue.length());
                
                                                               // finding largest string in array. 
                String longest = Arrays.stream(parts).max(Comparator.comparingInt(String::length)).get();
                
                
                longestword.setText("The longest word is: " + longest);
                
                
         });
        
        
        box.setCenter(field);
        box.setBottom(horz);
        

        Scene view = new Scene(box);
        stage.setScene(view);
        stage.show();
    }

}
