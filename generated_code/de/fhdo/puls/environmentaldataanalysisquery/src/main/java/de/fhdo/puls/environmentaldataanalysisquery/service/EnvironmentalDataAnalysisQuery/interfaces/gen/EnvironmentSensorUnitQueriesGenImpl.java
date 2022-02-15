package de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.interfaces.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnitVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class EnvironmentSensorUnitQueriesGenImpl implements EnvironmentSensorUnitQueriesGen {

    @GetMapping(value = "/environmentSensorUnit/name/{name}")
    protected ResponseEntity<EnvironmentSensorUnitVO> getEnvironmentSensorUnitByName(@PathVariable() String name) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetEnvironmentSensorUnitByName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Required parameter \"name\" must not be null");
    }

    @GetMapping(value = "/environmentSensorUnit/sensorBoxId/{sensorBoxId}")
    protected ResponseEntity<EnvironmentSensorUnitVO> getEnvironmentSensorUnitBySensorBoxId(@PathVariable() Long sensorBoxId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetEnvironmentSensorUnitBySensorBoxId(Long sensorBoxId) {
        if (sensorBoxId == null)
            throw new IllegalArgumentException("Required parameter \"sensorBoxId\" must not be null");
    }

    @GetMapping(value = "/environmentSensorUnits")
    protected ResponseEntity<EnvironmentSensorUnitVO> getEnvironmentSensorUnits() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
