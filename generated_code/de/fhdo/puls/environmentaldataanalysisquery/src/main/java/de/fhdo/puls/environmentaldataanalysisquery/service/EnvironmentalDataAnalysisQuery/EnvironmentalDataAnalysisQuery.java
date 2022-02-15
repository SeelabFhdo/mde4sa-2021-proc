package de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import de.fhdo.puls.environmentaldataanalysisquery.service.EnvironmentalDataAnalysisQuery.gen.EnvironmentalDataAnalysisQueryGenImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends EnvironmentalDataAnalysisQueryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "de.fhdo.puls.environmentaldataanalysisquery")
public class EnvironmentalDataAnalysisQuery extends EnvironmentalDataAnalysisQueryGenImpl {

    public static void main(String[] args) {
        SpringApplication.run(EnvironmentalDataAnalysisQuery.class, args);
    }
}
