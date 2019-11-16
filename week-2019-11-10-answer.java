int findSmallestDifference(int[] arrayl, int[] array2) {
    Arrays.sort(arrayl);
    Arrays.sort(array2);
    int a = 0;
    int b = 0;
    int difference = Integer.MAX_VALUE;
    while (a < arrayl.length && b < array2.length) {
        if (Math.abs(arrayl[a] - array2[b]) < difference) {
            difference = Math.abs(arrayl[a] - array2[b]);
        }
    
        /* Move smaller value. */
        if (arrayl[a) < array2[b]) {
            a++;
        } else {
            b++;
        }
    }
    return difference;
}