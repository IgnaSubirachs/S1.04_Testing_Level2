public class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object car) {
        if (this == car) return true;
        if (!(car instanceof Car)) return false;
        return this.brand.equals(((Car) car).brand);
    }

}

