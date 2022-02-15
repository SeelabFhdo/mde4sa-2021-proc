package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;

public abstract class ParkBookingVOGenImpl implements DddValueObject, ParkBookingVOGen {

    public ParkBookingVOGenImpl() {
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

    protected ParkingSpace parkingSpace;

    @Override
    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    @Override
    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
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

    protected boolean bookingCanceled;

    @Override
    public boolean getBookingCanceled() {
        return bookingCanceled;
    }

    @Override
    public void setBookingCanceled(boolean bookingCanceled) {
        this.bookingCanceled = bookingCanceled;
    }

    public ParkBookingVOGenImpl(long bookingId, Booker booker, ParkingSpace parkingSpace, TimeSlot timeSlot, float bookingPriceTotal, boolean bookingCanceled) {
        this.bookingId = bookingId;
        this.booker = booker;
        this.parkingSpace = parkingSpace;
        this.timeSlot = timeSlot;
        this.bookingPriceTotal = bookingPriceTotal;
        this.bookingCanceled = bookingCanceled;
    }
}
