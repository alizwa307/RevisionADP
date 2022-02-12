package ac.za.cput.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VenueTest {

    private Venue venue1;
    private Venue venue2;
    private Venue venue3;

    @BeforeEach
    void setUp() {
        venue1 = new Venue();
        venue2 = new Venue();
        venue3 = venue1;
    }

    //i.Object Equality
    @Test
    void testEquality(){
        assertEquals(venue1,venue3);
    }

    //STEP2 - call method to be tested
    //ii. Object Identity
    @Test
    void testIdentity(){
        assertSame(venue1, venue3);
    }

    //iii. Fail test
    @Test
    public void testGetBuildingName() {
        System.out.println("getBuildingName");
        Venue instance = new Venue();
        String expResult = "";
        String result = instance.getBuildingName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}