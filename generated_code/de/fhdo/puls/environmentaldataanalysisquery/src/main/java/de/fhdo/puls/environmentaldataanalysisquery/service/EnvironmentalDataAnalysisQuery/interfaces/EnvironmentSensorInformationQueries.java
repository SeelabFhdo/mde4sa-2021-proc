package de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.interfaces;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValue;
import de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.interfaces.gen.EnvironmentSensorInformationQueriesGenImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentSensorInformationQueriesGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class EnvironmentSensorInformationQueries extends EnvironmentSensorInformationQueriesGenImpl {

    protected ResponseEntity<SensorValue> getLatestSensorValue(@PathVariable() Long sensorBoxId, @PathVariable() String sensor) {
        checkRequiredParametersOfGetLatestSensorValue(sensorBoxId, sensor);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getLatestSensorValue(sensorBoxId, sensor);
    }

    protected ResponseEntity<SensorValue> getSensorValue(@PathVariable() Long sensorBoxId, @PathVariable() String sensor, @PathVariable() Integer numberOfValues) {
        checkRequiredParametersOfGetSensorValue(sensorBoxId, sensor, numberOfValues);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getSensorValue(sensorBoxId, sensor, numberOfValues);
    }

    protected String getSensorMeasurementTypes(@PathVariable() Long sensorBoxId) {
        checkRequiredParametersOfGetSensorMeasurementTypes(sensorBoxId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getSensorMeasurementTypes(sensorBoxId);
    }
}
