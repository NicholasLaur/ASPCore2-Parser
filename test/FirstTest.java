import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import parser.MyParserVisitor;
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
        test = "";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        parser.parseOneLine();
    }

    @Test
    public void secondTest() throws ParseException {
        test = "ciAo";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        parser.head();
    }

    @Test
    public void thirdTest() throws ParseException {
        test = "f(X):-ok(X), g(1,2).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        parser.program();
    }

    @Test(expected = ParseException.class)
    public void fourthTest() throws ParseException {
        test = "f(X,Y):-f(X), .";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        parser.program();
    }

    @Test
    public void fifthTest() throws ParseException {
        test = "F(g(X)):-ok(1,2).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        parser.program();
    }

    @Test
    public void sixthTest() throws ParseException {
        test = "fi(a):-F(G(Ci)),F=1.";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        ASPCore2Program program = parser.program();
        program.dump("");
        MyParserVisitor visitor = new MyParserVisitor();
        visitor.visit(program, null);
    }

    @Test
    public void seventhTest() throws ParseException {
        test = "f(Z,1,2):-#sum{X,Y:ok(X,Y)}=Z.";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        parser.program();
    }

    //@Test(expected = ParseException.class)
    @Test
    public void eighthTest() throws ParseException {
        test = "A(C) :- C=F+1, X(F+2).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        ASPCore2Program program = parser.program();
        program.dump("");
    }

    @Test
    public void ninethTest() throws ParseException {
        test = "f(X) | g(X) :-ok(X).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        parser.program();
    }

    @Test
    public void tenthTest() throws ParseException {
        test = ":-f(_), a.";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        parser.program();
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
        test = ":~f(1), a(X,A). [X@1,1]";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        ASPCore2Program program = parser.program();
        program.dump("");

    }

    @Test
    public void thirteenthTest() throws ParseException {
        test = ":-f(1), not g(F(1)).";
        parser.ReInit(new ByteArrayInputStream(test.getBytes()));
        parser.program();
    }
}
