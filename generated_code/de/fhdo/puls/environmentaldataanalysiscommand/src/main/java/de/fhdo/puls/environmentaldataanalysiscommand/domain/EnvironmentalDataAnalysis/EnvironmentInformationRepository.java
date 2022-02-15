package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.EnvironmentInformation;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen.EnvironmentInformationRepositoryGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentInformationRepositoryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class EnvironmentInformationRepository extends EnvironmentInformationRepositoryGenImpl {

    public EnvironmentInformationRepository() {
        super();
    }

    public EnvironmentInformationRepository(EnvironmentInformation environmentInformationAggregate, String id) {
        super(environmentInformationAggregate, id);
    }
}
