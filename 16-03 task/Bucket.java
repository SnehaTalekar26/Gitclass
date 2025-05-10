class Bucket {
    String material;
    String capacity;
    double weight;
    String handleType;
    String usage;
    int noOfBuckets;

    public Bucket() {
        super();
    }

    public Bucket(String material) {
        this();
        this.material = material;
    }

    public Bucket(String material,int capacity) {
        this(material);
        this.capacity = capacity;
    }

    public Bucket(String material,int capacity, double weight) {
        this(material, capacity);
        this.weight = weight;
    }

    public Bucket(String material,int capacity, double weight, String handleType) {
        this(material, capacity, weight);
        this.handleType = handleType;
    }

    public Bucket(String material,int capacity, double weight, String handleType, String usage) {
        this(material, capacity, weight, handleType);
        this.usage = usage;
    }

    public Bucket(String material,int capacity, double weight, String handleType, String usage, int noOfBuckets) {
        this(material, capacity, weight, handleType, usage);
        this.noOfBuckets = noOfBuckets;
    }

    public void display() {
        System.out.println("Material:"+material+", Capacity:"+capacity+", Weight:"+weight+", HandleType:"+handleType+", Usage:"+usage+", NoOfBuckets:"+noOfBuckets);
    }
}
