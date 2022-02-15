package de.fhdo.puls.chargingstationsharingquery.service.ChargingStationSharingQuery.interfaces.gen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ElectrifiedParkingSpaceSharingQueriesGenImpl implements ElectrifiedParkingSpaceSharingQueriesGen {

    @GetMapping(value = "/electrifiedParkingSpaceSharing/id/{id}")
    protected Boolean isElectrifiedParkingSpaceOffered(@PathVariable() String id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfIsElectrifiedParkingSpaceOffered(String id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }
}
