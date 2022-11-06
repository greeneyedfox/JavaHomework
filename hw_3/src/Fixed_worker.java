public class Fixed_worker extends Employee{
    public Fixed_worker(String name, double salary, String job) {
        this.name = name;
        this.salary = this.payment(salary);
        this.job = job;
        this.id = this.createId();
    }

    @Override
    public double payment(double salary) {
        return salary;
    }
}
