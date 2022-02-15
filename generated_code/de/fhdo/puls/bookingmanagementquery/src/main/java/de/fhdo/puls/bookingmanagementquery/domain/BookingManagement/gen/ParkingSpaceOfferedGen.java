package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.Location;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkingSpaceSize;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.TimePeriods;

public interface ParkingSpaceOfferedGen {

    String getParkingSpaceId();

    String getName();

    String getDescription();

    long getOwnerId();

    float getParkingPricePerHour();

    Location getLocation();

    TimePeriods getAvailabilityPeriods();

    ParkingSpaceSize getParkingSpaceSize();
}
