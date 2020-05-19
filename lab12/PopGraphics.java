package mini.oo20.lab11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PopGraphics extends Application {

    @Override public void start(Stage stage) {

        DataSet pop = new DataSet("population.csv", true);

        stage.setTitle("Population Bar Chart");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<>(xAxis,yAxis);
        bc.setTitle("Population");
        xAxis.setLabel("Country");
        yAxis.setLabel("Population");

        String [] entities = {"World", "Asia", "Africa", "Europe", "North America"};
        String [] years = {"1999", "2009", "2019"};

        for (String year: years) {
            XYChart.Series series = new XYChart.Series();

            series.setName(year.toString());

            for (String ent: entities) {
                series.getData().add(new XYChart.Data(ent, pop.getColumnAsLong("Population", "Entity", ent, "Year", year ).get(0)));
            }

            bc.getData().add(series);
        }

        Scene scene  = new Scene(bc,1000,800);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}

