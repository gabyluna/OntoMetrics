package metrics.qualitymetrics.impl;

import metrics.qualitymetrics.ComputeQualityMetrics;
import metrics.qualitymetrics.QualityMetricsStrategy;
import model.MetricOntologyModel;

public class INROntoMetric implements QualityMetricsStrategy {

    @Override
    public int calculateQualityMetric(MetricOntologyModel metricOntologyModel) {
        float inronto = (float) metricOntologyModel.getNumSubclassOf() / metricOntologyModel.getNumClasses();
        return ComputeQualityMetrics.calculateMetric(inronto);
    }
}
