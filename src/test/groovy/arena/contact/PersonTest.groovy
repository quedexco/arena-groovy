package arena.contact

import arena.contact.Person
import org.junit.Test

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

class PersonTest {
    @Test
    public void canConstructAPerson() {
        Person p = new Person()
        assertEquals('Barry', p.name)
    }

    @Test
    public void canConstructAPersonUsingName() {
        Person p = new Person(name: 'Alexia')
        assertEquals('Alexia', p.name)
    }

    @Test
    public void usingCorrectVersionOfGroovy() {
        assertEquals('2.4.5', GroovySystem.version)
    }

    @Test
    public void testResourcesAreAvailable() {
        assertNotNull(getClass().getResource('/arena/testResource.txt'))
        assertNotNull(getClass().getResource('/arena/testScript.groovy'))
    }
}
