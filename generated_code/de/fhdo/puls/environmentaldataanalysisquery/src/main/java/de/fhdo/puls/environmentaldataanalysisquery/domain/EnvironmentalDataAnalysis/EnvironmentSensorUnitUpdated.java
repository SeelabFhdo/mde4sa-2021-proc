package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen.EnvironmentSensorUnitUpdatedGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentSensorUnitUpdatedGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class EnvironmentSensorUnitUpdated extends EnvironmentSensorUnitUpdatedGenImpl {

    public EnvironmentSensorUnitUpdated() {
        super();
    }

    public EnvironmentSensorUnitUpdated(String sensorUnitId, String name, String description, String status, float longitude, float latitude, Date lastModifiedDate, String sensorTyp) {
        super(sensorUnitId, name, description, status, longitude, latitude, lastModifiedDate, sensorTyp);
    }
}
