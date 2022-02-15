package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class CancelParkBookingCommandGenImpl implements DddValueObject, CancelParkBookingCommandGen {

    public CancelParkBookingCommandGenImpl() {
    }

    protected long bookingId;

    @Override
    public long getBookingId() {
        return bookingId;
    }

    public CancelParkBookingCommandGenImpl(long bookingId) {
        this.bookingId = bookingId;
    }
}
