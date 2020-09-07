package metrics.qualitymetrics.impl;

import metrics.qualitymetrics.ComputeQualityMetrics;
import metrics.qualitymetrics.QualityMetricsStrategy;
import model.MetricOntologyModel;

public class CBOntoMetric implements QualityMetricsStrategy {

    @Override
    public int calculateQualityMetric(MetricOntologyModel metricOntologyModel) {
        float cbonto = (float) metricOntologyModel.getNumSuperclasses() /
                (metricOntologyModel.getNumClasses() - metricOntologyModel.getRelationsThing());
        return ComputeQualityMetrics.calculateScore(cbonto);
    }
}
