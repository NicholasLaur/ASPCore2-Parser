package parser;

import parser.node.*;

import java.util.HashMap;

public class MyParserVisitor implements ParserVisitor {
    public HashMap<String, ASPCore2Predicate_name> predicateNames = new HashMap<>();
    public Object defaultVisit(SimpleNode node, Object data){
        node.childrenAccept(this, data);
        return data;
    }
    public Object visit(SimpleNode node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Parse_one_line node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Program node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Rules node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Rule node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Head node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Body node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Disjunction node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Conjunction node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Choice_atom node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Choice_elements node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Choice_element node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Binop node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Arithop node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Aggregate_atom node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Aggregate_elements node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Aggregate_element node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Aggregate_function node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Atom node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Builtin_atom node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Classic_literal node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Naf_literals node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Naf_literal node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Terms node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Basic_terms node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Term node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Basic_term node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Ground_term node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Variable_term node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Function_term node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Expressions_term node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Expression_term node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASPCore2Predicate_name node, Object data){
        return defaultVisit(node, data);
    }

    @Override
    public void addPredicateName(ASPCore2Predicate_name aspCore2Predicate_name) {
        if(!predicateNames.containsKey(aspCore2Predicate_name.value.toString()))
            predicateNames.put(aspCore2Predicate_name.value.toString(), aspCore2Predicate_name);
    }

}
