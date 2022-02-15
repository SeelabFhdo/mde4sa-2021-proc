package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkContract;

public interface ParkContractRepositoryGen {

    String getSmartContractAddress();

    void setSmartContractAddress(String smartContractAddress);

    ParkContract getParkContractAggregate();

    void setParkContractAggregate(ParkContract parkContractAggregate);
}
