package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ChargingType;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Location;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpaceSize;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimePeriods;

public interface ElectrifiedParkingSpaceOfferedGen {

    String getParkingSpaceId();

    String getName();

    String getDescription();

    long getOwnerId();

    float getParkingPricePerHour();

    float getChargingPricePerKWH();

    Location getLocation();

    TimePeriods getAvailabilityPeriods();

    ParkingSpaceSize getParkingSpaceSize();

    ChargingType getChargingType();

    String getPluginType();
}
