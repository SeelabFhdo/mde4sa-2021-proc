package de.fhdo.puls.chargingstationmanagementquery.service.ChargingStationManagementQuery.interfaces;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.IDs;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpace;
import de.fhdo.puls.chargingstationmanagementquery.service.ChargingStationManagementQuery.interfaces.gen.ParkingSpaceQueriesGenImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceQueriesGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ParkingSpaceQueries extends ParkingSpaceQueriesGenImpl {

    protected ResponseEntity<ParkingSpace> getParkingSpaceById(@PathVariable() String id) {
        checkRequiredParametersOfGetParkingSpaceById(id);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getParkingSpaceById(id);
    }

    protected ResponseEntity<ParkingSpace> getParkingSpacesByIds(@RequestBody() IDs ids) {
        checkRequiredParametersOfGetParkingSpacesByIds(ids);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getParkingSpacesByIds(ids);
    }

    protected ResponseEntity<ParkingSpace> getAllParkingSpaces() {
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.getAllParkingSpaces();
    }
}
