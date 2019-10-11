package metrics.basemetrics.impl;

import metrics.basemetrics.BaseMetricsStrategy;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import util.UtilClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class NumInstances implements BaseMetricsStrategy {

    public int calculateMetric(OWLOntology ontology){
        List<String> listInstances = new ArrayList<String>();
        Set<OWLNamedIndividual> individualsSignature = ontology.getIndividualsInSignature();

        for (OWLNamedIndividual ind : individualsSignature) {
            String []individuals = UtilClass.cutString(ind.toString());

            for (int i = 0; i < (individuals.length - 1); i++) {
                listInstances.add(individuals[1].replaceAll(">", ""));
            }
        }

        Collections.sort(listInstances);
        UtilClass.removeRepeatClasses(listInstances);

        return listInstances.size();
    }

}
