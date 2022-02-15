package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeBooking;
import org.springframework.stereotype.Repository;

@Repository()
public abstract class ParkAndChargeBookingRepositoryGenImpl implements DddRepository, ParkAndChargeBookingRepositoryGen {

    public ParkAndChargeBookingRepositoryGenImpl() {
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

    protected ParkAndChargeBooking parkBookingAggregate;

    @Override
    public ParkAndChargeBooking getParkBookingAggregate() {
        return parkBookingAggregate;
    }

    @Override
    public void setParkBookingAggregate(ParkAndChargeBooking parkBookingAggregate) {
        this.parkBookingAggregate = parkBookingAggregate;
    }

    public ParkAndChargeBookingRepositoryGenImpl(long bookingId, ParkAndChargeBooking parkBookingAggregate) {
        this.bookingId = bookingId;
        this.parkBookingAggregate = parkBookingAggregate;
    }
}
