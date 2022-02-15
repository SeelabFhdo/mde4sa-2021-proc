package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

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

    @Override
    public void setValue(String value) {
        this.value = value;
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

    public SensorValueGenImpl(String value, Date timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}
