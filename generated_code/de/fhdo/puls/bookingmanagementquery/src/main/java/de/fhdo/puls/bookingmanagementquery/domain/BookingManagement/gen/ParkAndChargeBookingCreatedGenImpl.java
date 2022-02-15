package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;
import java.util.Date;

public abstract class ParkAndChargeBookingCreatedGenImpl implements DddValueObject, DddDomainEvent, ParkAndChargeBookingCreatedGen {

    public ParkAndChargeBookingCreatedGenImpl() {
    }

    protected long bookingId;

    @Override
    public long getBookingId() {
        return bookingId;
    }

    protected Booker booker;

    @Override
    public Booker getBooker() {
        return booker;
    }

    protected ParkingSpace parkingSpace;

    @Override
    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    protected TimeSlot timeSlot;

    @Override
    public TimeSlot getTimeSlot() {
        return timeSlot;
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

    protected float bookingPricePerHour;

    @Override
    public float getBookingPricePerHour() {
        return bookingPricePerHour;
    }

    protected float bookingPriceTotal;

    @Override
    public float getBookingPriceTotal() {
        return bookingPriceTotal;
    }

    protected int verifycode;

    @Override
    public int getVerifycode() {
        return verifycode;
    }

    public ParkAndChargeBookingCreatedGenImpl(long bookingId, Booker booker, ParkingSpace parkingSpace, TimeSlot timeSlot, Date bookingCreatedDate, Date lastModifiedDate, float bookingPricePerHour, float bookingPriceTotal, int verifycode) {
        this.bookingId = bookingId;
        this.booker = booker;
        this.parkingSpace = parkingSpace;
        this.timeSlot = timeSlot;
        this.bookingCreatedDate = bookingCreatedDate;
        this.lastModifiedDate = lastModifiedDate;
        this.bookingPricePerHour = bookingPricePerHour;
        this.bookingPriceTotal = bookingPriceTotal;
        this.verifycode = verifycode;
    }
}
