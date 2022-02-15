package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValueList;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen.EnvironmentInformationVOGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentInformationVOGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class EnvironmentInformationVO extends EnvironmentInformationVOGenImpl {

    public EnvironmentInformationVO() {
        super();
    }

    public EnvironmentInformationVO(String id, long sensorBoxId, SensorValueList particulate2Data, SensorValueList particulate10Data, SensorValueList lightData, SensorValueList temperaturData, SensorValueList humidityData) {
        super(id, sensorBoxId, particulate2Data, particulate10Data, lightData, temperaturData, humidityData);
    }
}
