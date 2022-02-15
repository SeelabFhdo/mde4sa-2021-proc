package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class BlockchainDataParkAndChargeBookingGenImpl implements DddValueObject, BlockchainDataParkAndChargeBookingGen {

    public BlockchainDataParkAndChargeBookingGenImpl() {
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

    protected long bookerId;

    @Override
    public long getBookerId() {
        return bookerId;
    }

    @Override
    public void setBookerId(long bookerId) {
        this.bookerId = bookerId;
    }

    protected String parkingSpaceId;

    @Override
    public String getParkingSpaceId() {
        return parkingSpaceId;
    }

    @Override
    public void setParkingSpaceId(String parkingSpaceId) {
        this.parkingSpaceId = parkingSpaceId;
    }

    protected String startOfBooking;

    @Override
    public String getStartOfBooking() {
        return startOfBooking;
    }

    @Override
    public void setStartOfBooking(String startOfBooking) {
        this.startOfBooking = startOfBooking;
    }

    protected String endOfBooking;

    @Override
    public String getEndOfBooking() {
        return endOfBooking;
    }

    @Override
    public void setEndOfBooking(String endOfBooking) {
        this.endOfBooking = endOfBooking;
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

    protected int verifyCode;

    @Override
    public int getVerifyCode() {
        return verifyCode;
    }

    @Override
    public void setVerifyCode(int verifyCode) {
        this.verifyCode = verifyCode;
    }

    protected boolean bookingCanceled;

    @Override
    public boolean getBookingCanceled() {
        return bookingCanceled;
    }

    @Override
    public void setBookingCanceled(boolean bookingCanceled) {
        this.bookingCanceled = bookingCanceled;
    }

    protected String bookingCreatedTimeStamp;

    @Override
    public String getBookingCreatedTimeStamp() {
        return bookingCreatedTimeStamp;
    }

    @Override
    public void setBookingCreatedTimeStamp(String bookingCreatedTimeStamp) {
        this.bookingCreatedTimeStamp = bookingCreatedTimeStamp;
    }

    public BlockchainDataParkAndChargeBookingGenImpl(long bookingId, long bookerId, String parkingSpaceId, String startOfBooking, String endOfBooking, float bookingPriceTotal, int verifyCode, boolean bookingCanceled, String bookingCreatedTimeStamp) {
        this.bookingId = bookingId;
        this.bookerId = bookerId;
        this.parkingSpaceId = parkingSpaceId;
        this.startOfBooking = startOfBooking;
        this.endOfBooking = endOfBooking;
        this.bookingPriceTotal = bookingPriceTotal;
        this.verifyCode = verifyCode;
        this.bookingCanceled = bookingCanceled;
        this.bookingCreatedTimeStamp = bookingCreatedTimeStamp;
    }
}
