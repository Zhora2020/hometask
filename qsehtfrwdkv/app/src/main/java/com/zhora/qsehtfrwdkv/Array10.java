package com.zhora.qsehtfrwdkv;

import java.util.ArrayList;

public class Array10 <Type> {

    private Type[] myArray;

    public Array10(Type[] myArray) {
        this.myArray = myArray;
    }


    Type get(int i){
        return myArray[i];
    }


}
