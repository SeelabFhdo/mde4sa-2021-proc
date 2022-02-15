package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import javax.persistence.Entity;

@Entity()
public abstract class ParkAndChargeContractAggregateGenImpl implements DddEntity, DddAggregate, ParkAndChargeContractAggregateGen {

    public ParkAndChargeContractAggregateGenImpl() {
    }

    @DddIdentifier()
    protected long smartContractId;

    @Override
    public long getSmartContractId() {
        return smartContractId;
    }

    @Override
    public void setSmartContractId(long smartContractId) {
        this.smartContractId = smartContractId;
    }

    protected String contractAddress;

    @Override
    public String getContractAddress() {
        return contractAddress;
    }

    @Override
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public ParkAndChargeContractAggregateGenImpl(long smartContractId, String contractAddress) {
        this.smartContractId = smartContractId;
        this.contractAddress = contractAddress;
    }
}
