package de.fhdo.puls.chargingstationsharingcommand.service.ChargingStationSharingCommand;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import de.fhdo.puls.chargingstationsharingcommand.service.ChargingStationSharingCommand.gen.ChargingStationSharingCommandGenImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ChargingStationSharingCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "de.fhdo.puls.chargingstationsharingcommand")
public class ChargingStationSharingCommand extends ChargingStationSharingCommandGenImpl {

    public static void main(String[] args) {
        SpringApplication.run(ChargingStationSharingCommand.class, args);
    }
}
