package ChallangeFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckArrayValuesNextLevelSolutionsTest {
    Boolean [] arrayBo = {true, true, true,
            true, true, true,
            false, true, true,
            false, false, false,
            null
    };
    @Test
    void countTrueValuesInArray(){
        assertEquals(8, CheckArrayValuesNextLevelSolutions.countTrueValuesInArray(arrayBo));
        assertNotEquals(8, CheckArrayValuesNextLevelSolutions.countTrueValuesInArray(arrayBo)+1);
    }
    @Test
    void countTrueValuesInArrayWithCollection(){
        assertEquals(8, CheckArrayValuesNextLevelSolutions.countTrueValuesInArrayWithCollection(arrayBo));
    }


}