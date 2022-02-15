package de.fhdo.puls.chargingstationsearchmanagement.service.ChargingStationSearchManagement.interfaces.gen;

import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.LocationDataDto;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.LocationDataDtos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = {"/resources/v1"})
public abstract class MapSearchControllerGenImpl implements MapSearchControllerGen {

    @PutMapping(value = "/locationData")
    protected ResponseEntity<LocationDataDto> savePatientData(@RequestBody() LocationDataDto locationDataDto) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfSavePatientData(LocationDataDto locationDataDto) {
        if (locationDataDto == null)
            throw new IllegalArgumentException("Required parameter \"locationDataDto\" must not be null");
    }

    @PostMapping(value = "/locationData")
    protected ResponseEntity<LocationDataDto> updateQuestionnaireData(@RequestBody() LocationDataDto locationDataDto) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfUpdateQuestionnaireData(LocationDataDto locationDataDto) {
        if (locationDataDto == null)
            throw new IllegalArgumentException("Required parameter \"locationDataDto\" must not be null");
    }

    @GetMapping(value = "/locationData/{locationDataId}")
    protected ResponseEntity<LocationDataDto> getLocationData(@PathVariable() String locationDataId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetLocationData(String locationDataId) {
        if (locationDataId == null)
            throw new IllegalArgumentException("Required parameter \"locationDataId\" must not be null");
    }

    @GetMapping(value = "/locationData")
    protected ResponseEntity<LocationDataDtos> getAllLocationData() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping(value = "/locationData/findByAddress")
    protected ResponseEntity<LocationDataDtos> getAllLocationDataByAddressLike(@RequestParam(value = "q", defaultValue = "") String addressSearchString) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetAllLocationDataByAddressLike(String addressSearchString) {
        if (addressSearchString == null)
            throw new IllegalArgumentException("Required parameter \"addressSearchString\" must not be null");
    }

    @GetMapping(value = "/locationData/findByAddressFiltered")
    protected ResponseEntity<LocationDataDtos> getAllLocationDataByAddressLikeAndExtFilterLike(@RequestParam(value = "q", defaultValue = "") String addressSearchString, @RequestParam(value = "filter", defaultValue = "") String filter) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetAllLocationDataByAddressLikeAndExtFilterLike(String addressSearchString, String filter) {
        if (addressSearchString == null)
            throw new IllegalArgumentException("Required parameter \"addressSearchString\" must not be null");
        if (filter == null)
            throw new IllegalArgumentException("Required parameter \"filter\" must not be null");
    }

    @GetMapping(value = "/locationData/findWithin")
    protected ResponseEntity<LocationDataDtos> getAllLocationDataWithin(@RequestParam(value = "lat", defaultValue = "") String lat, @RequestParam(value = "lng", defaultValue = "") String lng, @RequestParam(value = "radius", defaultValue = "") Double radius, @RequestParam(value = "metric", defaultValue = "") String metric) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetAllLocationDataWithin(String lat, String lng, Double radius, String metric) {
        if (lat == null)
            throw new IllegalArgumentException("Required parameter \"lat\" must not be null");
        if (lng == null)
            throw new IllegalArgumentException("Required parameter \"lng\" must not be null");
        if (radius == null)
            throw new IllegalArgumentException("Required parameter \"radius\" must not be null");
        if (metric == null)
            throw new IllegalArgumentException("Required parameter \"metric\" must not be null");
    }

    @GetMapping(value = "/locationData/findNear")
    protected ResponseEntity<LocationDataDtos> getAllLocationDataNear(@RequestParam(value = "lat", defaultValue = "") String lat, @RequestParam(value = "lng", defaultValue = "") String lng, @RequestParam(value = "radius", defaultValue = "") Double radius, @RequestParam(value = "metric", defaultValue = "") String metric) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetAllLocationDataNear(String lat, String lng, Double radius, String metric) {
        if (lat == null)
            throw new IllegalArgumentException("Required parameter \"lat\" must not be null");
        if (lng == null)
            throw new IllegalArgumentException("Required parameter \"lng\" must not be null");
        if (radius == null)
            throw new IllegalArgumentException("Required parameter \"radius\" must not be null");
        if (metric == null)
            throw new IllegalArgumentException("Required parameter \"metric\" must not be null");
    }

    @GetMapping(value = "/locationData/findNearFiltered")
    protected ResponseEntity<LocationDataDtos> getAllLocationDataNearAndExtFilter(@RequestParam(value = "lat", defaultValue = "") String lat, @RequestParam(value = "lng", defaultValue = "") String lng, @RequestParam(value = "radius", defaultValue = "") Double radius, @RequestParam(value = "metric", defaultValue = "") String metric, @RequestParam(value = "filter", defaultValue = "") String filter) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetAllLocationDataNearAndExtFilter(String lat, String lng, Double radius, String metric, String filter) {
        if (lat == null)
            throw new IllegalArgumentException("Required parameter \"lat\" must not be null");
        if (lng == null)
            throw new IllegalArgumentException("Required parameter \"lng\" must not be null");
        if (radius == null)
            throw new IllegalArgumentException("Required parameter \"radius\" must not be null");
        if (metric == null)
            throw new IllegalArgumentException("Required parameter \"metric\" must not be null");
        if (filter == null)
            throw new IllegalArgumentException("Required parameter \"filter\" must not be null");
    }

    @GetMapping(value = "/locationData/exists/{locationDataId}")
    protected Boolean existsPatientData(@PathVariable() String locationDataId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfExistsPatientData(String locationDataId) {
        if (locationDataId == null)
            throw new IllegalArgumentException("Required parameter \"locationDataId\" must not be null");
    }

    @DeleteMapping(value = "/locationData/{locationDataId}")
    protected void deletePatientData(@PathVariable() String locationDataId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfDeletePatientData(String locationDataId) {
        if (locationDataId == null)
            throw new IllegalArgumentException("Required parameter \"locationDataId\" must not be null");
    }
}
