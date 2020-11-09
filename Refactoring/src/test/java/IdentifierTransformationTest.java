import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentifierTransformationTest {

    @Test
    void snakeCaseIdentifierToPascalCase() {
        assertEquals(" ", IdentifierTransformation.snakeCaseIdentifierToPascalCase(" "));
    }

    @Test
    void snakeCaseIdentifierToPascalCase2() {
        assertEquals("UneVariable", IdentifierTransformation.snakeCaseIdentifierToPascalCase("une_variable"));
    }
    @Test
    void snakeCaseIdentifierToPascalCase3() {
        assertEquals("UneVariable", IdentifierTransformation.snakeCaseIdentifierToPascalCase("_une_variable"));
    }

    @Test
    void snakeCaseIdentifierToPascalCase4() {
        assertEquals("UneVariable", IdentifierTransformation.snakeCaseIdentifierToPascalCase("_une_variable_"));
    }
    @Test
    void snakeCaseIdentifierToPascalCase5() {
        assertEquals("1Chat", IdentifierTransformation.snakeCaseIdentifierToPascalCase("1_chat"));
    }
    @Test
    void snakeCaseIdentifierToPascalCase6() {
        assertEquals("1", IdentifierTransformation.snakeCaseIdentifierToPascalCase("1_"));
    }
    @Test
    void snakeCaseIdentifierToCamelCase() {
        assertEquals(" ", IdentifierTransformation.snakeCaseIdentifierToCamelCase(" "));
    }
    @Test
    void snakeCaseIdentifierToCamelCase2() {
        assertEquals("uneVariable", IdentifierTransformation.snakeCaseIdentifierToCamelCase("une_variable"));
    }

    @Test
    void snakeCaseIdentifierToCamelCase3() {
        assertEquals("uneVariable", IdentifierTransformation.snakeCaseIdentifierToCamelCase("_une_variable"));
    }

    @Test
    void snakeCaseIdentifierToCamelCase4() {
        assertEquals("uneVariable", IdentifierTransformation.snakeCaseIdentifierToCamelCase("_une_variable_"));
    }
    @Test
    void snakeCaseIdentifierToCamelCase5() {
        assertEquals("1Chat", IdentifierTransformation.snakeCaseIdentifierToCamelCase("1_chat"));
    }
    @Test
    void snakeCaseIdentifierToCamelCase6() {
        assertEquals("1", IdentifierTransformation.snakeCaseIdentifierToCamelCase("1_"));
    }
}