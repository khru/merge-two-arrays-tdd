import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoArrayTest {
    @Test
    public void should_check_that_two_arrays_are_been_pass(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MergeTwoArrays.mergeArrays(null, null);
        });
    }

    @Test
    public void should_check_that_two_arrays_have_the_same_length(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MergeTwoArrays.mergeArrays(new int[3], new int[4]);
        });
    }

    @Test
    public void should_return_an_array_with_the_double_of_length(){
        int [] firstArray = {1,2,3,4,5,6,7,8,9};
        int [] secondArray = {10,11,12,13,14,15,16,17,18};
        int [] expectedResult = {1,2,3,10,11,12,4,5,6,13,14,15,7,8,9,16,17,18};
        assertEquals(expectedResult.length, MergeTwoArrays.mergeArrays(firstArray, secondArray).length);
    }

    @Test
    public void should_merge_two_arrays_on_chunks_of_three(){
        int [] firstArray = {1,2,3,4,5,6,7,8,9};
        int [] secondArray = {10,11,12,13,14,15,16,17,18};
        int [] expectedResult = {1,2,3,10,11,12,4,5,6,13,14,15,7,8,9,16,17,18};
        assertArrayEquals(expectedResult, MergeTwoArrays.mergeArrays(firstArray, secondArray));
    }

    @Test
    public void should_not_merge_two_arrays_with_non_divisional_by_chunks(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MergeTwoArrays.mergeArrays(new int[4], new int[4]);
        });
    }

}
