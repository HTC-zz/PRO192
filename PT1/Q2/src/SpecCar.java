public class SpecCar extends Car{
    public int type;
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
        public String getMaker() {
        return Maker;
    }

    public void setMaker(String Maker) {
        this.Maker = Maker;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    public String setData() {
        return "XZ" + super.getMaker() + ", " + super.getPrice();
    }
    public String tostring() {
        return super.toString() + "," + type;
    }
    public int getValue() {
        if ( type < 7) {
            return super.getPrice() + 10;
        }
        else if (type == 10) {
            return super.getPrice() + 15;
        }
        else 
            return 0;
    }
}
