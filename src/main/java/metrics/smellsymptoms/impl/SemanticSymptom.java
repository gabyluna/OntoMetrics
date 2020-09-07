package metrics.smellsymptoms.impl;

import metrics.smellsymptoms.SmellSymptonTemplate;
import drontoapi.except.UnexpectedErrorException;
import drontoapi.pitfallmanager.Pitfall;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SemanticSymptom extends SmellSymptonTemplate {

    private static final Integer []arrayPitfallsSemantic = {1,2,7,12,19,20,22,30,32};

    public List<Pitfall> getListSmellSymptoms(String path){
        List<Pitfall> listResult = new ArrayList<>();

        try {
            listResult = SmellSymptonTemplate.getPitfallsSelector(path, arrayPitfallsSemantic);
        } catch (UnexpectedErrorException | IOException ex) {
            Logger.getLogger(SemanticSymptom.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listResult;
    }
}
