import java.util.UUID;
public abstract class Employee implements Comparable <Employee>{
    public String job;
    public double salary;
    public String name;
    public UUID id;

    public UUID createId(){
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey;
    }
    public abstract double payment(double salary);

    public double getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public UUID getId(){
        return this.id;
    }

    public String show(){
        String str = this.name + " работает по профессии: " + this.job + " и получает " + this.salary + " (id="+this.id+")";
        return str;
    }

    @Override
    public int compareTo(Employee s){
        if (this.salary == s.salary){
            return getName().compareTo(s.getName());
        }
        return Double.compare(this.salary,s.salary);
    }
}
