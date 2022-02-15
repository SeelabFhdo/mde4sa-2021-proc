package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.EnvironmentInformation;

public interface EnvironmentInformationRepositoryGen {

    EnvironmentInformation getEnvironmentInformationAggregate();

    void setEnvironmentInformationAggregate(EnvironmentInformation environmentInformationAggregate);

    String getId();

    void setId(String id);
}
