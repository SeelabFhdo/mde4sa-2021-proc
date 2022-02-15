package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen.ReceivedDataSetGenImpl;
import java.util.Date;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ReceivedDataSetGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ReceivedDataSet extends ReceivedDataSetGenImpl {

    public ReceivedDataSet() {
        super();
    }

    public ReceivedDataSet(String sensorId, Date receivedTimeStamp, float particulate2, float particulate10, int light, float temperature, float humidity) {
        super(sensorId, receivedTimeStamp, particulate2, particulate10, light, temperature, humidity);
    }
}
