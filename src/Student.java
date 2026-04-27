class Student {
    String name;
    int rollNumber;
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    Student(Student s) {
        this.name = s.name;
        this.rollNumber = s.rollNumber;
    }

    public static void main(String args[]) {
        Student s1 = new Student("Syed", 101);
        Student s2 = new Student(s1);
        System.out.println(s1.name); // "Syed"
        System.out.println(s2.name); // "Syed"
        s1.name = "John";
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
