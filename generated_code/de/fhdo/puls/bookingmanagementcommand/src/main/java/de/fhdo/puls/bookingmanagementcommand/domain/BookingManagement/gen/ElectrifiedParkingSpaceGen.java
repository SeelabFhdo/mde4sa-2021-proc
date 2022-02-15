package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

public interface ElectrifiedParkingSpaceGen {

    String getParkingSpaceId();

    void setParkingSpaceId(String parkingSpaceId);

    String getCity();

    void setCity(String city);

    int getPostcode();

    void setPostcode(int postcode);

    String getStreet();

    void setStreet(String street);

    String getStreetNumber();

    void setStreetNumber(String streetNumber);

    float getBookingPricePerHour();

    void setBookingPricePerHour(float bookingPricePerHour);

    float getChargingPricePerKwh();

    void setChargingPricePerKwh(float chargingPricePerKwh);
}
