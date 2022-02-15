package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkContract;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen.ParkContractRepositoryGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkContractRepositoryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkContractRepository extends ParkContractRepositoryGenImpl {

    public ParkContractRepository() {
        super();
    }

    public ParkContractRepository(String smartContractAddress, ParkContract parkContractAggregate) {
        super(smartContractAddress, parkContractAggregate);
    }
}
