class WaterBall {
    String material;     
    double diameter;     
    double weight;       
    String color;        
    String inflationStatus; 
    int noOfBalls;       

    public WaterBall() {
        super();
    }

    public WaterBall(String material) {
        this();
        this.material = material;
    }

    public WaterBall(String material, double diameter) {
        this(material);
        this.diameter = diameter;
    }

    public WaterBall(String material, double diameter, double weight) {
        this(material, diameter);
        this.weight = weight;
    }

    public WaterBall(String material, double diameter, double weight, String color) {
        this(material, diameter, weight);
        this.color = color;
    }

    public WaterBall(String material, double diameter, double weight, String color, String inflationStatus) {
        this(material, diameter, weight, color);
        this.inflationStatus = inflationStatus;
    }

    public WaterBall(String material, double diameter, double weight, String color, String inflationStatus, int noOfBalls) {
        this(material, diameter, weight, color, inflationStatus);
        this.noOfBalls = noOfBalls;
    }

    public void display() {
        System.out.println("Material:"+material+", Diameter:"+diameter+", Weight:"+weight+", Color:"+color+", Inflation Status:"+inflationStatus+", NoOfBalls:"+noOfBalls);
    }
}
