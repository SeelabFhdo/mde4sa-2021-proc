package de.fhdo.puls.environmentaldataanalysiscommand.service.EnvironmentalDataAnalysisCommand.interfaces;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.CreateEnvironmentSensorUnitCommand;
import de.fhdo.puls.environmentaldataanalysiscommand.service.EnvironmentalDataAnalysisCommand.interfaces.gen.EnvironmentSensorUnitCommandsGenImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentSensorUnitCommandsGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class EnvironmentSensorUnitCommands extends EnvironmentSensorUnitCommandsGenImpl {

    protected void createEnvironmentSensorUnit(@RequestBody() CreateEnvironmentSensorUnitCommand command) {
        checkRequiredParametersOfCreateEnvironmentSensorUnit(command);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.createEnvironmentSensorUnit(command);
    }
}
