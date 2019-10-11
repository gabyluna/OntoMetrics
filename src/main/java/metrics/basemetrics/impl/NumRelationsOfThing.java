package metrics.basemetrics.impl;

import metrics.basemetrics.BaseMetricsStrategy;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NumRelationsOfThing implements BaseMetricsStrategy {

    public int calculateMetric(OWLOntology ontology){
        List<String> listRelationsThing = new ArrayList<String>();
        Set<OWLSubClassOfAxiom> subClasses = ontology.getAxioms(AxiomType.SUBCLASS_OF);

        for (OWLSubClassOfAxiom subClassAux : subClasses) {
            if (subClassAux.getSignature().toString().contains("owl:Thing")) {
                listRelationsThing.add(subClassAux.getSignature().toString());
            }
        }
        return listRelationsThing.size();
    }

}
