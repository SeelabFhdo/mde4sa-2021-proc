package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen.CPIChangeEventGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends CPIChangeEventGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class CPIChangeEvent extends CPIChangeEventGenImpl {

    public CPIChangeEvent() {
        super();
    }

    public CPIChangeEvent(String id_command, String id_query, String name, boolean activated) {
        super(id_command, id_query, name, activated);
    }
}
