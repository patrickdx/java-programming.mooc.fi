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
public class inputview{
    
    private dictionary xd;
    
    
    public inputview(dictionary dict){
        this.xd = dict;
        
    }
    
    public Parent createView(){                     // parent is the superclass for all layouts, thus return parent object.
      
               
        GridPane layout = new GridPane();
        
        Label word = new Label("Word");
        Label translation = new Label("Translation");
        TextField wordfield = new TextField();
        TextField transfield = new TextField();
        Button button = new Button("Add Pair");
        
        layout.setPadding(new Insets(10,10,10,10));
        layout.add(word, 0, 0);
        layout.add(wordfield,0,1);
        layout.add(translation, 0, 2);
        layout.add(transfield, 0, 3);
        layout.add(button, 0, 4);
  
  
        button.setOnAction((event) ->{
            
            xd.add(wordfield.getText(), transfield.getText());
            wordfield.clear();
            transfield.clear();
            
        });
        
        
        
        return layout;      // return ready made layout
        
    }
    
    
    
    
    
    
    
    
    
    
}
