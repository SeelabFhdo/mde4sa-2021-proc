package de.fhdo.puls.chargingstationmanagementquery.service.ChargingStationManagementQuery.interfaces.gen;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.IDs;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ElectrifiedParkingSpaceQueriesGenImpl implements ElectrifiedParkingSpaceQueriesGen {

    @GetMapping(value = "/electrifiedParkingSpace/id/{id}")
    protected ResponseEntity<ElectrifiedParkingSpace> getElectrifiedParkingSpaceById(@PathVariable() String id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetElectrifiedParkingSpaceById(String id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }

    @GetMapping(value = "/electrifiedParkingSpace/ids")
    protected ResponseEntity<ElectrifiedParkingSpace> getElectrifiedParkingSpacesByIds(@RequestBody() IDs ids) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetElectrifiedParkingSpacesByIds(IDs ids) {
        if (ids == null)
            throw new IllegalArgumentException("Required parameter \"ids\" must not be null");
    }

    @GetMapping(value = "/electrifiedParkingSpaces")
    protected ResponseEntity<ElectrifiedParkingSpace> getAllElectrifiedParkingSpaces() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
