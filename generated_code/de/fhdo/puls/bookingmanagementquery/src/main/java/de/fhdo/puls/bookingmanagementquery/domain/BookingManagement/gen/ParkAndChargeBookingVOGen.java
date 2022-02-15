package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;

public interface ParkAndChargeBookingVOGen {

    long getBookingId();

    void setBookingId(long bookingId);

    Booker getBooker();

    void setBooker(Booker booker);

    ElectrifiedParkingSpace getEParkingSpace();

    void setEParkingSpace(ElectrifiedParkingSpace eParkingSpace);

    TimeSlot getTimeSlot();

    void setTimeSlot(TimeSlot timeSlot);

    float getBookingPriceTotal();

    void setBookingPriceTotal(float bookingPriceTotal);

    int getVerifyCode();

    void setVerifyCode(int verifyCode);

    boolean getBookingCanceled();

    void setBookingCanceled(boolean bookingCanceled);
}
