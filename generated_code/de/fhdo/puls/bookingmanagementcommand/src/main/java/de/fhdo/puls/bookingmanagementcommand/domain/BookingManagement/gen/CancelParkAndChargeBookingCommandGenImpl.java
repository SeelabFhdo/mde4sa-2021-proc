package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class CancelParkAndChargeBookingCommandGenImpl implements DddValueObject, CancelParkAndChargeBookingCommandGen {

    public CancelParkAndChargeBookingCommandGenImpl() {
    }

    protected long bookingId;

    @Override
    public long getBookingId() {
        return bookingId;
    }

    public CancelParkAndChargeBookingCommandGenImpl(long bookingId) {
        this.bookingId = bookingId;
    }
}
