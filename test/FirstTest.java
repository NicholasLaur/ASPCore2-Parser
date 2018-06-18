import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import parser.ParseException;
import parser.Parser;
import parser.ASPCore2Program;

import java.io.ByteArrayInputStream;

public class FirstTest {
    private static Parser parser;
    private static String test;
    @BeforeClass
    public static void init(){
        test = "";
        parser = new Parser(new ByteArrayInputStream(test.getBytes()));
    }
   /* @Before
    public void before(){
        test = "";
    }*/
    @Test
    public void firstTest() throws ParseException {
        test = "f(X).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }

    @Test
    public void secondTest() throws ParseException {
        test = "ciAo:-ok(X),X!=10.";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }

    @Test
    public void thirdTest() throws ParseException {
        test = "f(X):-ok(X), g(1,2).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }

    @Test(expected = ParseException.class)
    public void fourthTest() throws ParseException {
        test = "f(X,Y):-f(X), .";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }

    @Test
    public void fifthTest() throws ParseException {
        test = "f(g(X)):-ok(1,2).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }

    @Test
    public void sixthTest() throws ParseException {
        test = "f(X):-g(X), #sum{Z:a(Z),b(Z,Y)}=X.";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }

    @Test
    public void seventhTest() throws ParseException {
        test = "f(Z,1,2):-#sum{X,Y:ok(X,Y)}=Z.";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }

    @Test(expected = ParseException.class)
    public void eighthTest() throws ParseException {
        test = "f(X):-g(f(1,2).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        ASPCore2Program program = parser.program();
        program.dump("");
    }

    @Test
    public void ninethTest() throws ParseException {
        test = "f(X) | g(X) :-ok(X).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }

    @Test
    public void tenthTest() throws ParseException {
        test = ":-f(1), a.";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }

    @Test
    public void eleventhTest() throws ParseException {
        test = ":-f(1), not a(\"ciao\").";
        System.out.println(test);
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        //Assert.assertTrue(parser.rule());
        ASPCore2Program program = parser.program();
        program.dump("");
    }

    @Test(expected = ParseException.class)
    public void twelfthTest() throws ParseException {
        test = ":~f(1), a(X,).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        ASPCore2Program program = parser.program();
        program.dump("");

    }

    @Test
    public void thirteenthTest() throws ParseException {
        test = ":-f(1), not g(f(1)).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        Assert.assertTrue(parser.rule());
    }
}
