public class Demo07 {
    // 冒泡排序
    public static void main(String[] args) {
        int[] arr=new int[]{1343,123,434543,234,653,544,23,4343};
        //冒泡排序的实现。
        for (int i = 0;i< arr.length -1;i++){
            for (int j =0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int z=0;z< arr.length;z++){
            System.out.print(arr[z]+"\t");
        }
    }
}
