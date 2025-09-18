package com.misterspof.ads.module2.lecture1.unionfind;

public class QuickUnion implements IUnionFindStrategy {

    private UF uf;

    @Override
    public UF create(int N) {
        uf = new UF(N); return uf;
    }

    @Override
    public void union(int left, int right) throws RuntimeException {
        int p = getRoot(left);
        int q = getRoot(right);
        uf.getData()[p] = q;
    }

    @Override
    public boolean connected(int left, int right) {
        return getRoot(left) == getRoot(right);
    }

    private int getRoot(int root){
        while(root != uf.getData()[root]) root = uf.getData()[root];
        return root;
    }
}
