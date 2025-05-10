class Tomato {
    String variety;   
    double weight;    
    String color;     
    String size;      
    int noOfTomatoes; 

    public Tomato() {
        super();
    }

    public Tomato(String variety) {
        this();
        this.variety = variety;
    }

    public Tomato(String variety, double weight) {
        this(variety);
        this.weight = weight;
    }

    public Tomato(String variety, double weight, String color) {
        this(variety, weight);
        this.color = color;
    }

    public Tomato(String variety, double weight, String color, String size) {
		this(variety, weight, color);
        this.size = size;
    }

    public Tomato(String variety, double weight, String color, String size, int noOfTomatoes) {
        this(variety, weight, color, size);
        this.noOfTomatoes = noOfTomatoes;
    }

    public void display() {
        System.out.println("Variety:"+variety+", Weight:"+weight+", Color:"+color+", Size:"+size+", NoOfTomatoes:"+noOfTomatoes);
    }
}
