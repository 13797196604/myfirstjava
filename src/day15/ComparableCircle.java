package day15;

public  class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double redius){
        super(redius);
    }
    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            //return (int) (this.getRedius() - c.getRedius());
            if (this.getRedius() > c.getRedius()){
                return 1;
            }else if (this.getRedius() < c.getRedius()){
                return -1;
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }
}
