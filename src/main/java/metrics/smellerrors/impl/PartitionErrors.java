package metrics.smellerrors.impl;

import metrics.smellerrors.SmellErrorTemplate;
import drontoapi.except.UnexpectedErrorException;
import drontoapi.pitfallmanager.Pitfall;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PartitionErrors extends SmellErrorTemplate {

    private static final Integer []arrayPitfallsPartition = {10};

    public List<Pitfall> getListSmellErrors(String path){
        List<Pitfall> listResult = new ArrayList<>();

        try {
            listResult = SmellErrorTemplate.getPitfallsSelector(path, arrayPitfallsPartition);
        } catch (UnexpectedErrorException | IOException ex) {
            Logger.getLogger(PartitionErrors.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listResult;
    }
}
