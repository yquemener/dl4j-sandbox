package org.dl4j.sandbox;

import org.nd4j.linalg.factory.Nd4j;

/**
 * Created by Yves Quemener on 5/8/18.
 */
public class Simple {
    public static void main(String... args) throws Exception {
        System.out.println(Nd4j.getRandom().nextInt());
    }
}
