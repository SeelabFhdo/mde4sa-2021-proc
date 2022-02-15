package de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.gen;

import de.fhdo.lemma.ddd.structure.DddAggregate;
import de.fhdo.lemma.ddd.structure.DddEntity;
import de.fhdo.lemma.ddd.structure.DddIdentifier;
import de.fhdo.lemma.ddd.structure.DddPart;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.Location;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.SensorType;
import de.fhdo.puls.environmentaldataanalysiscommand.domain.EnvironmentalDataAnalysis.SensorUnitStatus;
import java.util.Date;
import javax.persistence.Entity;

@Entity()
public abstract class EnvironmentSensorUnitGenImpl implements DddEntity, DddAggregate, EnvironmentSensorUnitGen {

    public EnvironmentSensorUnitGenImpl() {
    }

    @DddIdentifier()
    protected String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    protected long sensorBoxId;

    @Override
    public long getSensorBoxId() {
        return sensorBoxId;
    }

    @Override
    public void setSensorBoxId(long sensorBoxId) {
        this.sensorBoxId = sensorBoxId;
    }

    protected String description;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @DddPart()
    protected SensorUnitStatus status;

    @Override
    public SensorUnitStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(SensorUnitStatus status) {
        this.status = status;
    }

    @DddPart()
    protected Location location;

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    protected Date createdDate;

    @Override
    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    protected Date lastModifiedDate;

    @Override
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    @Override
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @DddPart()
    protected SensorType sensorType;

    @Override
    public SensorType getSensorType() {
        return sensorType;
    }

    @Override
    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    public EnvironmentSensorUnitGenImpl(String id, String name, long sensorBoxId, String description, SensorUnitStatus status, Location location, Date createdDate, Date lastModifiedDate, SensorType sensorType) {
        this.id = id;
        this.name = name;
        this.sensorBoxId = sensorBoxId;
        this.description = description;
        this.status = status;
        this.location = location;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.sensorType = sensorType;
    }
}
