package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import javax.persistence.Entity;

@Entity()
public abstract class ParkContractGenImpl implements DddEntity, ParkContractGen {

    public ParkContractGenImpl() {
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

    public ParkContractGenImpl(long smartContractId, String contractAddress) {
        this.smartContractId = smartContractId;
        this.contractAddress = contractAddress;
    }
}
