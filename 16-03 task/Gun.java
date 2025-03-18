class Gun {
    String material;       
    double caliber;        
    double weight;         
    String color;          
    String actionType;     
    int rounds;            

    public Gun() {
        super();
    }

    public Gun(String material) {
        this();
        this.material = material;
    }

    public Gun(String material, double caliber) {
        this(material);
        this.caliber = caliber;
    }

    public Gun(String material, double caliber, double weight) {
        this(material, caliber);
        this.weight = weight;
    }

    public Gun(String material, double caliber, double weight, String color) {
        this(material, caliber, weight);
        this.color = color;
    }

    public Gun(String material, double caliber, double weight, String color, String actionType) {
        this(material, caliber, weight, color);
        this.actionType = actionType;
    }

    public Gun(String material, double caliber, double weight, String color, String actionType, int rounds) {
        this(material, caliber, weight, color, actionType);
        this.rounds = rounds;
    }

    public void display() {
        System.out.println("Material:"+material+", Caliber:"+caliber+", Weight:"+weight+", Color:"+color+", Action Type:"+actionType+", Rounds:"+rounds);
    }
}

