package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.RecivedDataSetList;
import javax.persistence.Entity;

@Entity()
public abstract class SensorInformationSetGenImpl implements DddEntity, SensorInformationSetGen {

    public SensorInformationSetGenImpl() {
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

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    protected long sensorBoxId;

    @Override
    public long getSensorBoxId() {
        return sensorBoxId;
    }

    @Override
    public void setSensorBoxId(long sensorBoxId) {
        this.sensorBoxId = sensorBoxId;
    }

    protected RecivedDataSetList receivedDataSetList;

    @Override
    public RecivedDataSetList getReceivedDataSetList() {
        return receivedDataSetList;
    }

    @Override
    public void setReceivedDataSetList(RecivedDataSetList receivedDataSetList) {
        this.receivedDataSetList = receivedDataSetList;
    }

    public SensorInformationSetGenImpl(String id, String name, long sensorBoxId, RecivedDataSetList receivedDataSetList) {
        this.id = id;
        this.name = name;
        this.sensorBoxId = sensorBoxId;
        this.receivedDataSetList = receivedDataSetList;
    }
}
