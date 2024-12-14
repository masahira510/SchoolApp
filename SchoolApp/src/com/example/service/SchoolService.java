package com.example.service;
import com.example.model.Student;
import com.example.model.Teacher;
import java.util.ArrayList;


public class SchoolService {

    // 学生リストフィールド定義
    ArrayList<String> studentList = new ArrayList<>();

    // 教師リストフィールド定義
    ArrayList<String> teacherList = new ArrayList<>();
    
    // 学生リスト追加メソッド
    public void checkStudent(String name,int age,String sex) {
        if(age >= 10) {
            studentList.add(name + "," + age + "歳" + "," + sex + "," + "生徒"); //追加
        } else {
            System.out.println(name + "さんは10歳以下です"); //コンソール出力
        }
    }

    // 教師リスト追加メソッド
    public void checkTeacher(String name,int age,String sex) {
        if(age >= 10) {
            teacherList.add(name + "," + age + "歳" + "," + sex + "," + "教師"); //追加
        } else {
            System.out.println(name + "さんは10歳以下です"); //コンソール出力
        }
    }

    // 学生リスト内容をコンソール出力するメソッド
    public void outputStudent() {
        for(String s : studentList) { //forでループ処理
            System.out.println(s);
        }
    }   

    public void outputTeacher() {
        for(String t : teacherList) { //forでループ処理
            System.out.println(t);
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
