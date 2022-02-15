package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;

public abstract class CreateParkBookingCommandGenImpl implements DddValueObject, CreateParkBookingCommandGen {

    public CreateParkBookingCommandGenImpl() {
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

    protected float bookingPriceTotal;

    @Override
    public float getBookingPriceTotal() {
        return bookingPriceTotal;
    }

    public CreateParkBookingCommandGenImpl(Booker booker, ParkingSpace parkingSpace, TimeSlot timeSlot, float bookingPriceTotal) {
        this.booker = booker;
        this.parkingSpace = parkingSpace;
        this.timeSlot = timeSlot;
        this.bookingPriceTotal = bookingPriceTotal;
    }
}
