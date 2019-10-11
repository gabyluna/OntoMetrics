package metrics.qualitymetrics.impl;

import metrics.qualitymetrics.ComputeQualityMetrics;
import metrics.qualitymetrics.QualityMetricsStrategy;
import model.MetricOntologyModel;

public class LCOMOntoMetric implements QualityMetricsStrategy {

    @Override
    public int calculateQualityMetric(MetricOntologyModel metricOntologyModel) {
        float lcomonto = (float) metricOntologyModel.getRelationsThing() / metricOntologyModel.getNumSubclassOf();
        return ComputeQualityMetrics.getPunctuation(lcomonto);
    }
}
