package de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.Location;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorType;
import de.fhdo.puls.environmentaldataanalysisquery.domain.EnvironmentalDataAnalysis.SensorUnitStatus;
import java.util.Date;

public interface EnvironmentSensorUnitGen {

    String getId();

    void setId(String id);

    String getName();

    void setName(String name);

    long getSensorBoxId();

    void setSensorBoxId(long sensorBoxId);

    String getDescription();

    void setDescription(String description);

    SensorUnitStatus getStatus();

    void setStatus(SensorUnitStatus status);

    Location getLocation();

    void setLocation(Location location);

    Date getCreatedDate();

    void setCreatedDate(Date createdDate);

    Date getLastModifiedDate();

    void setLastModifiedDate(Date lastModifiedDate);

    SensorType getSensorType();

    void setSensorType(SensorType sensorType);
}
