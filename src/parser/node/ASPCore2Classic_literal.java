package parser.node;

import parser.Parser;
import parser.ParserVisitor;
import parser.SimpleNode;

/* Generated By:JJTree: Do not edit this line. ASPCore2Classic_literal.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ASPCore2,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASPCore2Classic_literal extends SimpleNode {
  public ASPCore2Classic_literal(int id) {
    super(id);
  }

  public ASPCore2Classic_literal(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=90f413f63d7ab77f81a9a33944dd1705 (do not edit this line) */
