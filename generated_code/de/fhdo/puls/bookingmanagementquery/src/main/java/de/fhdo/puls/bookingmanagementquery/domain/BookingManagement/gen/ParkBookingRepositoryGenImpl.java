package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkBooking;
import org.springframework.stereotype.Repository;

@Repository()
public abstract class ParkBookingRepositoryGenImpl implements DddRepository, ParkBookingRepositoryGen {

    public ParkBookingRepositoryGenImpl() {
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

    protected ParkBooking parkBookingAggregate;

    @Override
    public ParkBooking getParkBookingAggregate() {
        return parkBookingAggregate;
    }

    @Override
    public void setParkBookingAggregate(ParkBooking parkBookingAggregate) {
        this.parkBookingAggregate = parkBookingAggregate;
    }

    public ParkBookingRepositoryGenImpl(long bookingId, ParkBooking parkBookingAggregate) {
        this.bookingId = bookingId;
        this.parkBookingAggregate = parkBookingAggregate;
    }
}
