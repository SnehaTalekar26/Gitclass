class Water {
    String type;         
    double temperature;   
    double volume;        
    String color;         
    String source;        
    double phLevel;       

    public Water() {
        super();
    }

    public Water(String type) {
        this();
        this.type=type;
    }

    public Water(String type,double temperature){
        this(type);
        this.temperature=temperature;
    }

    public Water(String type,double temperature,double volume){
        this(type,temperature);
        this.volume=volume;
    }

    public Water(String type,double temperature,double volume,String color){
        this(type,temperature,volume);
        this.color=color;
    }

    public Water(String type,double temperature,double volume,String color,String source){
        this(type,temperature,volume,color);
        this.source=source;
    }

    public Water(String type,double temperature,double volume,String color,String source,double phLevel){
        this(type,temperature,volume,color,source);
        this.phLevel=phLevel;
    }

    public void display() {
        System.out.println("Type:"+type+", Temperature:"+temperature+", Volume:"+volume+", Color:"+color+", Source:"+source+", pHLevel:"+phLevel);
    }
}
