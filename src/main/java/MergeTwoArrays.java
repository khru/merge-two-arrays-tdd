public class MergeTwoArrays {
    public static int [] mergeArrays(int [] firstArray, int [] secondArray) {
        if (null == firstArray || null == secondArray) {
            throw new IllegalArgumentException("The method expected 2 arrays and null was given");
        }
        if (firstArray.length != secondArray.length) {
            throw new IllegalArgumentException("The method expected 2 arrays with the same length");
        }
        return new int[0];
    }
}
