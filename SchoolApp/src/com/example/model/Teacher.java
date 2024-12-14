package com.example.model;

public class Teacher extends Person {

    // 性別フィールド
    private String sex;

    // コンストラクタでオブジェクトを初期化
    public Teacher(String name,int age,String sex) {
        super(name,age);
        this.sex = sex;
    }

    // ゲッター
    public String getSex() {
        return sex;
    }
}