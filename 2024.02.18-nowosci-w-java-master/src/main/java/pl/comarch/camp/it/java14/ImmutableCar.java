package pl.comarch.camp.it.java14;

public record ImmutableCar(String brand, String model, int price) {

    @Override
    public String toString() {
        return "ImmutableCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
