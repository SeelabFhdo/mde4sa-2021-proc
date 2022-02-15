package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.Status;
import java.util.Date;

public abstract class CPIChangeMessageGenImpl implements DddValueObject, CPIChangeMessageGen {

    public CPIChangeMessageGenImpl() {
    }

    protected long chargingPointId;

    @Override
    public long getChargingPointId() {
        return chargingPointId;
    }

    @Override
    public void setChargingPointId(long chargingPointId) {
        this.chargingPointId = chargingPointId;
    }

    protected float chargedEnergy;

    @Override
    public float getChargedEnergy() {
        return chargedEnergy;
    }

    @Override
    public void setChargedEnergy(float chargedEnergy) {
        this.chargedEnergy = chargedEnergy;
    }

    protected String userId;

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    protected float current_L1;

    @Override
    public float getCurrent_L1() {
        return current_L1;
    }

    @Override
    public void setCurrent_L1(float current_L1) {
        this.current_L1 = current_L1;
    }

    protected float current_L2;

    @Override
    public float getCurrent_L2() {
        return current_L2;
    }

    @Override
    public void setCurrent_L2(float current_L2) {
        this.current_L2 = current_L2;
    }

    protected float current_L3;

    @Override
    public float getCurrent_L3() {
        return current_L3;
    }

    @Override
    public void setCurrent_L3(float current_L3) {
        this.current_L3 = current_L3;
    }

    protected float voltage_L1;

    @Override
    public float getVoltage_L1() {
        return voltage_L1;
    }

    @Override
    public void setVoltage_L1(float voltage_L1) {
        this.voltage_L1 = voltage_L1;
    }

    protected float voltage_L2;

    @Override
    public float getVoltage_L2() {
        return voltage_L2;
    }

    @Override
    public void setVoltage_L2(float voltage_L2) {
        this.voltage_L2 = voltage_L2;
    }

    protected float voltage_L3;

    @Override
    public float getVoltage_L3() {
        return voltage_L3;
    }

    @Override
    public void setVoltage_L3(float voltage_L3) {
        this.voltage_L3 = voltage_L3;
    }

    protected int current_Limit;

    @Override
    public int getCurrent_Limit() {
        return current_Limit;
    }

    @Override
    public void setCurrent_Limit(int current_Limit) {
        this.current_Limit = current_Limit;
    }

    protected Date timestamp;

    @Override
    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    protected Status status;

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    public CPIChangeMessageGenImpl(long chargingPointId, float chargedEnergy, String userId, float current_L1, float current_L2, float current_L3, float voltage_L1, float voltage_L2, float voltage_L3, int current_Limit, Date timestamp, Status status) {
        this.chargingPointId = chargingPointId;
        this.chargedEnergy = chargedEnergy;
        this.userId = userId;
        this.current_L1 = current_L1;
        this.current_L2 = current_L2;
        this.current_L3 = current_L3;
        this.voltage_L1 = voltage_L1;
        this.voltage_L2 = voltage_L2;
        this.voltage_L3 = voltage_L3;
        this.current_Limit = current_Limit;
        this.timestamp = timestamp;
        this.status = status;
    }
}
