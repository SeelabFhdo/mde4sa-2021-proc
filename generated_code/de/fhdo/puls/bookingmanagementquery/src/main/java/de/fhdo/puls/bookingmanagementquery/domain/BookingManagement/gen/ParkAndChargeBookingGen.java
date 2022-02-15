package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;

public interface ParkAndChargeBookingGen {

    long getBookingId();

    void setBookingId(long bookingId);

    Booker getBooker();

    void setBooker(Booker booker);

    ElectrifiedParkingSpace getElectifiedParkingSpace();

    void setElectifiedParkingSpace(ElectrifiedParkingSpace electifiedParkingSpace);

    TimeSlot getBookingTimeSlot();

    void setBookingTimeSlot(TimeSlot bookingTimeSlot);

    float getBookingPriceTotal();

    void setBookingPriceTotal(float bookingPriceTotal);

    boolean getIsCanceled();

    void setIsCanceled(boolean isCanceled);

    int getVerifyCode();

    void setVerifyCode(int verifyCode);
}
