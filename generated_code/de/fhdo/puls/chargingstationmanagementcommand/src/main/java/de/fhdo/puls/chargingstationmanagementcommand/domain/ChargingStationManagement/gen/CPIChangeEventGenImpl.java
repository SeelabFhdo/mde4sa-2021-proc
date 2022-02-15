package de.fhdo.puls.chargingstationmanagementcommand.domain.ChargingStationManagement.gen;

import de.fhdo.lemma.ddd.structure.DddDomainEvent;
import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class CPIChangeEventGenImpl implements DddValueObject, DddDomainEvent, CPIChangeEventGen {

    public CPIChangeEventGenImpl() {
    }

    protected String id_command;

    @Override
    public String getId_command() {
        return id_command;
    }

    protected String id_query;

    @Override
    public String getId_query() {
        return id_query;
    }

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    protected boolean activated;

    @Override
    public boolean getActivated() {
        return activated;
    }

    public CPIChangeEventGenImpl(String id_command, String id_query, String name, boolean activated) {
        this.id_command = id_command;
        this.id_query = id_query;
        this.name = name;
        this.activated = activated;
    }
}
