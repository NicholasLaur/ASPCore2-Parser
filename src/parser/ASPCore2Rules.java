package parser;

import parser.Parser;
import parser.ParserVisitor;
import parser.SimpleNode;

/* Generated By:JJTree: Do not edit this line. ASPCore2Rules.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ASPCore2,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASPCore2Rules extends SimpleNode {
  public ASPCore2Rules(int id) {
    super(id);
  }

  public ASPCore2Rules(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=98557767874ce9a5c4985a3de1370a7b (do not edit this line) */