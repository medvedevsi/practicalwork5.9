public class CargoInfo {
    private final Dimensions dimensions;

    private final double mass;

    private final String deliveryAddress;

    private final boolean flipable;

    private final String regNumber;

    private final boolean fragile;

    public CargoInfo(Dimensions dimensions, double mass, String deliveryAddress, boolean flipable, String regNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.deliveryAddress = deliveryAddress;
        this.flipable = flipable;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getMass() {
        return mass;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isFlipable() {
        return flipable;
    }

    public String getRegNumber() {
        return regNumber;
    }
    public boolean isFragile() {
        return fragile;
    }
    public CargoInfo setDeliveryAddress(String newAddress) {
        return new CargoInfo(dimensions, mass, newAddress, flipable, regNumber, fragile);
    }

    public CargoInfo setDimensions(Dimensions new_dim) {
        return new CargoInfo(new_dim, mass, deliveryAddress, flipable, regNumber, fragile);
    }

    public CargoInfo setMass(double new_mass) {
        return new CargoInfo(dimensions, new_mass, deliveryAddress, flipable, regNumber, fragile);
    }

    public String toString(){
        return "dimensions: " + dimensions.getLength() + " X " + dimensions.getWidth() + " X " + dimensions.getHeight()+
               " with volume: " + dimensions.getVolume()+
               " mass: " + mass + " кг." +
               " delivery address: " + deliveryAddress +
               " рег. номер: " + regNumber +
               " Можно ли переворачивать: " + (isFlipable() ? "Да" : "Нет") +
               " Хрупкий груз: " + (isFragile() ? "Да" : "Нет");
    }
}
