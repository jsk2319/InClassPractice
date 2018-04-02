public class Television {
    //instance variables
    private String brand;
    private boolean power;

    //a constructor with 2 parameters
    public Television(String brand, boolean power) {
        this.brand = brand;
        this.power = power;
    }

    //default constructor with 0 parameters
    public Television() {
        this("",false); //call to the first constructor with 2 arguments
    }

    //third constructor with 1 parameter
    public Television(String newBrand) {
        brand = newBrand; //you can also call first constructor by this(newBrand,0);
        power = false;
    }

    //non-static methods
    //setter or mutators methods because they change the values
    //of the instance variables
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(boolean power) {
        if(power == false)
            this.power = false;
        else if(power == true)
            this.power = true;
    }
    //getter or accessor methods that allow access to the values
    //of instance variables
    public String getBrand() {
        return brand;
    }

    public boolean getPower() {
        return power;
    }




}