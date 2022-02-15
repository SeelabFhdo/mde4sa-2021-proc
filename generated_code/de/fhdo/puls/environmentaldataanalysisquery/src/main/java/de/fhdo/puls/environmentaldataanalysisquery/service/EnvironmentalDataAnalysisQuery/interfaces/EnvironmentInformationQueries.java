package de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.interfaces;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentInformationVO;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorValue;
import de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.interfaces.gen.EnvironmentInformationQueriesGenImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentInformationQueriesGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class EnvironmentInformationQueries extends EnvironmentInformationQueriesGenImpl {

    protected ResponseEntity<EnvironmentInformationVO> getEnvironmentInformation(@PathVariable() Long id) {
        checkRequiredParametersOfGetEnvironmentInformation(id);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getEnvironmentInformation(id);
    }

    protected ResponseEntity<SensorValue> getParticulate2Information(@PathVariable() Long id) {
        checkRequiredParametersOfGetParticulate2Information(id);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getParticulate2Information(id);
    }

    protected ResponseEntity<SensorValue> getParticulate10Information(@PathVariable() Long id) {
        checkRequiredParametersOfGetParticulate10Information(id);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getParticulate10Information(id);
    }

    protected ResponseEntity<SensorValue> getLightInformation(@PathVariable() Long id) {
        checkRequiredParametersOfGetLightInformation(id);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getLightInformation(id);
    }

    protected ResponseEntity<SensorValue> getTemperatureInformation(@PathVariable() Long id) {
        checkRequiredParametersOfGetTemperatureInformation(id);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getTemperatureInformation(id);
    }

    protected ResponseEntity<SensorValue> getHumidityInformation(@PathVariable() Long id) {
        checkRequiredParametersOfGetHumidityInformation(id);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getHumidityInformation(id);
    }
}
