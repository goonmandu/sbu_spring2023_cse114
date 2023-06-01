public class InterleaveArrays {
    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int[] ret = new int[array1.length+array2.length];
        int limitingLength = Math.min(array1.length, array2.length);
        for (int i = 0; i < limitingLength; ++i) {
            ret[i*2] = array1[i];
            ret[(i*2)+1] = array2[i];
        }
        if (limitingLength == array1.length) {
            for (int i = limitingLength * 2; i < ret.length; ++i) {
                ret[i] = array2[i-limitingLength];
            }
        } else {
            for (int i = limitingLength * 2; i < ret.length; ++i) {
                ret[i] = array1[i-limitingLength];
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        ArrayUtils.print(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}));  // arr1 == arr2 > 0
        ArrayUtils.print(interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8}));  // arr1 > arr2
        ArrayUtils.print(interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10}));  // arr1 < arr2
        ArrayUtils.print(interleaveArrays(new int[]{3,6,9,12}, new int[]{}));  // arr2 == 0
        ArrayUtils.print(interleaveArrays(new int[]{}, new int[]{2,4,6,8,10}));  //  arr1 == 0
        ArrayUtils.print(interleaveArrays(new int[]{}, new int[]{}));  // arr1 == arr2 == 0
    }
}
