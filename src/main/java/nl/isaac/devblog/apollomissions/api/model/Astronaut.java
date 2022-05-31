package nl.isaac.devblog.apollomissions.api.model;

public class Astronaut {
    final String firstName;
    final String lastName;

    public Astronaut(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
