package de.fhdo.puls.bookingmanagementcommand.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class BookerGenImpl implements DddValueObject, BookerGen {

    public BookerGenImpl() {
    }

    protected long bookerId;

    @Override
    public long getBookerId() {
        return bookerId;
    }

    @Override
    public void setBookerId(long bookerId) {
        this.bookerId = bookerId;
    }

    protected String firstName;

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected String lastName;

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BookerGenImpl(long bookerId, String firstName, String lastName) {
        this.bookerId = bookerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
