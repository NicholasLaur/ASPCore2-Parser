package parser;

import parser.Parser;
import parser.ParserVisitor;
import parser.SimpleNode;

/* Generated By:JJTree: Do not edit this line. ASPCore2Ground_term.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ASPCore2,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASPCore2Ground_term extends SimpleNode {
    public ASPCore2Ground_term(int id) {
        super(id);
    }

    public ASPCore2Ground_term(Parser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor.
     **/
    public Object jjtAccept(ParserVisitor visitor, Object data) {
        System.out.println(getClass().getName() + ": " + this.value);

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=63f05929f55feef5389bdcbfcde6fe9c (do not edit this line) */
