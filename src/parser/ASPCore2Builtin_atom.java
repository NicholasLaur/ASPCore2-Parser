package parser;

import parser.Parser;
import parser.ParserVisitor;
import parser.SimpleNode;

/* Generated By:JJTree: Do not edit this line. ASPCore2Builtin_atom.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ASPCore2,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASPCore2Builtin_atom extends SimpleNode {
  public ASPCore2Builtin_atom(int id) {
    super(id);
  }

  public ASPCore2Builtin_atom(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=654b97cca931b8946e8f0cd215c33acc (do not edit this line) */
