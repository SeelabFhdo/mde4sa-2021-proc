package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class ParkingSpaceGenImpl implements DddValueObject, ParkingSpaceGen {

    public ParkingSpaceGenImpl() {
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

    protected String city;

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    protected int postcode;

    @Override
    public int getPostcode() {
        return postcode;
    }

    @Override
    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    protected String street;

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    protected String streetNumber;

    @Override
    public String getStreetNumber() {
        return streetNumber;
    }

    @Override
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    protected float bookingPricePerHour;

    @Override
    public float getBookingPricePerHour() {
        return bookingPricePerHour;
    }

    @Override
    public void setBookingPricePerHour(float bookingPricePerHour) {
        this.bookingPricePerHour = bookingPricePerHour;
    }

    public ParkingSpaceGenImpl(String parkingSpaceId, String city, int postcode, String street, String streetNumber, float bookingPricePerHour) {
        this.parkingSpaceId = parkingSpaceId;
        this.city = city;
        this.postcode = postcode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.bookingPricePerHour = bookingPricePerHour;
    }
}
