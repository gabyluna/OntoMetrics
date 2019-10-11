package metrics.smellerrors;

import metrics.smellerrors.impl.CircularityErrors;
import metrics.smellerrors.impl.IncompletenessErrors;
import metrics.smellerrors.impl.PartitionErrors;
import metrics.smellerrors.impl.SemanticErrors;

public class SmellErrorFactory {

    private SmellErrorFactory(){

    }

    public static SmellErrorTemplate getSmellError(SmellErrorEnum smellErrorTag){
        SmellErrorTemplate smellErrorTemplate = null;

        switch(smellErrorTag) {
            case CIRCULARITY:
                smellErrorTemplate =  new CircularityErrors();
                break;
            case INCOMPLETENESS:
                smellErrorTemplate = new IncompletenessErrors();
                break;
            case PARTITION:
                smellErrorTemplate = new PartitionErrors();
                break;
            case SEMANTIC:
                smellErrorTemplate = new SemanticErrors();
                break;
        }

        return smellErrorTemplate;
    }

}
