import java.util.ArrayList;

public class Classroom {
    private String tenLop;
    private ArrayList<Student> students;


    public Classroom(String tenLop){
        this.tenLop = tenLop;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s){
        for(Student student : students){
            if(student.getMssv().equals(s.getMssv())){
                throw new IllegalArgumentException(
                    "MSSV " + s.getMssv() + " đã tồn tại trong lớp!"
                );
            }

        }
        students.add(s);
    }
     public String xepLoai(Student s) {
        double dtb = s.diemTrungBinh();

        if (dtb >= 3) {
            return "Giỏi";
        } else if (dtb >= 2.5) {
            return "Khá";
        } else if (dtb >= 1.5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
    public void inBangDiem() {
        System.out.println("===== BẢNG ĐIỂM LỚP " + tenLop + " =====");

        for (Student student : students) {
            System.out.printf(
                "MSSV: %s | Họ tên: %s | ĐTB: %.2f | Xếp loại: %s%n",
                student.getMssv(),
                student.getName(),
                student.diemTrungBinh(),
                xepLoai(student)
            );
        }

        System.out.println("Sĩ số lớp: " + students.size());
    }



}
