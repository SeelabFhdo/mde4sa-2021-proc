package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.ParkAndChargeContractAggregate;
import org.springframework.stereotype.Repository;

@Repository()
public abstract class ParkAndChargeContractRepositoryGenImpl implements DddRepository, ParkAndChargeContractRepositoryGen {

    public ParkAndChargeContractRepositoryGenImpl() {
    }

    protected ParkAndChargeContractAggregate parkAndChargeContractAggregate;

    @Override
    public ParkAndChargeContractAggregate getParkAndChargeContractAggregate() {
        return parkAndChargeContractAggregate;
    }

    @Override
    public void setParkAndChargeContractAggregate(ParkAndChargeContractAggregate parkAndChargeContractAggregate) {
        this.parkAndChargeContractAggregate = parkAndChargeContractAggregate;
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

    public ParkAndChargeContractRepositoryGenImpl(ParkAndChargeContractAggregate parkAndChargeContractAggregate, String smartContractAddress) {
        this.parkAndChargeContractAggregate = parkAndChargeContractAggregate;
        this.smartContractAddress = smartContractAddress;
    }
}
