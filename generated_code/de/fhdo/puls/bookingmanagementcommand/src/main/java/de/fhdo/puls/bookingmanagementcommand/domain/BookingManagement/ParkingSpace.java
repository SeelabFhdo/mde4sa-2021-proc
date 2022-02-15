package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.ParkingSpaceGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkingSpaceGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkingSpace extends ParkingSpaceGenImpl {

    public ParkingSpace() {
        super();
    }

    public ParkingSpace(String parkingSpaceId, String city, int postcode, String street, String streetNumber, float bookingPricePerHour) {
        super(parkingSpaceId, city, postcode, street, streetNumber, bookingPricePerHour);
    }
}
