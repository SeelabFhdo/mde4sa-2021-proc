package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBooking;
import java.util.ArrayList;

public abstract class ParkBookingListGenImpl extends ArrayList<ParkBookingListGenImpl.ParkBookingListItem> implements ParkBookingListGen {

    public static class ParkBookingListItem {

        public ParkBookingListItem() {
        }

        private ParkBooking parkBooking;

        public ParkBooking getParkBooking() {
            return parkBooking;
        }

        public void setParkBooking(ParkBooking parkBooking) {
            this.parkBooking = parkBooking;
        }

        public ParkBookingListItem(ParkBooking parkBooking) {
            this.parkBooking = parkBooking;
        }
    }
}
