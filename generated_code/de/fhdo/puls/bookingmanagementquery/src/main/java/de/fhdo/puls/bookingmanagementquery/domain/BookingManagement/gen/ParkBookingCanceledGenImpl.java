package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class ParkBookingCanceledGenImpl implements DddValueObject, DddDomainEvent, ParkBookingCanceledGen {

    public ParkBookingCanceledGenImpl() {
    }

    protected long bookingId;

    @Override
    public long getBookingId() {
        return bookingId;
    }

    protected boolean bookingCanceled;

    @Override
    public boolean getBookingCanceled() {
        return bookingCanceled;
    }

    public ParkBookingCanceledGenImpl(long bookingId, boolean bookingCanceled) {
        this.bookingId = bookingId;
        this.bookingCanceled = bookingCanceled;
    }
}
