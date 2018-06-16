package parser;

import parser.Parser;
import parser.ParserVisitor;
import parser.SimpleNode;

/* Generated By:JJTree: Do not edit this line. ASPCore2Variable_term.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ASPCore2,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASPCore2Variable_term extends SimpleNode {
    public ASPCore2Variable_term(int id) {
        super(id);
    }

    public ASPCore2Variable_term(Parser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor.
     **/
    public Object jjtAccept(ParserVisitor visitor, Object data) {
        //System.out.println(getClass().getName() + ": " + this.value);
        ((MyParserVisitor) visitor).addVariable(this);
        return visitor.visit(this, data);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ASPCore2Variable_term)
            return ((ASPCore2Variable_term) obj).value.toString().equals(this.value.toString());
        return false;
    }
}
/* JavaCC - OriginalChecksum=bb3b53c9f4eb39e799bdd46ee08d5e37 (do not edit this line) */