/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author blaze
 */
@ManagedBean
@RequestScoped
public class ChartView {

    private LineChartModel lineModel;

    @PostConstruct
    public void init() {
        createLineModels();
    }

    public LineChartModel getLineModel() {
        return lineModel;
    }

    private void createLineModels() {
        lineModel = initLinearModel();
        lineModel.setTitle("Linear Chart");
        lineModel.setLegendPosition("e");
        Axis yAxis = lineModel.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");

        LineChartSeries funcao = new LineChartSeries();
        funcao.setLabel("Função");
        
        for(int i = -10; i <= 10; i++) {
            series1.set(i, i*i);
            series2.set(i, 2*i);
            funcao.set(i, 5 + Math.sin(i));
        }

        model.addSeries(series1);
        model.addSeries(series2);
        model.addSeries(funcao);

        return model;
    }

}
