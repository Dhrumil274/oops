class Vehicle {
    public int numberOfTyres;
    public String engineNo;
    public String bodyColor;
    public String rtoName;

    public static int count = 0;

    {
        rtoName = "Ahmedabad";
        count++;
        System.out.println("the objects created are " + count);
    }

    Vehicle(int numberOfTyres, String engineNo, String bodyColor) {
        this.numberOfTyres = numberOfTyres;
        this.engineNo = engineNo;
        this.bodyColor = bodyColor;
    }

   
    void setRtoName(String rtoName) {
        this.rtoName = rtoName;
    }

    String getRtoName() {
        return rtoName;
    }

    @Override
    public String toString() {
        return "Tyres: " + numberOfTyres +
               ", EngineNo: " + engineNo +
               ", BodyColor: " + bodyColor +
               ", RTOName: " + rtoName +
               ", Total objects created: " + count;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4, "ENG101", "Red");
        Vehicle v2 = new Vehicle(4, "ENG102", "Blue");
        Vehicle v3 = new Vehicle(6, "ENG103", "White");

        v2.setRtoName("Surat");   // override default RTOName for one object

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
    }
}