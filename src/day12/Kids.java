package day12;

public class Kids extends ManKind{
    private int yearsOld;
    public Kids(){

    }
    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }
    public void prinAge(){
        System.out.println(yearsOld);
    }
    //重写
    public void employeed(){
        System.out.println("Kids should study and no job");
    }
    public void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }
    public int getYearsOld(){
        return yearsOld;
    }

}
