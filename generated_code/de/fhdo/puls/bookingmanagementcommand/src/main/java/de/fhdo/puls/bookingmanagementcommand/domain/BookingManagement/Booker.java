package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.BookerGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends BookerGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class Booker extends BookerGenImpl {

    public Booker() {
        super();
    }

    public Booker(long bookerId, String firstName, String lastName) {
        super(bookerId, firstName, lastName);
    }
}
