package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;

public abstract class ParkAndChargeBookingVOGenImpl implements DddValueObject, ParkAndChargeBookingVOGen {

    public ParkAndChargeBookingVOGenImpl() {
    }

    protected long bookingId;

    @Override
    public long getBookingId() {
        return bookingId;
    }

    @Override
    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    protected Booker booker;

    @Override
    public Booker getBooker() {
        return booker;
    }

    @Override
    public void setBooker(Booker booker) {
        this.booker = booker;
    }

    protected ElectrifiedParkingSpace eParkingSpace;

    @Override
    public ElectrifiedParkingSpace getEParkingSpace() {
        return eParkingSpace;
    }

    @Override
    public void setEParkingSpace(ElectrifiedParkingSpace eParkingSpace) {
        this.eParkingSpace = eParkingSpace;
    }

    protected TimeSlot timeSlot;

    @Override
    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    @Override
    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    protected float bookingPriceTotal;

    @Override
    public float getBookingPriceTotal() {
        return bookingPriceTotal;
    }

    @Override
    public void setBookingPriceTotal(float bookingPriceTotal) {
        this.bookingPriceTotal = bookingPriceTotal;
    }

    protected int verifyCode;

    @Override
    public int getVerifyCode() {
        return verifyCode;
    }

    @Override
    public void setVerifyCode(int verifyCode) {
        this.verifyCode = verifyCode;
    }

    protected boolean bookingCanceled;

    @Override
    public boolean getBookingCanceled() {
        return bookingCanceled;
    }

    @Override
    public void setBookingCanceled(boolean bookingCanceled) {
        this.bookingCanceled = bookingCanceled;
    }

    public ParkAndChargeBookingVOGenImpl(long bookingId, Booker booker, ElectrifiedParkingSpace eParkingSpace, TimeSlot timeSlot, float bookingPriceTotal, int verifyCode, boolean bookingCanceled) {
        this.bookingId = bookingId;
        this.booker = booker;
        this.eParkingSpace = eParkingSpace;
        this.timeSlot = timeSlot;
        this.bookingPriceTotal = bookingPriceTotal;
        this.verifyCode = verifyCode;
        this.bookingCanceled = bookingCanceled;
    }
}
