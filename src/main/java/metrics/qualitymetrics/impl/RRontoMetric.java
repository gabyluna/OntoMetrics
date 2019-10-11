package metrics.qualitymetrics.impl;

import metrics.qualitymetrics.ComputeQualityMetrics;
import metrics.qualitymetrics.QualityMetricsStrategy;
import model.MetricOntologyModel;

public class RRontoMetric implements QualityMetricsStrategy {

    @Override
    public int calculateQualityMetric(MetricOntologyModel metricOntologyModel) {
        int properties = metricOntologyModel.getNumProperties();
        float rronto = (float) metricOntologyModel.getNumSubclassOf() / (metricOntologyModel.getNumSubclassOf() + properties);
        return ComputeQualityMetrics.calculateMetric(rronto);
    }
}
