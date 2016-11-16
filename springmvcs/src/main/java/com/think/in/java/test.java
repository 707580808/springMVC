package com.think.in.java;

/**
 * Created by zhuqiang on 16/10/20.
 */
public  abstract  class test {
    abstract void  s();
}

abstract  class a extends  test{

    void  s(){

    }
    abstract void y();
}
class v extends a{

    void y(){
        super.s();
    }

}