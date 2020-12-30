/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Liwen Qu
 */
public class practice {
    
    private dictionary dict;
    private String word;        // random word each time
    
    public practice (dictionary dict){
        this.dict = dict;
        this.word = dict.randomize();
        
    }
    
    public Parent createView(){
        
        GridPane layout = new GridPane();
        Label question = new Label ("Translate the word '" + word + "'");
        Label feedback = new Label();
        TextField field = new TextField();
        Button button = new Button ("Check");
        
        layout.add(question, 0, 0);
        layout.add(field, 0, 1);
        layout.add(button, 0, 2);
        layout.add(feedback, 0, 3);
        
        layout.setPadding(new Insets(10,10,10,10));
        
        button.setOnAction((event) -> {
        
            if (dict.get(word).equals(field.getText())){
                feedback.setText("Correct");
            }else{
                feedback.setText("Incorrect");
                return;
            }
            
            // go again
            this.word = this.dict.randomize();
            
            question.setText("Translate the word '" + this.word + "'");
            field.clear();
            
        
        }
        );
        
        
        return layout;
    }
    
    
}
