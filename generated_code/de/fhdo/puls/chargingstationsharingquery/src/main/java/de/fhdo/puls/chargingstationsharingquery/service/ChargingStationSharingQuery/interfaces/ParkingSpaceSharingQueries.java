package de.fhdo.puls.chargingstationsharingquery.service.ChargingStationSharingQuery.interfaces;

import de.fhdo.puls.chargingstationsharingquery.service.ChargingStationSharingQuery.interfaces.gen.ParkingSpaceSharingQueriesGenImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceSharingQueriesGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ParkingSpaceSharingQueries extends ParkingSpaceSharingQueriesGenImpl {

    protected Boolean isParkingSpaceOffered(@PathVariable() String id) {
        checkRequiredParametersOfIsParkingSpaceOffered(id);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.isParkingSpaceOffered(id);
    }
}
