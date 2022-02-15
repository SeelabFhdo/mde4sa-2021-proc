package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class ReceiveEnvironmentDataCommandGenImpl implements DddValueObject, ReceiveEnvironmentDataCommandGen {

    public ReceiveEnvironmentDataCommandGenImpl() {
    }

    protected String sensorUnitId;

    @Override
    public String getSensorUnitId() {
        return sensorUnitId;
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

    protected int communicationType;

    @Override
    public int getCommunicationType() {
        return communicationType;
    }

    protected int signalPower;

    @Override
    public int getSignalPower() {
        return signalPower;
    }

    protected float signalNoiseRang;

    @Override
    public float getSignalNoiseRang() {
        return signalNoiseRang;
    }

    protected int spreadingFaktorDownlink;

    @Override
    public int getSpreadingFaktorDownlink() {
        return spreadingFaktorDownlink;
    }

    protected int spreadingFaktorUplink;

    @Override
    public int getSpreadingFaktorUplink() {
        return spreadingFaktorUplink;
    }

    public ReceiveEnvironmentDataCommandGenImpl(String sensorUnitId, float particulate2, float particulate10, int light, float temperature, float humidity, int communicationType, int signalPower, float signalNoiseRang, int spreadingFaktorDownlink, int spreadingFaktorUplink) {
        this.sensorUnitId = sensorUnitId;
        this.particulate2 = particulate2;
        this.particulate10 = particulate10;
        this.light = light;
        this.temperature = temperature;
        this.humidity = humidity;
        this.communicationType = communicationType;
        this.signalPower = signalPower;
        this.signalNoiseRang = signalNoiseRang;
        this.spreadingFaktorDownlink = spreadingFaktorDownlink;
        this.spreadingFaktorUplink = spreadingFaktorUplink;
    }
}
