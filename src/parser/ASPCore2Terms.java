package parser;

import parser.Parser;
import parser.ParserVisitor;
import parser.SimpleNode;

/* Generated By:JJTree: Do not edit this line. ASPCore2Terms.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ASPCore2,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASPCore2Terms extends SimpleNode {
    public ASPCore2Terms(int id) {
        super(id);
    }

    public ASPCore2Terms(Parser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor.
     **/
    public Object jjtAccept(ParserVisitor visitor, Object data) {

        return
                visitor.visit(this, data);
    }

    public void jjtAcceptTerm(ParserVisitor visitor, ASPCore2Atom atom) {
        // System.out.println(atom.childrenTerm);
        for(int i = 0; i<children.length; i++)
            if(children[i] instanceof ASPCore2Term){
                ((ASPCore2Term)children[i]).jjtAcceptTerm(visitor, atom);
                //System.out.println(atom.childrenTerm);
            }else if(children[i] instanceof  ASPCore2Terms)
                ((ASPCore2Terms)children[i]).jjtAcceptTerm(visitor, atom);
    }
}
/* JavaCC - OriginalChecksum=00df62f7a03528272d1f50f439d9c863 (do not edit this line) */
