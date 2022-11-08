package day15;

public  class SalariedEmployee15 extends Employee15{
    private double monthlySalary;
    public SalariedEmployee15 (String name , int number , MyDate15 birthday){
        super(name, number, birthday);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee15{" + super.toString()+ '}';
    }
}