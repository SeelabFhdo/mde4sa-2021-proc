package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorInformationSet;
import org.springframework.stereotype.Repository;

@Repository()
public abstract class SensorInformationSetRepositoryGenImpl implements DddRepository, SensorInformationSetRepositoryGen {

    public SensorInformationSetRepositoryGenImpl() {
    }

    protected SensorInformationSet sensorInformationSet;

    @Override
    public SensorInformationSet getSensorInformationSet() {
        return sensorInformationSet;
    }

    @Override
    public void setSensorInformationSet(SensorInformationSet sensorInformationSet) {
        this.sensorInformationSet = sensorInformationSet;
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

    public SensorInformationSetRepositoryGenImpl(SensorInformationSet sensorInformationSet, String id) {
        this.sensorInformationSet = sensorInformationSet;
        this.id = id;
    }
}
