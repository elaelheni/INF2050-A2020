import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChiffrementTest {
    @Test
    public void testEncodeCesar(){
        assertEquals("n", Chiffrement.encodeCesar("a"));
    }

    @Test
    public void testEncodeCesar2(){
        assertEquals("Fnyhg gbhg yr zbaqr !", Chiffrement.encodeCesar("Salut tout le monde !"));
    }

    @Test
    public void testEncodeCesar3(){
        assertEquals("Pbhpbh.", Chiffrement.encodeCesar("Coucou."));
    }

    @Test
    public void testEncodeCesar4(){
        assertEquals("Coucou.", Chiffrement.encodeCesar("Pbhpbh."));
    }

    @Test
    public void testEncodeCesar5(){
        assertEquals("a", Chiffrement.encodeCesar("n"));
    }
    @Test
    public void testEncodeCesar6(){
        assertEquals("Salut tout le monde !", Chiffrement.encodeCesar("Fnyhg gbhg yr zbaqr !"));
    }


}
