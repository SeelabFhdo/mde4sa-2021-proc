package de.fhdo.puls.chargingstationsearchmanagement.service.ChargingStationSearchManagement.interfaces;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.LocationDataDto;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.LocationDataDtos;
import de.fhdo.puls.chargingstationsearchmanagement.service.ChargingStationSearchManagement.interfaces.gen.MapSearchControllerGenImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends MapSearchControllerGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class MapSearchController extends MapSearchControllerGenImpl {

    protected ResponseEntity<LocationDataDto> savePatientData(@RequestBody() LocationDataDto locationDataDto) {
        checkRequiredParametersOfSavePatientData(locationDataDto);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.savePatientData(locationDataDto);
    }

    protected ResponseEntity<LocationDataDto> updateQuestionnaireData(@RequestBody() LocationDataDto locationDataDto) {
        checkRequiredParametersOfUpdateQuestionnaireData(locationDataDto);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.updateQuestionnaireData(locationDataDto);
    }

    protected ResponseEntity<LocationDataDto> getLocationData(@PathVariable() String locationDataId) {
        checkRequiredParametersOfGetLocationData(locationDataId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getLocationData(locationDataId);
    }

    protected ResponseEntity<LocationDataDtos> getAllLocationData() {
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getAllLocationData();
    }

    protected ResponseEntity<LocationDataDtos> getAllLocationDataByAddressLike(@RequestParam(value = "q", defaultValue = "") String addressSearchString) {
        checkRequiredParametersOfGetAllLocationDataByAddressLike(addressSearchString);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getAllLocationDataByAddressLike(addressSearchString);
    }

    protected ResponseEntity<LocationDataDtos> getAllLocationDataByAddressLikeAndExtFilterLike(@RequestParam(value = "q", defaultValue = "") String addressSearchString, @RequestParam(value = "filter", defaultValue = "") String filter) {
        checkRequiredParametersOfGetAllLocationDataByAddressLikeAndExtFilterLike(addressSearchString, filter);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getAllLocationDataByAddressLikeAndExtFilterLike(addressSearchString, filter);
    }

    protected ResponseEntity<LocationDataDtos> getAllLocationDataWithin(@RequestParam(value = "lat", defaultValue = "") String lat, @RequestParam(value = "lng", defaultValue = "") String lng, @RequestParam(value = "radius", defaultValue = "") Double radius, @RequestParam(value = "metric", defaultValue = "") String metric) {
        checkRequiredParametersOfGetAllLocationDataWithin(lat, lng, radius, metric);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getAllLocationDataWithin(lat, lng, radius, metric);
    }

    protected ResponseEntity<LocationDataDtos> getAllLocationDataNear(@RequestParam(value = "lat", defaultValue = "") String lat, @RequestParam(value = "lng", defaultValue = "") String lng, @RequestParam(value = "radius", defaultValue = "") Double radius, @RequestParam(value = "metric", defaultValue = "") String metric) {
        checkRequiredParametersOfGetAllLocationDataNear(lat, lng, radius, metric);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getAllLocationDataNear(lat, lng, radius, metric);
    }

    protected ResponseEntity<LocationDataDtos> getAllLocationDataNearAndExtFilter(@RequestParam(value = "lat", defaultValue = "") String lat, @RequestParam(value = "lng", defaultValue = "") String lng, @RequestParam(value = "radius", defaultValue = "") Double radius, @RequestParam(value = "metric", defaultValue = "") String metric, @RequestParam(value = "filter", defaultValue = "") String filter) {
        checkRequiredParametersOfGetAllLocationDataNearAndExtFilter(lat, lng, radius, metric, filter);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getAllLocationDataNearAndExtFilter(lat, lng, radius, metric, filter);
    }

    protected Boolean existsPatientData(@PathVariable() String locationDataId) {
        checkRequiredParametersOfExistsPatientData(locationDataId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.existsPatientData(locationDataId);
    }

    protected void deletePatientData(@PathVariable() String locationDataId) {
        checkRequiredParametersOfDeletePatientData(locationDataId);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        super.deletePatientData(locationDataId);
    }
}
