package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.ParkingSpace;
import org.springframework.stereotype.Repository;

@Repository()
public abstract class ParkingSpaceRepositoryGenImpl implements DddRepository, ParkingSpaceRepositoryGen {

    public ParkingSpaceRepositoryGenImpl() {
    }

    protected ParkingSpace parkingSpaceAggregate;

    @Override
    public ParkingSpace getParkingSpaceAggregate() {
        return parkingSpaceAggregate;
    }

    @Override
    public void setParkingSpaceAggregate(ParkingSpace parkingSpaceAggregate) {
        this.parkingSpaceAggregate = parkingSpaceAggregate;
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

    public ParkingSpaceRepositoryGenImpl(ParkingSpace parkingSpaceAggregate, String id) {
        this.parkingSpaceAggregate = parkingSpaceAggregate;
        this.id = id;
    }
}
