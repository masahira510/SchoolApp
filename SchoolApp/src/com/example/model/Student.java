package com.example.model;


    // Personクラスを継承
    public class Student extends Person {
        // 性別フィールド
        private String sex;

        //コンストラクタでオブジェクトの初期化
        public Student(String name,int age,String sex) {
            super(name,age);
            this.sex = sex;
        }
        
        // ゲッター
        public String getSex() {
            return sex;
        }
    }

    