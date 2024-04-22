class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return this.warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if (warrantyPeriod > 0)
        this.warrantyPeriod = warrantyPeriod;
        else
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

}
