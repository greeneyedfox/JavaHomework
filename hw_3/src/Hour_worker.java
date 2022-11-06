public class Hour_worker extends Employee{

    public Hour_worker(String name, double salary, String job) {
        this.name = name;
        this.salary = this.payment(salary);
        this.job = job;
        this.id = createId();
    }

    @Override
    public double payment(double salary) {
        return salary*20.8*8;
    }
}
