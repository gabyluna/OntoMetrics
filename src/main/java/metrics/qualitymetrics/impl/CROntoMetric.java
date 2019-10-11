package metrics.qualitymetrics.impl;

import metrics.qualitymetrics.ComputeQualityMetrics;
import metrics.qualitymetrics.QualityMetricsStrategy;
import model.MetricOntologyModel;

public class CROntoMetric implements QualityMetricsStrategy {

    @Override
    public int calculateQualityMetric(MetricOntologyModel metricOntologyModel) {
        float cronto = (float) metricOntologyModel.getNumInstances() / metricOntologyModel.getNumClasses();
        return ComputeQualityMetrics.calculateMetric(cronto);
    }
}
