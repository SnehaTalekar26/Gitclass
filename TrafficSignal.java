class TrafficSignal {
    public static void red() {
        System.out.println("3.Stop at red signal.");
        green(); 
    }
    public static void green() {
        System.out.println("4.Go at green signal.");
    }
    public static void alert() {
        Perfume.spray();
    }
    public static void notifyPolice() {
        Wallet.open(); 
    }
}
