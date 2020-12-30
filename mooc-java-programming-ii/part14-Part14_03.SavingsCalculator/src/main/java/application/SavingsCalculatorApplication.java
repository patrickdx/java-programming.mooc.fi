package application;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javax.swing.text.html.HTML;


public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        BorderPane mainlayout = new BorderPane();
        
        NumberAxis x = new NumberAxis(0,30,1);
        NumberAxis y = new NumberAxis();
        
        LineChart chart = new LineChart(x,y);
        chart.setTitle("Savings");
        chart.setLegendVisible(false);
        
        mainlayout.setCenter(chart);
        
        VBox box = new VBox();
        
        BorderPane savings = new BorderPane();
        Label label = new Label("Monthly savings");
        Slider slider = new Slider(25, 250, 25);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        Label value = new Label();    // current value of slider
        
                value.textProperty().bind(
            Bindings.format(
                "%.2f",
                slider.valueProperty()
            )
        );

        savings.setRight(value);
        savings.setCenter(slider);
        savings.setLeft(label);
        
        BorderPane interest = new BorderPane();

        Label label1 = new Label("Yearly interest rate");
        Slider slider1 = new Slider(0, 10, 0);
        slider1.setShowTickMarks(true);
        slider1.setShowTickLabels(true);
        
        Label value1 = new Label();    // current value of slider
        
        
                
       
                
        slider.valueProperty().addListener(new ChangeListener<Number>() {
         public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue){
           
             chart.getData().clear();
              double yearlysave = slider.getValue() * 12;
              XYChart.Series savings = new XYChart.Series();
             
             for (int i=0; i<x.getUpperBound()+1; i++){
                  
                 savings.getData().add(new XYChart.Data(i, yearlysave*i));
                
             }
             
           
             chart.getData().add(savings);

         }
        });
        
          slider1.valueProperty().addListener(new ChangeListener<Number>() {
         public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue){
              
               chart.getData().clear();

             
             XYChart.Series interestsavings = new XYChart.Series();
              
             double yearlysave = slider.getValue() * 12;
             double rate = slider1.getValue()/100 + 1;
             double prev=0;
             
             for (int i=0; i<x.getUpperBound()+1; i++){
                 
                 if (i==0){
                 interestsavings.getData().add(new XYChart.Data(i, 0.0));
                     System.out.println(i+", 0.0");
                 }else{
                 interestsavings.getData().add(new XYChart.Data(i, (prev+yearlysave)*rate));
                 System.out.println(i + "," + (prev+yearlysave)*rate);
                  prev =(prev+yearlysave)*rate;
                 }
             }
                          chart.getData().add(interestsavings);

         }
          });
        
        interest.setRight(value1);
        interest.setCenter(slider1);
        interest.setLeft(label1);
        
        box.getChildren().add(savings);
        box.getChildren().add(interest);
        
        mainlayout.setTop(box);
       
        
        
        Scene scene = new Scene(mainlayout, 500 ,500);
        arg0.setScene(scene);
        arg0.show();
        
    }

}
