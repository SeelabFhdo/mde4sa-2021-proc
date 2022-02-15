package de.fhdo.puls.chargingstationsharingquery.service.ChargingStationSharingQuery;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import de.fhdo.puls.chargingstationsharingquery.service.ChargingStationSharingQuery.gen.ChargingStationSharingQueryGenImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ChargingStationSharingQueryGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "de.fhdo.puls.chargingstationsharingquery")
public class ChargingStationSharingQuery extends ChargingStationSharingQueryGenImpl {

    public static void main(String[] args) {
        SpringApplication.run(ChargingStationSharingQuery.class, args);
    }
}
