package metrics.basemetrics.impl;

import metrics.basemetrics.BaseMetricsStrategy;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.util.DefaultPrefixManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NumClasses implements BaseMetricsStrategy {

    private static final DefaultPrefixManager pm = new DefaultPrefixManager("http://www.text2onto.org#");

    public int calculateMetric(OWLOntology ontology){
        List<String> listClasses = new ArrayList<String>();
        Set<OWLClass> classes = ontology.getClassesInSignature();

        for (OWLClass classAux : classes) {
            listClasses.add(pm.getShortForm(classAux).replaceAll(":", ""));
        }
        return listClasses.size();
    }

}
