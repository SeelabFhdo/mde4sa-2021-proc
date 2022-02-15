package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValue;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen.EnvironmentDataReceivedGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentDataReceivedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class EnvironmentDataReceived extends EnvironmentDataReceivedGenImpl {

    public EnvironmentDataReceived() {
        super();
    }

    public EnvironmentDataReceived(String sensorUnitId, SensorValue particulates2, SensorValue particulates10, SensorValue light, SensorValue temperature, SensorValue humidity) {
        super(sensorUnitId, particulates2, particulates10, light, temperature, humidity);
    }
}
