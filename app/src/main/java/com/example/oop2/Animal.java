package com.example.oop2;

import android.util.Log;
import android.widget.Switch;

public class Animal {
    String category;
    int height;
    int weight;

    public void eat(Food food) {
        switch (food){
            case MEAT: {
                //this.category = "dong vat an thit";
                Log.d("BBB", "dong vat an thit");
                break;
            }
            case GRASS: {
                Log.d("BBB", "dong vat an co");
                break;
            }
        }
    }
}

