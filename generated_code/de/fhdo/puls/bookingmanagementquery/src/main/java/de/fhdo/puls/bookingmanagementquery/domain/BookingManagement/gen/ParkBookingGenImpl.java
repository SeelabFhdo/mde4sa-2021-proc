package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.lemma.ddd.structure.DddPart;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;
import javax.persistence.Entity;

@Entity()
public abstract class ParkBookingGenImpl implements DddEntity, DddAggregate, ParkBookingGen {

    public ParkBookingGenImpl() {
    }

    @DddIdentifier()
    protected long bookingId;

    @Override
    public long getBookingId() {
        return bookingId;
    }

    @Override
    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    @DddPart()
    protected Booker booker;

    @Override
    public Booker getBooker() {
        return booker;
    }

    @Override
    public void setBooker(Booker booker) {
        this.booker = booker;
    }

    @DddPart()
    protected ParkingSpace parkingSpace;

    @Override
    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    @Override
    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    @DddPart()
    protected TimeSlot bookinTimeSlot;

    @Override
    public TimeSlot getBookinTimeSlot() {
        return bookinTimeSlot;
    }

    @Override
    public void setBookinTimeSlot(TimeSlot bookinTimeSlot) {
        this.bookinTimeSlot = bookinTimeSlot;
    }

    protected float bookingPriceTotal;

    @Override
    public float getBookingPriceTotal() {
        return bookingPriceTotal;
    }

    @Override
    public void setBookingPriceTotal(float bookingPriceTotal) {
        this.bookingPriceTotal = bookingPriceTotal;
    }

    protected boolean isCanceled;

    @Override
    public boolean getIsCanceled() {
        return isCanceled;
    }

    @Override
    public void setIsCanceled(boolean isCanceled) {
        this.isCanceled = isCanceled;
    }

    public ParkBookingGenImpl(long bookingId, Booker booker, ParkingSpace parkingSpace, TimeSlot bookinTimeSlot, float bookingPriceTotal, boolean isCanceled) {
        this.bookingId = bookingId;
        this.booker = booker;
        this.parkingSpace = parkingSpace;
        this.bookinTimeSlot = bookinTimeSlot;
        this.bookingPriceTotal = bookingPriceTotal;
        this.isCanceled = isCanceled;
    }
}
