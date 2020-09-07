package metrics.smellsymptoms;

import metrics.smellsymptoms.impl.CircularitySymptom;
import metrics.smellsymptoms.impl.IncompletenessSymptom;
import metrics.smellsymptoms.impl.PartitionSymptom;
import metrics.smellsymptoms.impl.SemanticSymptom;

public class SmellSymptomsFactory {

    private SmellSymptomsFactory(){

    }

    public static SmellSymptonTemplate getSmellSymptoms(SmellSymptomEnum smellErrorTag){
        SmellSymptonTemplate smellSymptonTemplate = null;

        switch(smellErrorTag) {
            case CIRCULARITY:
                smellSymptonTemplate =  new CircularitySymptom();
                break;
            case INCOMPLETENESS:
                smellSymptonTemplate = new IncompletenessSymptom();
                break;
            case PARTITION:
                smellSymptonTemplate = new PartitionSymptom();
                break;
            case SEMANTIC:
                smellSymptonTemplate = new SemanticSymptom();
                break;
        }

        return smellSymptonTemplate;
    }

}
