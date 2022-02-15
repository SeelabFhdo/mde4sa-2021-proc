package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import java.util.Date;

public interface ReceivedDataSetGen {

    String getSensorId();

    Date getReceivedTimeStamp();

    float getParticulate2();

    float getParticulate10();

    int getLight();

    float getTemperature();

    float getHumidity();
}
