package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage sage) {
      
        NumberAxis x = new NumberAxis(1968,2008,4);
        NumberAxis y = new NumberAxis(0,30,5);

        LineChart<Number,Number> chart = new LineChart<>(x,y);         
        chart.setTitle("Relative support for the parties");
        
      try {                                      // step 1: extract data from tsv file           
             
            Scanner myReader = new Scanner(new File("partiesdata.tsv"));
            
             List<String> years = Arrays.asList(myReader.nextLine().split("\t"));  // split by tab. years for x-axis. 
                          
      while (myReader.hasNextLine()) {            // step 2: put data into dataset, hashmap is not needed!
          
          List<String> pieces = Arrays.asList(myReader.nextLine().split("\t"));     // data for finland's parties
          
          XYChart.Series partydata = new XYChart.Series();
          partydata.setName(pieces.get(0));
         
          for (int i=1; i<pieces.size(); i++){
              if (pieces.get(i).equals("-")){           // skip if empty value 
                  continue;
              }
              partydata.getData().add(new XYChart.Data(Integer.valueOf(years.get(i)),Double.parseDouble(pieces.get(i))));       // add data to dataset
          }
          chart.getData().add(partydata);

       
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
    }
                                                      // step 3: add data to dataset and linechart

       
     Scene scene = new Scene(chart, 500,500);
     sage.setScene(scene);
     sage.show();
    }

}
