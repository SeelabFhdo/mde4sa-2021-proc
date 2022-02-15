package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;

public interface ParkBookingGen {

    long getBookingId();

    void setBookingId(long bookingId);

    Booker getBooker();

    void setBooker(Booker booker);

    ParkingSpace getParkingSpace();

    void setParkingSpace(ParkingSpace parkingSpace);

    TimeSlot getBookinTimeSlot();

    void setBookinTimeSlot(TimeSlot bookinTimeSlot);

    float getBookingPriceTotal();

    void setBookingPriceTotal(float bookingPriceTotal);

    boolean getIsCanceled();

    void setIsCanceled(boolean isCanceled);
}
