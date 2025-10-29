class DigitalLibrary extends Library {
    int ebooks = 20000;
    public void show() {
        System.out.println("Digital library has " + ebooks + " e-books");
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.show();

        DigitalLibrary d = new DigitalLibrary();
        d.show();

        Library ld = new DigitalLibrary();
        ld.show();
    }
}