import com.example.model.Student;
import com.example.model.Teacher;
import com.example.service.SchoolService;

public class Main {
    public static void main(String[] args) {
        SchoolService Service = new SchoolService();

        // 生徒
        Student s1 = new Student("ドウェイン・ジョンソン",14,"男");
        Student s2 = new Student("ジェイソン・ステイサム",10,"女");
        Student s3 = new Student("ヴィン・ディーゼル",15,"男");
        Student s4 = new Student("ブルース・ウィルス",9,"男");

        // 教師
        Teacher t1 = new Teacher("武田信玄",35,"女");
        Teacher t2 = new Teacher("徳川家康",40,"女");
        Teacher t3 = new Teacher("織田信長",40,"男");
        Teacher t4 = new Teacher("伊達政宗",9,"男");

        // クラスの配列宣言
        Student[] studentList = new Student[4];
        Teacher[] teacherList = new Teacher[4];

        // 各要素にオブジェクトを代入
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        studentList[3] = s4;

        teacherList[0] = t1;
        teacherList[1] = t2;
        teacherList[2] = t3;
        teacherList[3] = t4;
        
        // forでループ処理し、リスト追加メソッドに値を追加
        for(Student stu : studentList) {
            Service.checkStudent(stu.getName(),stu.getAge(),stu.getSex()); 
        }

        for(Teacher tea : teacherList) {
            Service.checkTeacher(tea.getName(),tea.getAge(),tea.getSex()); 
        }

        // 学生リスト出力
        Service.outputStudent();

        // 教師リスト出力
        Service.outputTeacher();
    }
}