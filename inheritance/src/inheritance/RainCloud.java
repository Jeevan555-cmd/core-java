class RainCloud extends Cloud {
    double rainfall = 35.6; // mm
    public void describe() {
        System.out.println("Rain cloud produces " + rainfall + " mm rainfall");
    }

    public static void main(String[] args) {
        Cloud c = new Cloud();
        c.describe();

        RainCloud r = new RainCloud();
        r.describe();

        Cloud cr = new RainCloud();
        cr.describe();
    }
}