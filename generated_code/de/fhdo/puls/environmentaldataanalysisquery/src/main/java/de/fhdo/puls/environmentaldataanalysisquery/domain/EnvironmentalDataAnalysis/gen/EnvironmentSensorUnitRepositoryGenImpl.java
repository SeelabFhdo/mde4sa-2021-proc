package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.EnvironmentSensorUnit;
import org.springframework.stereotype.Repository;

@Repository()
public abstract class EnvironmentSensorUnitRepositoryGenImpl implements DddRepository, EnvironmentSensorUnitRepositoryGen {

    public EnvironmentSensorUnitRepositoryGenImpl() {
    }

    protected EnvironmentSensorUnit environmentSensorUnitAggregate;

    @Override
    public EnvironmentSensorUnit getEnvironmentSensorUnitAggregate() {
        return environmentSensorUnitAggregate;
    }

    @Override
    public void setEnvironmentSensorUnitAggregate(EnvironmentSensorUnit environmentSensorUnitAggregate) {
        this.environmentSensorUnitAggregate = environmentSensorUnitAggregate;
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

    public EnvironmentSensorUnitRepositoryGenImpl(EnvironmentSensorUnit environmentSensorUnitAggregate, String id) {
        this.environmentSensorUnitAggregate = environmentSensorUnitAggregate;
        this.id = id;
    }
}
