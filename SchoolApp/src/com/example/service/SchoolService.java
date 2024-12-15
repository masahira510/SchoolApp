package com.example.service;
import com.example.model.Student;
import com.example.model.Teacher;
import java.util.ArrayList;


public class SchoolService {

    // 学生リストフィールド定義
    ArrayList<Student> students = new ArrayList<>();

    // 教師リストフィールド定義
    ArrayList<Teacher> teachers = new ArrayList<>();
    
    // 学生リスト追加メソッド
    public void checkStudent(Student student) {
        if(student.getAge() >= 10) {
            students.add(student);
        } else {
            System.out.println(student.getName() + "さんは10歳以下です"); //コンソール出力
        }
    }

    // 教師リスト追加メソッド
    public void checkTeacher(Teacher teacher) {
        if(teacher.getAge() >= 10) {
            teachers.add(teacher);
        } else {
            System.out.println(teacher.getName() + "さんは10歳以下です"); //コンソール出力
        }
    }

    // 学生リスト内容をコンソール出力するメソッド
    public void outputStudent() {
        for(Student student : students) { //forでループ処理
            System.out.println(student.getName() + "," + student.getAge() + "歳," + student.getSex() + "," + "生徒");
        }
    }   

    public void outputTeacher() {
        for(Teacher teacher : teachers) { //forでループ処理
            System.out.println(teacher.getName() + "," + teacher.getAge() + "歳," + teacher.getSex() + "," + "教師");
        }
    }

}

// memo //
/*
 * ArrayListはintなどのプリミティブ型(基本データ型)を入れることはができない
 * ArrayListにintを入れたい場合は、ラッパークラスの<Integer>を使用する 
 * Stringは参照型(クラス型)
 * intなどは値型(　int.メソッド名();で呼び出すことはできない)
 * ラッパークラスは、参照型のように使えるようにするもの
 * リスト追加で○○.add(***);でageの値を追加できているが、これはStringに変換されているから？？
 * ゲッターで値を取得した場合、getAge();をaddに入れた場合は、エラーが発生した(intの値だからaddに追加できなかった)
 */
