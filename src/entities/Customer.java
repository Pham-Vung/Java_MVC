package entities;

public class Customer extends User{
    private double point; // điểm thưởng

    public Customer() {
        super();
    }

    public Customer(String id, String password, String name, int role, double point) {
        super(id, password, name, role);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public User copy() {
        return new Customer(getId(), getPassword(), getName(), getRole(), point);
    }

    @Override
    public String toString() {
        return "Customer [id=" + getId() + ", password=" + getPassword() + ", name=" + getName()
                + ", role=" + getRole() + ", point=" + getPoint() + "]";
    }
}
