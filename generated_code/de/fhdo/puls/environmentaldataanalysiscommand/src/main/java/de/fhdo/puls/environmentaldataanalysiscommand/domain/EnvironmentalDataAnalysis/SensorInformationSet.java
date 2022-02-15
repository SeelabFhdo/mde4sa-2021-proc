package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.RecivedDataSetList;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen.SensorInformationSetGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends SensorInformationSetGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class SensorInformationSet extends SensorInformationSetGenImpl {

    public SensorInformationSet() {
        super();
    }

    public SensorInformationSet(String id, String name, long sensorBoxId, RecivedDataSetList receivedDataSetList) {
        super(id, name, sensorBoxId, receivedDataSetList);
    }
}
