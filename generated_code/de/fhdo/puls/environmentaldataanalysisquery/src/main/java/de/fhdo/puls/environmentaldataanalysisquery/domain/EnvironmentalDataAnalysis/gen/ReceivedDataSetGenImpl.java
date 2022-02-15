package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

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

    protected Date receivedTimeStamp;

    @Override
    public Date getReceivedTimeStamp() {
        return receivedTimeStamp;
    }

    protected float particulate2;

    @Override
    public float getParticulate2() {
        return particulate2;
    }

    protected float particulate10;

    @Override
    public float getParticulate10() {
        return particulate10;
    }

    protected int light;

    @Override
    public int getLight() {
        return light;
    }

    protected float temperature;

    @Override
    public float getTemperature() {
        return temperature;
    }

    protected float humidity;

    @Override
    public float getHumidity() {
        return humidity;
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
