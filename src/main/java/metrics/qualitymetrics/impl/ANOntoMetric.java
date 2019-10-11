package metrics.qualitymetrics.impl;

import metrics.qualitymetrics.ComputeQualityMetrics;
import metrics.qualitymetrics.QualityMetricsStrategy;
import model.MetricOntologyModel;

public class ANOntoMetric implements QualityMetricsStrategy {

    @Override
    public int calculateQualityMetric(MetricOntologyModel metricOntologyModel) {
        float anonto = (float) metricOntologyModel.getNumAnnotations() / metricOntologyModel.getNumClasses();
        return ComputeQualityMetrics.calculateMetric(anonto);
    }
}
