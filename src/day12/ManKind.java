package day12;

public class ManKind {
    private int sex;
    private int salary;
    public ManKind(){

    }
    public void manOrWoman(){
        if (sex == 1){
            System.out.println("man");
        }else if (sex == 0){
            System.out.println("woman");
        }
    }
    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }else if (salary == 1){
            System.out.println("job");
        }
    }
    public void setSex(int sex){
        this.sex = sex;
    }
    public int getsex(){
        return sex;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
}
