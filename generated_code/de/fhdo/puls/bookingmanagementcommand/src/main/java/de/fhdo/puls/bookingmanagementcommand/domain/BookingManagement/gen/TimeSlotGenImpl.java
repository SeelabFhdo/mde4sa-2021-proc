package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import java.util.Date;

public abstract class TimeSlotGenImpl implements DddValueObject, TimeSlotGen {

    public TimeSlotGenImpl() {
    }

    protected Date startOfBooking;

    @Override
    public Date getStartOfBooking() {
        return startOfBooking;
    }

    @Override
    public void setStartOfBooking(Date startOfBooking) {
        this.startOfBooking = startOfBooking;
    }

    protected Date endOfBooking;

    @Override
    public Date getEndOfBooking() {
        return endOfBooking;
    }

    @Override
    public void setEndOfBooking(Date endOfBooking) {
        this.endOfBooking = endOfBooking;
    }

    public TimeSlotGenImpl(Date startOfBooking, Date endOfBooking) {
        this.startOfBooking = startOfBooking;
        this.endOfBooking = endOfBooking;
    }
}
