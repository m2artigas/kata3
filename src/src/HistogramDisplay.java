package src;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;

public class HistogramDisplay extends ApplicationFrame {
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }

    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(3, "", "ulpgc.es");
        dataset.addValue(7, "", "dis.ulpgc.es");
        dataset.addValue(11, "", "eii.ulpgc.es");
        dataset.addValue(3, "", "gmail.com");
        dataset.addValue(5, "", "hotmail.com");
        return dataset;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Histogram Display",
                "Dominios email",
                "Nº emails", dataset,
                PlotOrientation.VERTICAL, false,
                false, false);
        return chart;
    }

    public void execute(){
        setVisible(true);
    }
}
