package de.fhdo.puls.chargingstationsharingquery.service.ChargingStationSharingQuery.interfaces.gen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = {"/resources/v1"})
public abstract class ParkingSpaceSharingQueriesGenImpl implements ParkingSpaceSharingQueriesGen {

    @GetMapping(value = "/parkingSpaceSharing/id/{id}")
    protected Boolean isParkingSpaceOffered(@PathVariable() String id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected void checkRequiredParametersOfIsParkingSpaceOffered(String id) {
        if (id == null)
            throw new IllegalArgumentException("Required parameter \"id\" must not be null");
    }
}
