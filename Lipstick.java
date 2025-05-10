class Lipstick {
    public static void apply() {
        System.out.println("1.Applying lipstick.");
        remove(); 
    }
    public static void remove() {
        System.out.println("2.Removing lipstick.");
    }
    public static void checkBrand() {
        Brand.displayBrand(); 
    }
    public static void checkPrice() {
        Currency.getPrice(); 
    }
}
