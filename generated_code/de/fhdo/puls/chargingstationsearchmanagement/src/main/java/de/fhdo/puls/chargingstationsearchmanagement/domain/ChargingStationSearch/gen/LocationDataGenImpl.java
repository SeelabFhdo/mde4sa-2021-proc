package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.lemma.ddd.structure.DddPart;
import de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.Location;
import javax.persistence.Entity;

@Entity()
public abstract class LocationDataGenImpl implements DddEntity, DddAggregate, LocationDataGen {

    public LocationDataGenImpl() {
    }

    @DddIdentifier()
    protected String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    protected String refId;

    @Override
    public String getRefId() {
        return refId;
    }

    @Override
    public void setRefId(String refId) {
        this.refId = refId;
    }

    protected String address;

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    protected String extFilter;

    @Override
    public String getExtFilter() {
        return extFilter;
    }

    @Override
    public void setExtFilter(String extFilter) {
        this.extFilter = extFilter;
    }

    @DddPart()
    protected Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    public LocationDataGenImpl(String id, String refId, String address, String extFilter, Location location) {
        this.id = id;
        this.refId = refId;
        this.address = address;
        this.extFilter = extFilter;
        this.location = location;
    }
}
