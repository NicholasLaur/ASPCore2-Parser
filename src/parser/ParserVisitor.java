/* Generated By:JavaCC: Do not edit this line. ParserVisitor.java Version 6.0_1 */
package parser;

public interface ParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASPCore2Parse_one_line node, Object data);
  public Object visit(ASPCore2Program node, Object data);
  public Object visit(ASPCore2Rules node, Object data);
  public Object visit(ASPCore2Rule node, Object data);
  public Object visit(ASPCore2Head node, Object data);
  public Object visit(ASPCore2Body node, Object data);
  public Object visit(ASPCore2Disjunction node, Object data);
  public Object visit(ASPCore2Conjunction node, Object data);
  public Object visit(ASPCore2Choice_atom node, Object data);
  public Object visit(ASPCore2Choice_elements node, Object data);
  public Object visit(ASPCore2Choice_element node, Object data);
  public Object visit(ASPCore2Binop node, Object data);
  public Object visit(ASPCore2NegativeBinop node, Object data);
  public Object visit(ASPCore2Arithop node, Object data);
  public Object visit(ASPCore2NegativeAggregate_atom node, Object data);
  public Object visit(ASPCore2Aggregate_atom node, Object data);
  public Object visit(ASPCore2Aggregate_elements node, Object data);
  public Object visit(ASPCore2Aggregate_element node, Object data);
  public Object visit(ASPCore2Aggregate_function node, Object data);
  public Object visit(ASPCore2Atom node, Object data);
  public Object visit(ASPCore2NegativeBuiltin_atom node, Object data);
  public Object visit(ASPCore2Builtin_atom node, Object data);
  public Object visit(ASPCore2Naf_Classic_literal node, Object data);
  public Object visit(ASPCore2Classic_literal node, Object data);
  public Object visit(ASPCore2Naf_literals node, Object data);
  public Object visit(ASPCore2Naf_literal node, Object data);
  public Object visit(ASPCore2Terms node, Object data);
  public Object visit(ASPCore2Basic_terms node, Object data);
  public Object visit(ASPCore2Term node, Object data);
  public Object visit(ASPCore2Basic_term node, Object data);
  public Object visit(ASPCore2Ground_term node, Object data);
  public Object visit(ASPCore2Variable_term node, Object data);
  public Object visit(ASPCore2Function_term node, Object data);
  public Object visit(ASPCore2Expressions_term node, Object data);
  public Object visit(ASPCore2Expression_term node, Object data);
  public Object visit(ASPCore2Predicate_name node, Object data);
}
/* JavaCC - OriginalChecksum=93ad7a0da60b5eb01154b56670fe95fa (do not edit this line) */
