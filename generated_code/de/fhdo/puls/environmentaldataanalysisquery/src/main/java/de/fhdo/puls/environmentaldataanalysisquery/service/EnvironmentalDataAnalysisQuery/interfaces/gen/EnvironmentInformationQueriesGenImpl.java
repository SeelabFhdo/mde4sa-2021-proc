package de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.interfaces.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentInformationVO;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class EnvironmentInformationQueriesGenImpl implements EnvironmentInformationQueriesGen {

    @GetMapping(value = "/environmentInformation/{id}")
    protected ResponseEntity<EnvironmentInformationVO> getEnvironmentInformation(@PathVariable() Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetEnvironmentInformation(Long id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }

    @GetMapping(value = "/environmentInformation/{id}/particulate2")
    protected ResponseEntity<SensorValue> getParticulate2Information(@PathVariable() Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetParticulate2Information(Long id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }

    @GetMapping(value = "/environmentInformation/{id}/particulate10")
    protected ResponseEntity<SensorValue> getParticulate10Information(@PathVariable() Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetParticulate10Information(Long id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }

    @GetMapping(value = "/environmentInformation/{id}/light")
    protected ResponseEntity<SensorValue> getLightInformation(@PathVariable() Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetLightInformation(Long id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }

    @GetMapping(value = "/environmentInformation/{id}/temperature")
    protected ResponseEntity<SensorValue> getTemperatureInformation(@PathVariable() Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetTemperatureInformation(Long id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }

    @GetMapping(value = "/environmentInformation/{id}/humidity")
    protected ResponseEntity<SensorValue> getHumidityInformation(@PathVariable() Long id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetHumidityInformation(Long id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }
}
