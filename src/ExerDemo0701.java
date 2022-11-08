public class ExerDemo0701 {
    public static void main(String[] args) {
        int[] arr=new int[]{34,5,22,-98,6,-76,0,-3};
        //冒泡排序 时间复杂度(o^2)
        for (int i=0;i< arr.length -1;i++){
            for (int j=0;j< arr.length -1-i;j++){
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
        System.out.println();
        int dest = 100;
        boolean isFlag = true;
        for (int i=0;i< arr.length;i++){
            if (arr[i] == dest){
                System.out.println(i);
                isFlag =false;
                break;
            }
        }
        if (isFlag){
            System.out.println("未找到");
        }
    }
}
