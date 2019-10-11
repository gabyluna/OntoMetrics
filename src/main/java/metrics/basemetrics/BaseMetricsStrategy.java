package metrics.basemetrics;

import org.semanticweb.owlapi.model.OWLOntology;

public interface BaseMetricsStrategy {
    int calculateMetric(OWLOntology ontology);
}
