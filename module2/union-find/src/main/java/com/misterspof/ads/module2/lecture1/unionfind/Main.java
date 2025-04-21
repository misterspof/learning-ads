package com.misterspof.ads.module2.lecture1.unionfind;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        IUnionFindStrategy qf = new QuickFind();
        int N = StdIn.readInt();
        UF uf = new UF(N);

        while(!StdIn.isEmpty()){
            int q = StdIn.readInt();
            int p = StdIn.readInt();
            if(!qf.connected(p, q)){
                qf.union(q, p);
                StdOut.print(p + " <-> " + q);
            }
        }


    }
}