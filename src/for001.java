public class for001 {
    public static void main(String[] args) {
        int k,j,s = 0;
        for (k=2;k<6;k++,k++){
            s=1;
            for (j=k;j<6;j++){
                s += j;
            }
        }
        System.out.println(s);
    }
}
