package com.example.model;

public class Person {
    // 名前、年齢フィールド
    private String name;
    private int age;

    // コンストラクタでオブジェクトの初期化
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    // ゲッター
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}