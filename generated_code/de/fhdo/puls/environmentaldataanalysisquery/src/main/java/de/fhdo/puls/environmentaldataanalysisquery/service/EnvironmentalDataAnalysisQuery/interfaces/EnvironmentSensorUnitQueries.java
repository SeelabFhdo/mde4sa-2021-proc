package de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.interfaces;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitVO;
import de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.interfaces.gen.EnvironmentSensorUnitQueriesGenImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentSensorUnitQueriesGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class EnvironmentSensorUnitQueries extends EnvironmentSensorUnitQueriesGenImpl {

    protected ResponseEntity<EnvironmentSensorUnitVO> getEnvironmentSensorUnitByName(@PathVariable() String name) {
        checkRequiredParametersOfGetEnvironmentSensorUnitByName(name);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getEnvironmentSensorUnitByName(name);
    }

    protected ResponseEntity<EnvironmentSensorUnitVO> getEnvironmentSensorUnitBySensorBoxId(@PathVariable() Long sensorBoxId) {
        checkRequiredParametersOfGetEnvironmentSensorUnitBySensorBoxId(sensorBoxId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getEnvironmentSensorUnitBySensorBoxId(sensorBoxId);
    }

    protected ResponseEntity<EnvironmentSensorUnitVO> getEnvironmentSensorUnits() {
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getEnvironmentSensorUnits();
    }
}
