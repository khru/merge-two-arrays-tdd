import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MergeTwoArrayTest {
    @Test
    public void should_check_that_two_arrays_are_been_pass(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MergeTwoArrays.mergeArrays(null, null);
        });
    }
}
