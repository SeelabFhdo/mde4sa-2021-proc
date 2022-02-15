package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import java.util.Date;

public interface ReceivedDataSetGen {

    String getSensorId();

    void setSensorId(String sensorId);

    Date getReceivedTimeStamp();

    void setReceivedTimeStamp(Date receivedTimeStamp);

    float getParticulate2();

    void setParticulate2(float particulate2);

    float getParticulate10();

    void setParticulate10(float particulate10);

    int getLight();

    void setLight(int light);

    float getTemperature();

    void setTemperature(float temperature);

    float getHumidity();

    void setHumidity(float humidity);
}
