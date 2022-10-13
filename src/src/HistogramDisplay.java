package src;

import org.jfree.chart.ChartPanel;
import org.jfree.ui.ApplicationFrame;

import java.awt.*;

public class HistogramDisplay extends ApplicationFrame {
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    private ChartPanel createPanel() {
        return null;
    }

    public void execute(){
        setVisible(true);
    }
}
