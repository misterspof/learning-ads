package com.misterspof.ads.module2.lecture1.unionfind;

public class UF {

    private int [] data;

    public UF(int N){

        this.data = new int[N];
        for(int i = 0; i < N; i++){
            setData(i, i);
        }
    }

    public int [] getData(){
        return this.data;
    }

    public void setData(int [] data){
        this.data = data;
    }

    public void setData(int index, int val){
        data[index] = val;
    }

}
