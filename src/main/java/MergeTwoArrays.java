public class MergeTwoArrays {
    public static int [] mergeArrays(int [] firstArray, int [] secondArray) {
        if (null == firstArray || null == secondArray) {
            throw new IllegalArgumentException("The method expected 2 arrays and null was given");
        }
        if (firstArray.length != secondArray.length) {
            throw new IllegalArgumentException("The method expected 2 arrays with the same length");
        }
        int MAX_CHUNK = 3;
        if (firstArray.length % MAX_CHUNK != 0) {
            throw new IllegalArgumentException("The arrays have to be dividable by " + MAX_CHUNK);
        }

        int totalOfElementsByIteration = (firstArray.length*2) / MAX_CHUNK; // 6
        int [] result =  new int[firstArray.length*2];

        for(int i = 0; i < result.length; i += totalOfElementsByIteration) {
            for (int j = 0; j < MAX_CHUNK;j++) {
                result[i+j] = firstArray[(i / 2)+j];
            }

            for (int j = 0; j < MAX_CHUNK;j++) {
                result[i+(j + MAX_CHUNK)] = secondArray[(i / 2)+j];
            }

        }

        return result;
    }
}
