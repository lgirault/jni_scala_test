package com.mediarithmics.lib.v8;

import static org.junit.Assert.*;

import com.eclipsesource.v8.V8;
import org.junit.Test;

import java.util.TreeMap;

public class V8JavaTest {

    @Test
    public void test(){
        System.out.println(new java.io.File(".").getAbsolutePath());
        //System.out.println("java.class.path = " + System.getProperty("java.class.path"));
        new TreeMap<>(System.getProperties()).forEach((k,v) ->
            System.out.println(k + " -> " + v)
        );
        V8 runtime = V8.createV8Runtime();
        System.loadLibrary("j2v8_linux_x86_64");
        assertEquals(10,10);
    }
}
