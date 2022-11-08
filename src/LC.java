public class LC {
}
class Solution {
    public void getLucky(String s, int k) {
        char[] chs = s.toCharArray();
        int [] arr = new int[chs.length];
        int sss=0;
        int ssss;
        int sssss;
        int ssssss;
        for(int i = 0;i< chs.length;i++){
            if (chs[i]=='a'||chs[i]=='j'||chs[i]=='s'){
                arr[i]=1;
             }
            if (chs[i]=='b'||chs[i]=='k'||chs[i]=='t'){
                arr[i]=2;
            }
            if (chs[i]=='c'||chs[i]=='l'||chs[i]=='u'){
                arr[i]=3;
            }
            if (chs[i]=='d'||chs[i]=='m'||chs[i]=='v'){
                arr[i]=4;
            }
            if (chs[i]=='e'||chs[i]=='n'||chs[i]=='w'){
                arr[i]=5;
            }
            if (chs[i]=='f'||chs[i]=='o'||chs[i]=='x'){
                arr[i]=6;
            }
            if (chs[i]=='g'||chs[i]=='p'||chs[i]=='y'){
                arr[i]=7;
            }
            if (chs[i]=='h'||chs[i]=='q'||chs[i]=='z'){
                arr[i]=8;
            }
            if (chs[i]=='i'||chs[i]=='r'){
                arr[i]=9;
            }
        }
        if (k<2){
            for (int i =0;i<arr.length;i++){
                sss +=arr[i];
        }
        } else {
            for (int i = 0; i < arr.length; i++) {
                sss += arr[i];
            }
            for (int i = 2; i < k + 1; i++) {
                ssssss = sss / 100;
                sssss = sss % 100 / 10;
                ssss = sss % 10;
                sss = (ssss + sssss + ssssss);
            }
        }
    }
}
