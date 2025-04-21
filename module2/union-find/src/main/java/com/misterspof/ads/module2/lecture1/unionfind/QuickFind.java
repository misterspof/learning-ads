package com.misterspof.ads.module2.lecture1.unionfind;

import jdk.jshell.spi.ExecutionControl;

public class QuickFind implements IUnionFindStrategy {


    @Override
    public UF create(int N) {
        return new UF(N);
    }

    @Override
    public void union(int p, int q) throws RuntimeException {
        throw new UnsupportedOperationException("The method is not implemented yet");
    }

    @Override
    public boolean connected(int p, int q) {
        throw new UnsupportedOperationException("The method is not implemented yet");
    }
}
