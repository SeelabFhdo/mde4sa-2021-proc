package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

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

    protected Date endOfBooking;

    @Override
    public Date getEndOfBooking() {
        return endOfBooking;
    }

    public TimeSlotGenImpl(Date startOfBooking, Date endOfBooking) {
        this.startOfBooking = startOfBooking;
        this.endOfBooking = endOfBooking;
    }
}
