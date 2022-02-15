package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen.ParkContractGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ParkContractGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ParkContract extends ParkContractGenImpl {

    public ParkContract() {
        super();
    }

    public ParkContract(long smartContractId, String contractAddress) {
        super(smartContractId, contractAddress);
    }
}
