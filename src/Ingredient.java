package src;

public class Ingredient {
    private double amount;
    private String unit;
    private String name;

    public Ingredient (double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
    public String getUnit(){
        return unit;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    void print() {
        System.out.println(this.amount + " " + this.unit + " " + this.name);
    }
}
