public class Main{
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen Van A", 8.5, 7.0, 9.0);
        Student student2 = new Student( "Nguyen Van B", 6, 7, 4);
        Student student3 = new Student( "Nguyen Van C", 9, 10, 9);
        Student[] students = {student1, student2, student3};
        student1.capNhatEmail("lann@ptit.edu.vn").capNhatSdt("091234556");
        for(Student student : students){
            System.out.println(student.getMssv());
            System.out.println(student.getName());
            System.out.println(student.diemTrungBinh());
            
        }
        System.out.println(student1.getEmail());
        System.out.println(student1.getSdt());
        System.out.println(Student.getTotalStudents());
        Classroom classroom = new Classroom("D25CQCC04-B");

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        try {
            Student student4 = new Student("B21DCCN001","Nguyen Van D", 2, 1, 1);
            classroom.addStudent(student4);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        classroom.inBangDiem();
}
}