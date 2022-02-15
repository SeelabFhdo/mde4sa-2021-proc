package de.fhdo.puls.chargingstationsharingquery.service.ChargingStationSharingQuery.interfaces;

import de.fhdo.puls.chargingstationsharingquery.service.ChargingStationSharingQuery.interfaces.gen.ElectrifiedParkingSpaceSharingQueriesGenImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ElectrifiedParkingSpaceSharingQueriesGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@Component()
@RestController()
public class ElectrifiedParkingSpaceSharingQueries extends ElectrifiedParkingSpaceSharingQueriesGenImpl {

    protected Boolean isElectrifiedParkingSpaceOffered(@PathVariable() String id) {
        checkRequiredParametersOfIsElectrifiedParkingSpaceOffered(id);
        // TODO Implement this. Might otherwise throw UnsupportedOperationException from delegating call.
        return super.isElectrifiedParkingSpaceOffered(id);
    }
}
