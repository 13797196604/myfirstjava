public class ExerDemo0502 {
    public static void main(String[] args) {
        int[] arr= new int[10];
        for (int i =0;i<arr.length;i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
            //(int)(Math.random()*(99-10+1)+10);求两位随机数
        }
        //便利
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
            int max=arr[0];
            int min=arr[0];
            int sun=0;
            int avg=0;
            //求最大值
            for (int i =1;i<arr.length;i++) {
                if (max<arr[i]){
                    max=arr[i];
                }
            }
        System.out.println(max);
            //求最小值
            for (int i =1;i<arr.length;i++) {
                if (min>arr[i]){
                    min=arr[i];
                }
            }
        System.out.println(min);
            //求总和
            for (int i =0;i<arr.length;i++) {
                sun += arr[i];
            }
        System.out.println(sun);
            //求平均数
        avg=sun/arr.length;
        System.out.println(avg);
    }
}
