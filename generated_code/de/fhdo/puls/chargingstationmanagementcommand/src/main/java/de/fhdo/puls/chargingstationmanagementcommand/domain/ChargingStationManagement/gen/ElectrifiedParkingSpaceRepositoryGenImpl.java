package de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.ElectrifiedParkingSpace;
import org.springframework.stereotype.Repository;

@Repository()
public abstract class ElectrifiedParkingSpaceRepositoryGenImpl implements DddRepository, ElectrifiedParkingSpaceRepositoryGen {

    public ElectrifiedParkingSpaceRepositoryGenImpl() {
    }

    protected ElectrifiedParkingSpace electrifiedParkingSpaceAggregate;

    @Override
    public ElectrifiedParkingSpace getElectrifiedParkingSpaceAggregate() {
        return electrifiedParkingSpaceAggregate;
    }

    @Override
    public void setElectrifiedParkingSpaceAggregate(ElectrifiedParkingSpace electrifiedParkingSpaceAggregate) {
        this.electrifiedParkingSpaceAggregate = electrifiedParkingSpaceAggregate;
    }

    protected String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public ElectrifiedParkingSpaceRepositoryGenImpl(ElectrifiedParkingSpace electrifiedParkingSpaceAggregate, String id) {
        this.electrifiedParkingSpaceAggregate = electrifiedParkingSpaceAggregate;
        this.id = id;
    }
}
