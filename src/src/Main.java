package src;

public class Main {

    public static void main(String[] args) {

        Histogram<String> histogram = new Histogram<String>();

        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.es");
        histogram.increment("dis.es");
        histogram.increment("dis.es");
        histogram.increment("eii.es");

        //view
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM DISPLAY", histogram);
        histogramDisplay.execute();
    }
}
