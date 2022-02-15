package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import java.util.Date;

public abstract class ReceivedDataSetGenImpl implements DddValueObject, ReceivedDataSetGen {

    public ReceivedDataSetGenImpl() {
    }

    protected String sensorId;

    @Override
    public String getSensorId() {
        return sensorId;
    }

    @Override
    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    protected Date receivedTimeStamp;

    @Override
    public Date getReceivedTimeStamp() {
        return receivedTimeStamp;
    }

    @Override
    public void setReceivedTimeStamp(Date receivedTimeStamp) {
        this.receivedTimeStamp = receivedTimeStamp;
    }

    protected float particulate2;

    @Override
    public float getParticulate2() {
        return particulate2;
    }

    @Override
    public void setParticulate2(float particulate2) {
        this.particulate2 = particulate2;
    }

    protected float particulate10;

    @Override
    public float getParticulate10() {
        return particulate10;
    }

    @Override
    public void setParticulate10(float particulate10) {
        this.particulate10 = particulate10;
    }

    protected int light;

    @Override
    public int getLight() {
        return light;
    }

    @Override
    public void setLight(int light) {
        this.light = light;
    }

    protected float temperature;

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    protected float humidity;

    @Override
    public float getHumidity() {
        return humidity;
    }

    @Override
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public ReceivedDataSetGenImpl(String sensorId, Date receivedTimeStamp, float particulate2, float particulate10, int light, float temperature, float humidity) {
        this.sensorId = sensorId;
        this.receivedTimeStamp = receivedTimeStamp;
        this.particulate2 = particulate2;
        this.particulate10 = particulate10;
        this.light = light;
        this.temperature = temperature;
        this.humidity = humidity;
    }
}
