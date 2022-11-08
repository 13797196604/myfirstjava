class Doem03 {
    public static void main(String[] args) {
        for (int i=100; i <1000; i++){
            int zhou = i/100;
            int ming = i%100/10;
            int tao  = i%10;
            if (i == zhou*zhou*zhou+ming*ming*ming+tao*tao*tao){
                System.out.println(i);
            }
        }
    }
}
  