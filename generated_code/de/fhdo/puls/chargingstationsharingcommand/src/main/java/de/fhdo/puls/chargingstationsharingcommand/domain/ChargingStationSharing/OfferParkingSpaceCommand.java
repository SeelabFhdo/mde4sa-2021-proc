package de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing;

import de.fhdo.puls.chargingstationsharingcommand.domain.ChargingStationSharing.gen.OfferParkingSpaceCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends OfferParkingSpaceCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class OfferParkingSpaceCommand extends OfferParkingSpaceCommandGenImpl {

    public OfferParkingSpaceCommand() {
        super();
    }

    public OfferParkingSpaceCommand(String parkingSpaceId, long ownerId) {
        super(parkingSpaceId, ownerId);
    }
}
