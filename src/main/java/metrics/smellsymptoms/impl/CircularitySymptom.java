package metrics.smellsymptoms.impl;

import metrics.smellsymptoms.SmellSymptonTemplate;
import drontoapi.except.UnexpectedErrorException;
import drontoapi.pitfallmanager.Pitfall;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CircularitySymptom extends SmellSymptonTemplate {

    private static final Integer []arrayPitfallsCircularity = {6};

    public  List<Pitfall> getListSmellSymptoms(String path){
        List<Pitfall> listResult = new ArrayList<>();

        try {
            listResult = SmellSymptonTemplate.getPitfallsSelector(path, arrayPitfallsCircularity);
        } catch (UnexpectedErrorException | IOException ex) {
            Logger.getLogger(CircularitySymptom.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listResult;
    }

}
