package parser.node;

import parser.Parser;
import parser.ParserVisitor;
import parser.SimpleNode;

/* Generated By:JJTree: Do not edit this line. ASPCore2Basic_terms.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ASPCore2,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASPCore2Basic_terms extends SimpleNode {
  public ASPCore2Basic_terms(int id) {
    super(id);
  }

  public ASPCore2Basic_terms(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4d6e282376e7d6fa960fc109f3a8dd1e (do not edit this line) */