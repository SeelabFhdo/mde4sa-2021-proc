package de.fhdo.puls.bookingmanagementquery.domain.BookingManagement.gen;

import de.fhdo.lemma.ddd.structure.DddValueObject;

public abstract class BookerGenImpl implements DddValueObject, BookerGen {

    public BookerGenImpl() {
    }

    protected long bookerId;

    @Override
    public long getBookerId() {
        return bookerId;
    }

    protected String firstName;

    @Override
    public String getFirstName() {
        return firstName;
    }

    protected String lastName;

    @Override
    public String getLastName() {
        return lastName;
    }

    public BookerGenImpl(long bookerId, String firstName, String lastName) {
        this.bookerId = bookerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
