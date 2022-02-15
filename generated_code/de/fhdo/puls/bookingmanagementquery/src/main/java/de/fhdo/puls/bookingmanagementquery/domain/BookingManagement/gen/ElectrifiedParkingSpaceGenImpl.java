package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class ElectrifiedParkingSpaceGenImpl implements DddValueObject, ElectrifiedParkingSpaceGen {

    public ElectrifiedParkingSpaceGenImpl() {
    }

    protected String parkingSpaceId;

    @Override
    public String getParkingSpaceId() {
        return parkingSpaceId;
    }

    protected String city;

    @Override
    public String getCity() {
        return city;
    }

    protected int postcode;

    @Override
    public int getPostcode() {
        return postcode;
    }

    protected String street;

    @Override
    public String getStreet() {
        return street;
    }

    protected String streetNumber;

    @Override
    public String getStreetNumber() {
        return streetNumber;
    }

    protected float bookingPricePerHour;

    @Override
    public float getBookingPricePerHour() {
        return bookingPricePerHour;
    }

    protected float chargingPricePerKwh;

    @Override
    public float getChargingPricePerKwh() {
        return chargingPricePerKwh;
    }

    public ElectrifiedParkingSpaceGenImpl(String parkingSpaceId, String city, int postcode, String street, String streetNumber, float bookingPricePerHour, float chargingPricePerKwh) {
        this.parkingSpaceId = parkingSpaceId;
        this.city = city;
        this.postcode = postcode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.bookingPricePerHour = bookingPricePerHour;
        this.chargingPricePerKwh = chargingPricePerKwh;
    }
}
