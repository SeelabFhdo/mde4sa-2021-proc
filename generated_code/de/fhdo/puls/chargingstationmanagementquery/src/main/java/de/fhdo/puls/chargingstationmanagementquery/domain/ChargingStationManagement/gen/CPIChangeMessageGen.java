package de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.gen;

import de.fhdo.puls.chargingstationmanagementquery.domain.ChargingStationManagement.Status;
import java.util.Date;

public interface CPIChangeMessageGen {

    long getChargingPointId();

    void setChargingPointId(long chargingPointId);

    float getChargedEnergy();

    void setChargedEnergy(float chargedEnergy);

    String getUserId();

    void setUserId(String userId);

    float getCurrent_L1();

    void setCurrent_L1(float current_L1);

    float getCurrent_L2();

    void setCurrent_L2(float current_L2);

    float getCurrent_L3();

    void setCurrent_L3(float current_L3);

    float getVoltage_L1();

    void setVoltage_L1(float voltage_L1);

    float getVoltage_L2();

    void setVoltage_L2(float voltage_L2);

    float getVoltage_L3();

    void setVoltage_L3(float voltage_L3);

    int getCurrent_Limit();

    void setCurrent_Limit(int current_Limit);

    Date getTimestamp();

    void setTimestamp(Date timestamp);

    Status getStatus();

    void setStatus(Status status);
}
