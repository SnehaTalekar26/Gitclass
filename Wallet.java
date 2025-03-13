class Wallet {
    public static void open() {
        System.out.println("17.Opening wallet.");
        checkCash(); 
    }
    public static void checkCash() {
        System.out.println("18.Checking cash in wallet.");
    }
    public static void close() {
        Bracelet.wear();
    }
    public static void storeCard() {
        Currency.exchange(); 
    }
}

