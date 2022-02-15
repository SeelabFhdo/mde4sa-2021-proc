package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen.UpdateEnvironmentSensorUnitCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends UpdateEnvironmentSensorUnitCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class UpdateEnvironmentSensorUnitCommand extends UpdateEnvironmentSensorUnitCommandGenImpl {

    public UpdateEnvironmentSensorUnitCommand() {
        super();
    }

    public UpdateEnvironmentSensorUnitCommand(String id, String name, String description, String status, float longitude, float latitude) {
        super(id, name, description, status, longitude, latitude);
    }
}
