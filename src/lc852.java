class Solution01 {
    public int peakIndexInMountainArray(int[] arr) {
        int i;
        //遍历数组
        for (i = 0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1])
                break;
        }
        return i;
    }
}