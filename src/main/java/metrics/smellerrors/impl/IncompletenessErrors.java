package metrics.smellerrors.impl;

import metrics.smellerrors.SmellErrorTemplate;
import drontoapi.except.UnexpectedErrorException;
import drontoapi.pitfallmanager.Pitfall;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IncompletenessErrors extends SmellErrorTemplate {
    private static final  Integer []arrayPitfallsIncompleteness = {4,8,11,13};

    public List<Pitfall> getListSmellErrors(String path){
        List<Pitfall> listResult = new ArrayList<>();
        try {
            listResult = SmellErrorTemplate.getPitfallsSelector(path, arrayPitfallsIncompleteness);
        } catch (UnexpectedErrorException | IOException ex) {
            Logger.getLogger(IncompletenessErrors.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listResult;
    }
}
