import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculTaxesTest {

    @Test
    public void testCalculerTaxe(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> CalculTaxes.calculerTaxes(0,true,true));
    }

    @Test
    public void testCalculerTaxe2(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> CalculTaxes.calculerTaxes(-7,true,true));
    }

    @Test
    public void testCalculerTaxe3(){
        assertEquals(105,CalculTaxes.calculerTaxes(100,true,false));

    }

    @Test
    public void testCalculerTaxe4(){
        assertEquals(110,CalculTaxes.calculerTaxes(100,false,true));

    }

    @Test
    public void testCalculerTaxe5(){
        assertEquals(115,CalculTaxes.calculerTaxes(100,true,true));

    }

    @Test
    public void testCalculerTaxe6(){
        assertEquals(100,CalculTaxes.calculerTaxes(100,false,false));

    }


}