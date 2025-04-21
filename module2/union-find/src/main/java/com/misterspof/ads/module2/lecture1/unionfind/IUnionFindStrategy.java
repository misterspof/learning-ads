package com.misterspof.ads.module2.lecture1.unionfind;

public interface IUnionFindStrategy {

    public UF create(int N);
    public void union(int p, int q) throws NoSuchMethodException;
    public boolean connected(int p, int q);
}
