class Bitcoin {
    public static void mine() {
        System.out.println("21.Mining Bitcoin.");
        transfer(); 
    }
    public static void transfer() {
        System.out.println("22.Transferring Bitcoin.");
    }
    public static void convert() {
        Wallet.storeCard(); 
    }
    public static void checkBalance() {
        Gold.melt(); 
    }
}

