package de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.interfaces.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class EnvironmentSensorInformationQueriesGenImpl implements EnvironmentSensorInformationQueriesGen {

    @GetMapping(value = "/environmentInformation/{sensorBoxId}/{sensor}/latest")
    protected ResponseEntity<SensorValue> getLatestSensorValue(@PathVariable() Long sensorBoxId, @PathVariable() String sensor) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetLatestSensorValue(Long sensorBoxId, String sensor) {
        if (sensorBoxId == null)
            throw new IllegalArgumentException("Required parameter \"sensorBoxId\" must not be null");
        if (sensor == null)
            throw new IllegalArgumentException("Required parameter \"sensor\" must not be null");
    }

    @GetMapping(value = "/environmentInformation/{sensorBoxId}/{sensor}/{numberOfValues}")
    protected ResponseEntity<SensorValue> getSensorValue(@PathVariable() Long sensorBoxId, @PathVariable() String sensor, @PathVariable() Integer numberOfValues) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetSensorValue(Long sensorBoxId, String sensor, Integer numberOfValues) {
        if (sensorBoxId == null)
            throw new IllegalArgumentException("Required parameter \"sensorBoxId\" must not be null");
        if (sensor == null)
            throw new IllegalArgumentException("Required parameter \"sensor\" must not be null");
        if (numberOfValues == null)
            throw new IllegalArgumentException("Required parameter \"numberOfValues\" must not be null");
    }

    @GetMapping(value = "/environmentInformation/sensorBoxId/{sensorBoxId}/measurementTypes")
    protected String getSensorMeasurementTypes(@PathVariable() Long sensorBoxId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetSensorMeasurementTypes(Long sensorBoxId) {
        if (sensorBoxId == null)
            throw new IllegalArgumentException("Required parameter \"sensorBoxId\" must not be null");
    }
}
