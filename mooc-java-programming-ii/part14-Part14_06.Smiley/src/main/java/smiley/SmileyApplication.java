package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        
        BorderPane layout = new BorderPane();
        Canvas canvas = new Canvas(500,500);
        layout.setCenter(canvas);
        
        GraphicsContext drawer = canvas.getGraphicsContext2D(); // to draw on canvas
        
        drawer.setFill(Color.WHITE);                        // draw smiley 
        drawer.fillRect(0, 0, 1000, 1000);
        drawer.setFill(Color.BLACK);
        drawer.fillRect(100, 10, 50, 50);
        drawer.fillRect(350, 10, 50, 50);
        drawer.fillRect(50, 300, 50, 50);
        
        drawer.fillRect(100, 350, 50, 50);
        drawer.fillRect(150, 350, 50, 50);
        drawer.fillRect(200, 350, 50, 50);
        drawer.fillRect(250, 350, 50, 50);
        drawer.fillRect(300, 350, 50, 50);
        drawer.fillRect(350, 350, 50, 50);
        
        drawer.fillRect(400, 300, 50, 50);
        
        Scene scene = new Scene (layout);
        arg0.setScene(scene);
        arg0.show();
    }

}
