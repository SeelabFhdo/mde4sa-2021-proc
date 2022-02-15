package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;
import java.util.Date;

public abstract class ParkAndChargeBookingUpdatedGenImpl implements DddValueObject, DddDomainEvent, ParkAndChargeBookingUpdatedGen {

    public ParkAndChargeBookingUpdatedGenImpl() {
    }

    protected long bookingId;

    @Override
    public long getBookingId() {
        return bookingId;
    }

    protected Date bookingCreatedDate;

    @Override
    public Date getBookingCreatedDate() {
        return bookingCreatedDate;
    }

    protected Date lastModifiedDate;

    @Override
    public Date getLastModifiedDate() {
        return lastModifiedDate;
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

    public ParkAndChargeBookingUpdatedGenImpl(long bookingId, Date bookingCreatedDate, Date lastModifiedDate, TimeSlot timeSlot, float bookingPriceTotal) {
        this.bookingId = bookingId;
        this.bookingCreatedDate = bookingCreatedDate;
        this.lastModifiedDate = lastModifiedDate;
        this.timeSlot = timeSlot;
        this.bookingPriceTotal = bookingPriceTotal;
    }
}
