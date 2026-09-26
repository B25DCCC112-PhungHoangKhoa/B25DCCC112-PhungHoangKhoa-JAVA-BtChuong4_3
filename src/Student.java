public class Student {
    private static int counter = 0;
    private String mssv;
    private String name;
    private String email;
    private String sdt;
    private double diemCC;
    private double diemGK;
    private double diemCK;


    // Constructor bai 1
    public Student(String mssv, String name, double diemCC, double diemGK, double diemCK) {
        this.mssv = mssv;
        this.name = name;
        this.diemCC = diemCC;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
        counter += 1;
    }
    // Constructor bai 2
    public Student(String name, double diemCC, double diemGK, double diemCK) {
        counter += 1;
        this.mssv = String.format("B21DCCN%03d", counter);
        this.name = name;
        this.diemCC = diemCC;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
    }


    // Getter methods
    public String getMssv() {
        return this.mssv;
    }
    public String getName() {
        return this.name;
    }
    public double getDiemCC() {
        return this.diemCC;
    }
    public double getDiemGK() {
        return this.diemGK;
    }
    public double getDiemCK() {
        return this.diemCK;
    }
    public String getEmail(){
        return this.email;
    }
    public String getSdt(){
        return this.sdt;
    }

    // Setter methods
    public void setDiemCC(double diemCC) {
        if(diemCC >= 0 && diemCC <= 10) {
            this.diemCC = diemCC;
        } else {
            System.out.println("Điểm phải nằm trong khoảng 0 - 10");
        }
    }
    public void setDiemGK(double diemGK) {
        if(diemGK >= 0 && diemGK <= 10) {
            this.diemGK = diemGK;
        } else {
            System.out.println("Điểm phải nằm trong khoảng 0 - 10");
        }
    }
    public void setDiemCK(double diemCK) {
        if(diemCK >= 0 && diemCK <= 10) {
            this.diemCK = diemCK;
        } else {
            System.out.println("Điểm phải nằm trong khoảng 0 - 10");
        }
    }
    // Setter cap nhat email, sdt
    public Student capNhatEmail(String email){
        this.email = email;
        return this;
    }
    public Student capNhatSdt(String sdt){
        this.sdt = sdt;
        return this;
    }


    // Tinh diem trung binh
    public double diemTrungBinh() {
        return (diemCC * 0.1 + diemGK * 0.3 + diemCK * 0.6) / 3;
    }
    // So luong sinh vien da tao
    public static int getTotalStudents(){
        return counter;
    }

    
}