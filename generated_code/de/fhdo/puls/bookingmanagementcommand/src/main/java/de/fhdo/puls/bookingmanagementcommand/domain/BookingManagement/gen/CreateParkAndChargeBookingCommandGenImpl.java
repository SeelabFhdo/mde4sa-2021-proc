package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.TimeSlot;

public abstract class CreateParkAndChargeBookingCommandGenImpl implements DddValueObject, CreateParkAndChargeBookingCommandGen {

    public CreateParkAndChargeBookingCommandGenImpl() {
    }

    protected Booker booker;

    @Override
    public Booker getBooker() {
        return booker;
    }

    protected ElectrifiedParkingSpace electrifiedParkingSpace;

    @Override
    public ElectrifiedParkingSpace getElectrifiedParkingSpace() {
        return electrifiedParkingSpace;
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

    public CreateParkAndChargeBookingCommandGenImpl(Booker booker, ElectrifiedParkingSpace electrifiedParkingSpace, TimeSlot timeSlot, float bookingPriceTotal) {
        this.booker = booker;
        this.electrifiedParkingSpace = electrifiedParkingSpace;
        this.timeSlot = timeSlot;
        this.bookingPriceTotal = bookingPriceTotal;
    }
}
