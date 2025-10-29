
class JavaCourse extends Course {
    String instructor = "Mr. Arjun";
    public void details() {
        System.out.println("Java course taught by " + instructor);
    }

    public static void main(String[] args) {
        Course c = new Course();
        c.details();

        JavaCourse j = new JavaCourse();
        j.details();

        Course cj = new JavaCourse();
        cj.details();
    }
}