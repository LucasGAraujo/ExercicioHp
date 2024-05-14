package entiteis;

public class OutsourceEmployee extends Employee{
    private Double additionalCharge;

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePeHours, Double additionalCharge) {
        super(name, hours, valuePeHours);
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment(){
        return super.payment() + additionalCharge *1.1;
    }
}
