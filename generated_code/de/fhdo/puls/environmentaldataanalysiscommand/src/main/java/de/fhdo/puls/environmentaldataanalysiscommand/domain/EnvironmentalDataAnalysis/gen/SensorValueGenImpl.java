package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;
import java.util.Date;

public abstract class SensorValueGenImpl implements DddValueObject, SensorValueGen {

    public SensorValueGenImpl() {
    }

    protected String value;

    @Override
    public String getValue() {
        return value;
    }

    protected Date timestamp;

    @Override
    public Date getTimestamp() {
        return timestamp;
    }

    public SensorValueGenImpl(String value, Date timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}
