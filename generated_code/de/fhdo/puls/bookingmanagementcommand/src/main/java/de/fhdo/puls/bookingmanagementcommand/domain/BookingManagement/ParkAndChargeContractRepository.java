package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkAndChargeContractAggregate;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.ParkAndChargeContractRepositoryGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkAndChargeContractRepositoryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkAndChargeContractRepository extends ParkAndChargeContractRepositoryGenImpl {

    public ParkAndChargeContractRepository() {
        super();
    }

    public ParkAndChargeContractRepository(ParkAndChargeContractAggregate parkAndChargeContractAggregate, String smartContractAddress) {
        super(parkAndChargeContractAggregate, smartContractAddress);
    }
}
