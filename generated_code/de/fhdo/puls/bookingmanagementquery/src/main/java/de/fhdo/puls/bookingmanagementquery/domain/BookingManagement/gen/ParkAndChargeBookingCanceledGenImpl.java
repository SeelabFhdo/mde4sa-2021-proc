package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class ParkAndChargeBookingCanceledGenImpl implements DddValueObject, DddDomainEvent, ParkAndChargeBookingCanceledGen {

    public ParkAndChargeBookingCanceledGenImpl() {
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

    public ParkAndChargeBookingCanceledGenImpl(long bookingId, boolean bookingCanceled) {
        this.bookingId = bookingId;
        this.bookingCanceled = bookingCanceled;
    }
}
