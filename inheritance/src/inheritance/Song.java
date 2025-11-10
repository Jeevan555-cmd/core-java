class Song extends Music {
    String name = "Perfect";
    public void play() {
        System.out.println("Playing song: " + name);
    }

    public static void main(String[] args) {
        Music m = new Music();
        m.play();

        Song s = new Song();
        s.play();

        Music ms = new Song();
        ms.play();
    }
}