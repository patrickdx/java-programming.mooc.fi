package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args)  {
        System.out.println("Hello world!");
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage)  {           // linechart
        
        NumberAxis x = new NumberAxis(2006,2018,2);        // make axis, 4 ticks per label
        NumberAxis y = new NumberAxis (0,100,10);          // tick unit: value between each "major" tick. tick value from 2005 to tick 2008 is 3. 
        x.setLabel("Year");
        y.setLabel("Ranking");
        
        LineChart<Number, Number> chart = new LineChart<>(x,y); // make chart
        
        XYChart.Series data = new XYChart.Series();     // create empty dataset
                                                        // add data to dataset
        data.getData().add(new XYChart.Data(2007,73));
        data.getData().add(new XYChart.Data(2008,68));
        data.getData().add(new XYChart.Data(2009,72));
        data.getData().add(new XYChart.Data(2010,72));
        data.getData().add(new XYChart.Data(2011,74));
        data.getData().add(new XYChart.Data(2012,73));
        data.getData().add(new XYChart.Data(2013,76));
        data.getData().add(new XYChart.Data(2014,73));
        data.getData().add(new XYChart.Data(2015,67));
        data.getData().add(new XYChart.Data(2016,56));
        data.getData().add(new XYChart.Data(2017,56));
        
        chart.getData().add(data);
        
        
        Scene scene = new Scene(chart, 500,500);
        stage.setScene(scene);
        stage.show();
        
        
        
    }

}
