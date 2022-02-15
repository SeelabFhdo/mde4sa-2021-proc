package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;

public interface ParkBookingVOGen {

    long getBookingId();

    void setBookingId(long bookingId);

    Booker getBooker();

    void setBooker(Booker booker);

    ParkingSpace getParkingSpace();

    void setParkingSpace(ParkingSpace parkingSpace);

    TimeSlot getTimeSlot();

    void setTimeSlot(TimeSlot timeSlot);

    float getBookingPriceTotal();

    void setBookingPriceTotal(float bookingPriceTotal);

    boolean getBookingCanceled();

    void setBookingCanceled(boolean bookingCanceled);
}
