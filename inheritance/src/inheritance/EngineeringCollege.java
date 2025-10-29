class EngineeringCollege extends University {
    String branch = "Computer Science";
    public void info() {
        System.out.println("Engineering College offers " + branch + " branch");
    }

    public static void main(String[] args) {
        University u = new University();
        u.info();

        EngineeringCollege e = new EngineeringCollege();
        e.info();

        University ue = new EngineeringCollege();
        ue.info();
    }
}