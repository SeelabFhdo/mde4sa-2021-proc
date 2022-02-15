package de.fhdo.puls.chargingstationsearchmanagement.domain.ChargingStationSearch.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class LocationDataDtoGenImpl implements DddValueObject, LocationDataDtoGen {

    public LocationDataDtoGenImpl() {
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

    protected String lat;

    @Override
    public String getLat() {
        return lat;
    }

    @Override
    public void setLat(String lat) {
        this.lat = lat;
    }

    protected String lng;

    @Override
    public String getLng() {
        return lng;
    }

    @Override
    public void setLng(String lng) {
        this.lng = lng;
    }

    public LocationDataDtoGenImpl(String id, String refId, String address, String extFilter, String lat, String lng) {
        this.id = id;
        this.refId = refId;
        this.address = address;
        this.extFilter = extFilter;
        this.lat = lat;
        this.lng = lng;
    }
}
