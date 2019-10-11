package metrics.qualitymetrics.impl;

import metrics.qualitymetrics.ComputeQualityMetrics;
import metrics.qualitymetrics.QualityMetricsStrategy;
import model.MetricOntologyModel;

public class RCOntoMetric implements QualityMetricsStrategy {

    @Override
    public int calculateQualityMetric(MetricOntologyModel metricOntologyModel) {
        float rClass = (float) metricOntologyModel.getNumClassWithIndividuals()/ metricOntologyModel.getNumClasses();
        return ComputeQualityMetrics.calculateMetric(rClass);
    }
}
