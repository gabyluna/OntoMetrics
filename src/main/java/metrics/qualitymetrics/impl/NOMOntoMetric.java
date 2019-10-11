package metrics.qualitymetrics.impl;

import metrics.qualitymetrics.ComputeQualityMetrics;
import metrics.qualitymetrics.QualityMetricsStrategy;
import model.MetricOntologyModel;

public class NOMOntoMetric implements QualityMetricsStrategy {

    @Override
    public int calculateQualityMetric(MetricOntologyModel metricOntologyModel) {
        float nomonto = (float) metricOntologyModel.getNumProperties() / metricOntologyModel.getNumClasses();
        return ComputeQualityMetrics.getPunctuation(nomonto);
    }
}
