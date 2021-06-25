package ir.aliap1376ir.lib;

import org.junit.Test;

public class Tester {

    @Test
    public void test(){
        TextWriter textWriter = new TextWriter("aBcdefghijklmnopqrstuvwxyz1234567890.!",'#');
        textWriter.print();
    }

}
