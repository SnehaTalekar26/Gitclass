class Brand {
    public static void displayBrand() {
        System.out.println("5.Displaying brand name.");
        checkAuthenticity();
    }
    public static void checkAuthenticity() {
        System.out.println("6.Checking brand authenticity.");
    }
    public static void compareQuality() {
        Gold.qualityCheck(); 
    }
    public static void compareWithOtherBrand() {
        Wire.checkWireQuality(); 
    }
}

