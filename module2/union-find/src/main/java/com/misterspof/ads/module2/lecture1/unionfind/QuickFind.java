package com.misterspof.ads.module2.lecture1.unionfind;

public class QuickFind implements IUnionFindStrategy {

    private UF uf;

    @Override
    public UF create(int N) {
        uf = new UF(N);
        return uf;
    }

    @Override
    public void union(int p, int q) throws RuntimeException {
        if(uf.getData()[p] == uf.getData()[q]) return;
        int right = uf.getData()[q];
        int left = uf.getData()[p];
        int len = uf.getData().length;
        for(int i = 0; i < len; i++){
            if(uf.getData()[i] == left) {
                uf.getData()[i] = right;
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return uf.getData()[p] == uf.getData()[q];
    }
}
