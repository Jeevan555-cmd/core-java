class Novels extends Bookss {
    String author = "Chetan Bhagat";
    int pages = 300;

    public void read() {
        System.out.println("Reading a novel by " + author + " with " + pages + " pages.");
    }

    public static void main(String[] args) {
        Bookss b = new Bookss();
        b.read();

        Novels n = new Novels();
        n.read();

        Bookss bn = new Novels();
        bn.read();
    }
}
