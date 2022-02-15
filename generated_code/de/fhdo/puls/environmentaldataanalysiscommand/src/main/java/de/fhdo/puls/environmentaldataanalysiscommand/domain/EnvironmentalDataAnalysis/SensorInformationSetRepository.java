package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.SensorInformationSet;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen.SensorInformationSetRepositoryGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends SensorInformationSetRepositoryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class SensorInformationSetRepository extends SensorInformationSetRepositoryGenImpl {

    public SensorInformationSetRepository() {
        super();
    }

    public SensorInformationSetRepository(SensorInformationSet sensorInformationSet, String id) {
        super(sensorInformationSet, id);
    }
}
