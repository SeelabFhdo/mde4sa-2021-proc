package de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement;

import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.Status;
import de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.gen.CPIChangeMessageGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends CPIChangeMessageGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class CPIChangeMessage extends CPIChangeMessageGenImpl {

    public CPIChangeMessage() {
        super();
    }

    public CPIChangeMessage(long chargingPointId, float chargedEnergy, String userId, float current_L1, float current_L2, float current_L3, float voltage_L1, float voltage_L2, float voltage_L3, int current_Limit, Date timestamp, Status status) {
        super(chargingPointId, chargedEnergy, userId, current_L1, current_L2, current_L3, voltage_L1, voltage_L2, voltage_L3, current_Limit, timestamp, status);
    }
}
