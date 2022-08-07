package lesson_09;

public class FTE extends Employee{
    private static final int FTE_SALARY = 50000;

    public FTE(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return FTE_SALARY;
    }

    @Override //nhỡ quên ko override là bị sai --> S: nên sử dụng Abstraction
    public int supportMoney(){
        return 5000;
    }
}
