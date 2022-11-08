public class Doem04 {
    public static void main(String[] args) {
        int[] ids = new int[]{1003,1004,1005,1006};//静态初始化
        String[] names = new String[5];//动态初始化
        names[0] = "王明";
        names[1] = "王哥";
        names[2] = "周哥";
        names[3] = "涛哥";
        names[4] = "周大哥";
        System.out.println(names.length);
        System.out.println(ids.length);
        for (int i = 0;i < names.length;i++){
            System.out.println(names[i]);
        }



    }
 }
