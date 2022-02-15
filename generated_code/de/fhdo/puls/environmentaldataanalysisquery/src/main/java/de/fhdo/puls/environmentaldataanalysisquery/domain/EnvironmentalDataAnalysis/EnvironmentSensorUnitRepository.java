package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnit;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen.EnvironmentSensorUnitRepositoryGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentSensorUnitRepositoryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class EnvironmentSensorUnitRepository extends EnvironmentSensorUnitRepositoryGenImpl {

    public EnvironmentSensorUnitRepository() {
        super();
    }

    public EnvironmentSensorUnitRepository(EnvironmentSensorUnit environmentSensorUnitAggregate, String id) {
        super(environmentSensorUnitAggregate, id);
    }
}
