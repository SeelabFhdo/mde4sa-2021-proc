package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis;

import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen.ReceiveEnvironmentDataCommandGenImpl;

/* This class might comprise custom code. It will not be overwritten by the code generator as long as it
extends ReceiveEnvironmentDataCommandGenImpl. As soon as this is not the case anymore, this file will be 
overwritten, when the code generator is not explicitly invoked with the --preserve_existing_files 
command line option! */
public class ReceiveEnvironmentDataCommand extends ReceiveEnvironmentDataCommandGenImpl {

    public ReceiveEnvironmentDataCommand() {
        super();
    }

    public ReceiveEnvironmentDataCommand(String sensorUnitId, float particulate2, float particulate10, int light, float temperature, float humidity, int communicationType, int signalPower, float signalNoiseRang, int spreadingFaktorDownlink, int spreadingFaktorUplink) {
        super(sensorUnitId, particulate2, particulate10, light, temperature, humidity, communicationType, signalPower, signalNoiseRang, spreadingFaktorDownlink, spreadingFaktorUplink);
    }
}
