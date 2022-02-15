package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkContract;
import org.springframework.stereotype.Repository;

@Repository()
public abstract class ParkContractRepositoryGenImpl implements DddRepository, ParkContractRepositoryGen {

    public ParkContractRepositoryGenImpl() {
    }

    protected String smartContractAddress;

    @Override
    public String getSmartContractAddress() {
        return smartContractAddress;
    }

    @Override
    public void setSmartContractAddress(String smartContractAddress) {
        this.smartContractAddress = smartContractAddress;
    }

    protected ParkContract parkContractAggregate;

    @Override
    public ParkContract getParkContractAggregate() {
        return parkContractAggregate;
    }

    @Override
    public void setParkContractAggregate(ParkContract parkContractAggregate) {
        this.parkContractAggregate = parkContractAggregate;
    }

    public ParkContractRepositoryGenImpl(String smartContractAddress, ParkContract parkContractAggregate) {
        this.smartContractAddress = smartContractAddress;
        this.parkContractAggregate = parkContractAggregate;
    }
}
