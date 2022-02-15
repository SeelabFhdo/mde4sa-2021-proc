package de.fhdo.puls.chargingstationmanagementquery.service.ChargingStationManagementQuery.interfaces.gen;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.IDs;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpace;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ParkingSpaceQueriesGenImpl implements ParkingSpaceQueriesGen {

    @GetMapping(value = "/parkingSpace/id/{id}")
    protected ResponseEntity<ParkingSpace> getParkingSpaceById(@PathVariable() String id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetParkingSpaceById(String id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }

    @GetMapping(value = "/parkingSpace/ids")
    protected ResponseEntity<ParkingSpace> getParkingSpacesByIds(@RequestBody() IDs ids) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfGetParkingSpacesByIds(IDs ids) {
        if (ids == null)
            throw new IllegalArgumentException("Required parameter \"ids\" must not be null");
    }

    @GetMapping(value = "/parkingSpaces")
    protected ResponseEntity<ParkingSpace> getAllParkingSpaces() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
