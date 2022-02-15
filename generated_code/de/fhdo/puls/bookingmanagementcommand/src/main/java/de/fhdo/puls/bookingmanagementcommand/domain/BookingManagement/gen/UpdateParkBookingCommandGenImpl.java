package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;

public abstract class UpdateParkBookingCommandGenImpl implements DddValueObject, UpdateParkBookingCommandGen {

    public UpdateParkBookingCommandGenImpl() {
    }

    protected long bookingId;

    @Override
    public long getBookingId() {
        return bookingId;
    }

    protected TimeSlot timeSlot;

    @Override
    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    protected float bookingPriceTotal;

    @Override
    public float getBookingPriceTotal() {
        return bookingPriceTotal;
    }

    public UpdateParkBookingCommandGenImpl(long bookingId, TimeSlot timeSlot, float bookingPriceTotal) {
        this.bookingId = bookingId;
        this.timeSlot = timeSlot;
        this.bookingPriceTotal = bookingPriceTotal;
    }
}
