package metrics.smellsymptoms;

import drontoapi.except.UnexpectedErrorException;
import drontoapi.pitfallmanager.AffectedElement;
import drontoapi.pitfallmanager.IPitfallManager;
import drontoapi.pitfallmanager.Pitfall;
import drontoapi.pitfallmanager.PitfallManager;
import drontoapi.service.IWebService;
import drontoapi.service.WebService;
import drontoapi.util.PitfallSelector;
import model.MetricOntologyModel;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class SmellSymptonTemplate {

   private static
   IWebService webService = new WebService();

    public  abstract List<Pitfall> getListSmellSymptoms(String path);

    public static List<Pitfall> getPitfallsSelector(String path, Integer[] arrayPitfallsSelector) throws UnexpectedErrorException, IOException {
        webService.setOntologyFile(path);
        PitfallSelector pitfallSelector = new PitfallSelector();

        for(Integer pitfall: arrayPitfallsSelector){
            pitfallSelector.selectPitfall(pitfall);
        }
        webService.setPitfallSelector(pitfallSelector);
        IPitfallManager manager = new PitfallManager(webService.getResponse());

        return manager.getPitfalls();
    }

    public static List<AffectedElement> getElementsSmellSymptoms(String path, Pitfall pitfall) {
        List<AffectedElement> listResult = new ArrayList<>();

        try {
            webService.setOntologyFile(path);
            IPitfallManager manager = new PitfallManager(webService.getResponse());
            listResult =  manager.getAffectedElements(pitfall);
        } catch (UnexpectedErrorException | IOException ex) {
            Logger.getLogger(SmellSymptonTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listResult;
    }

    public List<MetricOntologyModel> redundandyErrors(String path, List<String> lista) {
        throw new UnsupportedOperationException("Not supported yet.");
        //TODO To change body of generated methods, choose Tools | Templates.
    }

}
