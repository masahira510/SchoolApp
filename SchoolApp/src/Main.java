import com.example.model.Student;
import com.example.model.Teacher;
import com.example.service.SchoolService;

public class Main {
    public static void main(String[] args) {
        SchoolService Service = new SchoolService();

        // クラスの配列宣言
        Student[] studentList = new Student[4];
        Teacher[] teacherList = new Teacher[4];

        // 各要素にオブジェクトを代入
        studentList[0] = new Student("ドウェイン・ジョンソン",14,"男");
        studentList[1] = new Student("ジェイソン・ステイサム",10,"女");
        studentList[2] = new Student("ヴィン・ディーゼル",15,"男");
        studentList[3] = new Student("ブルース・ウィルス",9,"男");

        teacherList[0] = new Teacher("武田信玄",35,"女");
        teacherList[1] = new Teacher("徳川家康",40,"女");
        teacherList[2] = new Teacher("織田信長",40,"男");
        teacherList[3] = new Teacher("伊達政宗",9,"男");
        
        // forでループ処理し、リスト追加メソッドに値を追加
        for(Student stu : studentList) {
            Service.checkStudent(stu); 
        }

        for(Teacher tea : teacherList) {
            Service.checkTeacher(tea); 
        }

        // 学生リスト出力
        Service.outputStudent();

        // 教師リスト出力
        Service.outputTeacher();
    }
}