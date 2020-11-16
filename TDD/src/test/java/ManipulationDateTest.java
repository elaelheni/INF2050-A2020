import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManipulationDateTest {
    @Test
    public void testCreerDateLisible() {
        assertEquals("21 novembre 2016",ManipulationDate.creerDateLisible("2016-11-21"));
    }

    @Test
    public void testCreerDateLisible2() {
        assertEquals("1er novembre 2016",ManipulationDate.creerDateLisible("2016-11-01"));
    }

    @Test
    public void testAgeDate(){
        Date debut = new Date(1994, 7, 24);
        Date fin = new Date (2020, 7, 24) ;

        assertEquals(26, ManipulationDate.ageDate(debut, fin));

    }

    @Test
    public void testAgeDate2(){
        Date debut = new Date(1994, 7, 24);
        Date fin = new Date (2020, 5, 24) ;

        assertEquals(25, ManipulationDate.ageDate(debut, fin));

    }

    @Test
    public void testAgeDate3(){
        Date debut = new Date(1994, 7, 24);
        Date fin = new Date (2020, 7, 10) ;

        assertEquals(25, ManipulationDate.ageDate(debut, fin));

    }

    @Test
    public void testAge() {
        LocalDate debut = LocalDate.of(1994, 7, 24);
        LocalDate fin = LocalDate.of(2020, 3, 14);

        assertEquals(25, ManipulationDate.age(debut,fin));
    }


}
