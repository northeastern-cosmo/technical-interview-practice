int[] findSwapValues(int[] arrayl, int[] array2) {
    Integer target= getTarget(arrayl, array2);
    if (target== null) return null;
    return findDifference(arrayl, array2, target);
} 

/* Find a pair of values with a specific difference. */ 
int[] findDifference(int[] arrayl, int[] array2, int target) {
    HashSet<Integer> contents2 = getContents(array2);
    for (int one : arrayl) {
        int two= one - target;
        if (contents2.contains(two)) {
            int[] values = {one, two};
            return values;
        }
    }
    return null;
}