package com.misterspof.ads.module2.lecture1.unionfind;

public class UF {

    private int [] data;

    public UF(int N){
        this.data = new int[N];
    }

    public int [] getData(){
        return this.data;
    }

    public void setData(int [] data){
        this.data = data;
    }


}
