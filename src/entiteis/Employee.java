package entiteis;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePeHours;
    public Employee() {

    }

    public Employee(String name, Integer hours, Double valuePeHours) {
        this.name = name;
        this.hours = hours;
        this.valuePeHours = valuePeHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePeHours() {
        return valuePeHours;
    }

    public void setValuePeHours(Double valuePeHours) {
        this.valuePeHours = valuePeHours;
    }
    public double payment() {
        return hours * valuePeHours;
    }
}
