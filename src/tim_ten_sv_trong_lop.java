
import java.util.Scanner;

public class tim_ten_sv_trong_lop {
    public static void main(String[] args) {
       String[] students = {"truong", "son", "long", "dat", "hau", "sang","tien","tuan anh"};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ten sinh vien");
        String inputname = sc.nextLine();
        Boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputname)) {
                System.out.println("student is in my class" + inputname + "is" + (i + 1));
                isExit = true;
                break;
            }

        }
        if (isExit == false)
            System.out.printf("not found");
    }
}


