class Camera {
    String brand;
    String model;
    int megapixels;
    double price;

    public static void main(String[] args)
	{
        Camera camera1 = new Camera();
        camera1.brand = "Canon";
        camera1.model = "EOS 1500D";
        camera1.megapixels = 24;
        camera1.price = 45000.00;
        System.out.println("Brand: " + camera1.brand + "\nModel: " + camera1.model + "\nMegapixels: " + camera1.megapixels + " MP\nPrice: RS" + camera1.price);

        Camera camera2 = new Camera();
        camera2.brand = "Nikon";
        camera2.model = "D5600";
        camera2.megapixels = 24;
        camera2.price = 52000.00;
        System.out.println("Brand: " + camera2.brand + "\nModel: " + camera2.model + "\nMegapixels: " + camera2.megapixels + " MP\nPrice: RS" + camera2.price);

        Camera camera3 = new Camera();
        camera3.brand = "Sony";
        camera3.model = "Alpha 6400";
        camera3.megapixels = 24;
        camera3.price = 75000.00;
        System.out.println("Brand: " + camera3.brand + "\nModel: " + camera3.model + "\nMegapixels: " + camera3.megapixels + " MP\nPrice: RS" + camera3.price);

        Camera camera4 = new Camera();
        camera4.brand = "FujiFilm";
        camera4.model = "X-T4";
        camera4.megapixels = 26;
        camera4.price = 140000.00;
        System.out.println("Brand: " + camera4.brand + "\nModel: " + camera4.model + "\nMegapixels: " + camera4.megapixels + " MP\nPrice: RS" + camera4.price);

        Camera camera5 = new Camera();
        camera5.brand = "Panasonic";
        camera5.model = "Lumix GH5";
        camera5.megapixels = 20;
        camera5.price = 110000.00;
        System.out.println("Brand: " + camera5.brand + "\nModel: " + camera5.model + "\nMegapixels: " + camera5.megapixels + " MP\nPrice: RS" + camera5.price);

        Camera camera6 = new Camera();
        camera6.brand = "GoPro";
        camera6.model = "Hero 12";
        camera6.megapixels = 27;
        camera6.price = 45000.00;
        System.out.println("Brand: " + camera6.brand + "\nModel: " + camera6.model + "\nMegapixels: " + camera6.megapixels + " MP\nPrice: RS" + camera6.price);

        Camera camera7 = new Camera();
        camera7.brand = "Leica";
        camera7.model = "Q2";
        camera7.megapixels = 47;
        camera7.price = 500000.00;
        System.out.println("Brand: " + camera7.brand + "\nModel: " + camera7.model + "\nMegapixels: " + camera7.megapixels + " MP\nPrice: RS" + camera7.price);

        Camera camera8 = new Camera();
        camera8.brand = "Olympus";
        camera8.model = "OM-D E-M10 Mark IV";
        camera8.megapixels = 20;
        camera8.price = 65000.00;
        System.out.println("Brand: " + camera8.brand + "\nModel: " + camera8.model + "\nMegapixels: " + camera8.megapixels + " MP\nPrice: RS" + camera8.price);

        Camera camera9 = new Camera();
        camera9.brand = "Pentax";
        camera9.model = "K-70";
        camera9.megapixels = 24;
        camera9.price = 50000.00;
        System.out.println("Brand: " + camera9.brand + "\nModel: " + camera9.model + "\nMegapixels: " + camera9.megapixels + " MP\nPrice: RS" + camera9.price);

        Camera camera10 = new Camera();
        camera10.brand = "DJI";
        camera10.model = "Osmo Pocket 3";
        camera10.megapixels = 20;
        camera10.price = 35000.00;
        System.out.println("Brand: " + camera10.brand + "Model: " + camera10.model + "Megapixels: " + camera10.megapixels + " MP\nPrice: RS" + camera10.price);
    }
}
