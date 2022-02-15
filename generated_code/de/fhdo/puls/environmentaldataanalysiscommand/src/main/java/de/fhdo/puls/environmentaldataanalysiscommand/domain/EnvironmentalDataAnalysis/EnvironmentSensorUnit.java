package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.Location;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.SensorType;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.SensorUnitStatus;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen.EnvironmentSensorUnitGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentSensorUnitGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class EnvironmentSensorUnit extends EnvironmentSensorUnitGenImpl {

    public EnvironmentSensorUnit() {
        super();
    }

    public EnvironmentSensorUnit(String id, String name, long sensorBoxId, String description, SensorUnitStatus status, Location location, Date createdDate, Date lastModifiedDate, SensorType sensorType) {
        super(id, name, sensorBoxId, description, status, location, createdDate, lastModifiedDate, sensorType);
    }
}
