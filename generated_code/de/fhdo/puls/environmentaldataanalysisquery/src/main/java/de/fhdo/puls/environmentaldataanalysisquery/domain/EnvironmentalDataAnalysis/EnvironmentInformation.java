package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValueList;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen.EnvironmentInformationGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentInformationGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class EnvironmentInformation extends EnvironmentInformationGenImpl {

    public EnvironmentInformation() {
        super();
    }

    public EnvironmentInformation(String id, long sensorBoxId, SensorValueList particulate2Data, SensorValueList particulate10Data, SensorValueList lightData, SensorValueList temperaturData, SensorValueList humidityData) {
        super(id, sensorBoxId, particulate2Data, particulate10Data, lightData, temperaturData, humidityData);
    }
}
