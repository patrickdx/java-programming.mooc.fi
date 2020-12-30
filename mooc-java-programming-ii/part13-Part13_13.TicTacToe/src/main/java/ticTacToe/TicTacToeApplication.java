package ticTacToe;

import javafx.application.Application;
import javafx.stage.Stage;
import com.sun.javafx.scene.NodeHelper;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;


public class TicTacToeApplication extends Application {

     char turn = 'X';
     boolean done = false;

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane main = new BorderPane();

        Label turns = new Label("Turn: X");
        turns.setFont(Font.font("Arial",40));
        main.setTop(turns);
        
        GridPane sublayout = new GridPane();
                
        Button [] [] buttons = new Button[3][3];
        logic xd = new logic(3);
        for (int i=0; i<3; i++){                // create 3x3 buttons
            for (int g=0; g<3; g++){
                
                Button button = new Button("");
                button.setPrefSize(100, 100);
                button.setFont(Font.font("Arial", 40));
                int y=i;
                int x=g;
                char turn1 = turn;
                boolean done1 = done;
               
                    button.setOnAction((event) -> {             // write code in terms of real-life methodical order. 

                    if (button.getText().equals("") && done == false){
                        button.setText(Character.toString(turn));
                        xd.add(x, y, turn);
                        if (xd.gameFinished()){
                            
                            done = true;
                            
                        }
                        
                          if (turn == 'X'){       // determines what's the next turn
                            turn = 'O';
                        }else{
                        turn = 'X';
                         }
                        
                          
                        turns.setText("Turn: " + turn);
                        
                     }
                    if (done == true){
                        turns.setText("The end!");
                    }
                });  
                
              
                buttons[i][g] = button;
                sublayout.add(button, i, g);

                }
            }
        
        
   

        sublayout.setVgap(10);
        sublayout.setHgap(10);
        sublayout.setAlignment(Pos.CENTER);
        
        main.setCenter(sublayout);
        
        

        
       
        
        Scene scene = new Scene (main,350,400);
        
        stage.setScene(scene);
        stage.show();
        
    }
   
}
