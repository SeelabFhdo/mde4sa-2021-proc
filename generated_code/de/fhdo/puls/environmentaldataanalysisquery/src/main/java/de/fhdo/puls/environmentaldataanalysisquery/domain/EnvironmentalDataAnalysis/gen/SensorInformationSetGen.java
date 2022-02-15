package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.RecivedDataSetList;

public interface SensorInformationSetGen {

    String getId();

    void setId(String id);

    String getName();

    void setName(String name);

    long getSensorBoxId();

    void setSensorBoxId(long sensorBoxId);

    RecivedDataSetList getReceivedDataSetList();

    void setReceivedDataSetList(RecivedDataSetList receivedDataSetList);
}
