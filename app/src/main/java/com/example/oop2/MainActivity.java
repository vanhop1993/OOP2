package com.example.oop2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Animal dog = new Animal();
        dog.category = "chó";
        dog.height = 50;
        dog.weight = 3;
        dog.eat(Food.MEAT);*/
        Dog kiki = new Dog();
        kiki.category = "cho viet nam";
        kiki.height = 50;
        kiki.weight = 3;
        kiki.setSpeed(5);
        kiki.eat(Food.MEAT);
    }
}