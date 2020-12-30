package application;

import javafx.application.Application;
import javafx.stage.Stage;import java.lang.reflect.Modifier;
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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) {
        
    BorderPane mainLayout = new BorderPane();
    mainLayout.setPrefSize(300, 180);
    mainLayout.setPadding(new Insets(20,20,20,20));
    
    HBox menu = new HBox();
    Button joke = new Button("Joke");
    Button ans = new Button("Answer");
    Button exp = new Button("Explanation");
    menu.getChildren().addAll(joke, ans, exp);
    mainLayout.setTop(menu);
    
    
    Label label = new Label ("What do you call a bear with no teeth?");
    StackPane text = new StackPane(label);   
    mainLayout.setCenter(text);
    
    
    
    StackPane joke1 = createView("What do you call a bear with no teeth?");             // create ready-made layouts 
    StackPane ans1 = createView("A gummy bear.");
    StackPane expl = createView("Because a gummy bear has no teeth 4Head");

    
    joke.setOnAction((event) ->{                                                        // can change content Area immediately by just setting the new layout. 
        mainLayout.setCenter(joke1);                                                    // ready made layout; layout already has components inside them 
    });                                                                                 
                                                                                        // this is good for a non-changing scene with a changing content-area;
                                                                                        // better than just set texting, since UI componenets can differ in quantity and need.
     ans.setOnAction((event) ->{
        mainLayout.setCenter(ans1);

    });
     
     
      exp.setOnAction((event) ->{
       mainLayout.setCenter(expl); 
    });
    
    
    Scene scene = new Scene(mainLayout);
    stage.setScene(scene);
    stage.show();
        
    }
    
    
    private StackPane createView(String text) { // ready made layouts with string text! 

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
