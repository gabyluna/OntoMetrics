package metrics.qualitymetrics.impl;

import metrics.qualitymetrics.ComputeQualityMetrics;
import metrics.qualitymetrics.QualityMetricsStrategy;
import model.MetricOntologyModel;

public class RFCOntoMetric implements QualityMetricsStrategy {

    @Override
    public int calculateQualityMetric(MetricOntologyModel metricOntologyModel) {
        float rfconto = (float) (metricOntologyModel.getNumProperties() + metricOntologyModel.getNumSuperclasses()) /
                metricOntologyModel.getNumClasses();
        return ComputeQualityMetrics.calculateScore(rfconto);
    }


}
