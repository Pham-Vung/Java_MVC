package entities;

public class Employee extends User {
    private int baseSalary; // lương cơ bản
    private double coefficientsSalary; // hệ số lương

    public Employee() {
        super();
    }

    public Employee(String id, String password, String name, int role, int baseSalary, double coefficientsSalary) {
        super(id, password, name, role);
        this.baseSalary = baseSalary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public User copy() {
        return new Employee(getId(), getPassword(), getName(), getRole(), baseSalary, coefficientsSalary);
    }

    @Override
    public String toString() {
        return "Employee [id=" + getId() + ", password=" + getPassword() + ", name=" + getName() + ", role=" + getRole()
                + ", baseSalary=" + baseSalary + ", coefficientsSalary=" + coefficientsSalary + "]";
    }
}
