package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.lemma.ddd.structure.DddPart;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Booker;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ElectrifiedParkingSpace;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimeSlot;
import javax.persistence.Entity;

@Entity()
public abstract class ParkAndChargeBookingGenImpl implements DddEntity, DddAggregate, ParkAndChargeBookingGen {

    public ParkAndChargeBookingGenImpl() {
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
    protected ElectrifiedParkingSpace electifiedParkingSpace;

    @Override
    public ElectrifiedParkingSpace getElectifiedParkingSpace() {
        return electifiedParkingSpace;
    }

    @Override
    public void setElectifiedParkingSpace(ElectrifiedParkingSpace electifiedParkingSpace) {
        this.electifiedParkingSpace = electifiedParkingSpace;
    }

    @DddPart()
    protected TimeSlot bookingTimeSlot;

    @Override
    public TimeSlot getBookingTimeSlot() {
        return bookingTimeSlot;
    }

    @Override
    public void setBookingTimeSlot(TimeSlot bookingTimeSlot) {
        this.bookingTimeSlot = bookingTimeSlot;
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

    protected int verifyCode;

    @Override
    public int getVerifyCode() {
        return verifyCode;
    }

    @Override
    public void setVerifyCode(int verifyCode) {
        this.verifyCode = verifyCode;
    }

    public ParkAndChargeBookingGenImpl(long bookingId, Booker booker, ElectrifiedParkingSpace electifiedParkingSpace, TimeSlot bookingTimeSlot, float bookingPriceTotal, boolean isCanceled, int verifyCode) {
        this.bookingId = bookingId;
        this.booker = booker;
        this.electifiedParkingSpace = electifiedParkingSpace;
        this.bookingTimeSlot = bookingTimeSlot;
        this.bookingPriceTotal = bookingPriceTotal;
        this.isCanceled = isCanceled;
        this.verifyCode = verifyCode;
    }
}
