package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddRepository;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.EnvironmentInformation;
import org.springframework.stereotype.Repository;

@Repository()
public abstract class EnvironmentInformationRepositoryGenImpl implements DddRepository, EnvironmentInformationRepositoryGen {

    public EnvironmentInformationRepositoryGenImpl() {
    }

    protected EnvironmentInformation environmentInformationAggregate;

    @Override
    public EnvironmentInformation getEnvironmentInformationAggregate() {
        return environmentInformationAggregate;
    }

    @Override
    public void setEnvironmentInformationAggregate(EnvironmentInformation environmentInformationAggregate) {
        this.environmentInformationAggregate = environmentInformationAggregate;
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

    public EnvironmentInformationRepositoryGenImpl(EnvironmentInformation environmentInformationAggregate, String id) {
        this.environmentInformationAggregate = environmentInformationAggregate;
        this.id = id;
    }
}
