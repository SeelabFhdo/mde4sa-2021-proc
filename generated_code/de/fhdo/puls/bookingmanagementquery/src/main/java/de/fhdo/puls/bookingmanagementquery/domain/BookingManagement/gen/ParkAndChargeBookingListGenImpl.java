package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBooking;
import java.util.ArrayList;

public abstract class ParkAndChargeBookingListGenImpl extends ArrayList<ParkAndChargeBookingListGenImpl.ParkAndChargeBookingListItem> implements ParkAndChargeBookingListGen {

    public static class ParkAndChargeBookingListItem {

        public ParkAndChargeBookingListItem() {
        }

        private ParkAndChargeBooking parkAndChargeBooking;

        public ParkAndChargeBooking getParkAndChargeBooking() {
            return parkAndChargeBooking;
        }

        public void setParkAndChargeBooking(ParkAndChargeBooking parkAndChargeBooking) {
            this.parkAndChargeBooking = parkAndChargeBooking;
        }

        public ParkAndChargeBookingListItem(ParkAndChargeBooking parkAndChargeBooking) {
            this.parkAndChargeBooking = parkAndChargeBooking;
        }
    }
}
