package de.fhdo.puls.environmentaldataanalysiscommand.service.EnvironmentalDataAnalysisCommand.interfaces.gen;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.CreateEnvironmentSensorUnitCommand;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class EnvironmentSensorUnitCommandsGenImpl implements EnvironmentSensorUnitCommandsGen {

    @PostMapping(value = "/environmentSensorUnit")
    protected void createEnvironmentSensorUnit(@RequestBody() CreateEnvironmentSensorUnitCommand command) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfCreateEnvironmentSensorUnit(CreateEnvironmentSensorUnitCommand command) {
        if (command == null)
            throw new IllegalArgumentException("Required parameter \"command\" must not be null");
    }
}
