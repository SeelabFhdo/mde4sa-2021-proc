package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen.BlockchainDataParkBookingGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends BlockchainDataParkBookingGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class BlockchainDataParkBooking extends BlockchainDataParkBookingGenImpl {

    public BlockchainDataParkBooking() {
        super();
    }

    public BlockchainDataParkBooking(long bookingId, long bookerId, String parkingSpaceId, String startOfBooking, String endOfBooking, float bookingPriceTotal, boolean bookingCanceled, String bookingCreatedTimeStamp) {
        super(bookingId, bookerId, parkingSpaceId, startOfBooking, endOfBooking, bookingPriceTotal, bookingCanceled, bookingCreatedTimeStamp);
    }
}
