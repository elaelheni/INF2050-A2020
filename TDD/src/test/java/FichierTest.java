import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FichierTest {

    @Test
    public void testNomFichier(){
        assertEquals("fichier.txt",Fichier.nomFichier("/Users/ela/blabla/fichier.txt"));
    }
    @Test
    public void testNomFichier2(){
        assertEquals("fichier.txt",Fichier.nomFichier("blabla/fichier.txt"));
    }
    @Test
    public void testExtensionFichier(){
        assertEquals("txt", Fichier.extensionFichier("/Users/ela/blabla/fichier.txt"));
    }
    @Test
    public void testExtensionFichier2(){
        assertEquals("", Fichier.extensionFichier("/Users/ela/blabla/fichier"));
    }
}
