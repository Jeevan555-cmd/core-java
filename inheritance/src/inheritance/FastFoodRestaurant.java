class FastFoodRestaurant extends Restaurant {
    String special = "Burgers";
    public void menu() {
        System.out.println("Serving fast food like " + special);
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.menu();

        FastFoodRestaurant f = new FastFoodRestaurant();
        f.menu();

        Restaurant rf = new FastFoodRestaurant();
        rf.menu();
    }
}