package com.misterspof.ads.module2.lecture1.unionfind;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        int N = StdIn.readInt();

        IUnionFindStrategy qf = new QuickFind();
        IUnionFindStrategy qu = new QuickUnion();
        IUnionFindStrategy ufs = qf;

        UF uf = qf.create(N);

        while(!StdIn.isEmpty()){
            int q = StdIn.readInt();
            int p = StdIn.readInt();
            if(!ufs.connected(p, q)){
                ufs.union(q, p);
                StdOut.println(p + " <-> " + q);
            }
            printUf(uf);
        }
    }

    public static void printUf(UF unionFind){
        int len = unionFind.getData().length;
        int [] data = unionFind.getData();
        for(int i = 0; i < len; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < len; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}