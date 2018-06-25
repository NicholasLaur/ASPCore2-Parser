package parser;

import java.util.ArrayList;
import java.util.HashMap;

public class MyParserVisitor implements ParserVisitor {
    public ArrayList<ASPCore2Variable_term> positiveVariable = new ArrayList<>();
    public ArrayList<ASPCore2Variable_term> negativeVariable = new ArrayList<>();
    public ArrayList<ASPCore2Atom> atoms = new ArrayList<>();
    public ArrayList<ASPCore2Atom> atomsInHead = new ArrayList<>();
    public HashMap<String, ASPCore2Predicate_name> predicateNames = new HashMap<>();
    public boolean checkWarning = false;

    public Object defaultVisit(SimpleNode node, Object data) {
        node.childrenAccept(this, data);
        return data;
    }

    public Object visit(SimpleNode node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Parse_one_line node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Program node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Rules node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Rule node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Head node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Body node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Disjunction node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Conjunction node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Choice_atom node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Choice_elements node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Choice_element node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Binop node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Arithop node, Object data) {
        return defaultVisit(node, data);
    }

    @Override
    public Object visit(ASPCore2Naf_Aggregate_atom node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Aggregate_atom node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Aggregate_elements node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Aggregate_element node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Aggregate_function node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Atom node, Object data) {
        return defaultVisit(node, data);
    }

    @Override
    public Object visit(ASPCore2UnequalBuiltin_atom node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Builtin_atom node, Object data) {
        return defaultVisit(node, data);
    }

    @Override
    public Object visit(ASPCore2Naf_Classic_literal node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Classic_literal node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Naf_literals node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Naf_literal node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Terms node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Basic_terms node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Term node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Basic_term node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Ground_term node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Variable_term node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Function_term node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Expressions_term node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Expression_term node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASPCore2Predicate_name node, Object data) {
        return defaultVisit(node, data);
    }

    public void addPredicateName(ASPCore2Predicate_name aspCore2Predicate_name) {
        if (!predicateNames.containsKey(aspCore2Predicate_name.value.toString()))
            predicateNames.put(aspCore2Predicate_name.value.toString(), aspCore2Predicate_name);
    }

    public void addAtom(ASPCore2Atom atom) {
        boolean head = false;

        SimpleNode node = (SimpleNode) atom.parent;
        String parent = node.getClass().getName();
        while (!parent.equals(ASPCore2Conjunction.class.getName()) && !head) {
            if (parent.equals(ASPCore2Disjunction.class.getName()))
                head = true;
            else if (!head && node.parent != null) {
                SimpleNode newNode = (SimpleNode) node.parent;
                node = newNode;
                parent = node.getClass().getName();
            }
        }
        if (!head && checkWarning){
            //System.out.println("Corpo"+((ASPCore2Predicate_name)atom.children[0]).value+""+atom.childrenTerm);
            atoms.add(atom);
        }
        else if (head && !checkWarning){
            //System.out.println("Testa"+((ASPCore2Predicate_name)atom.children[0]).value+""+atom.childrenTerm);
            atomsInHead.add(atom);
        }
    }

    public void addVariable(ASPCore2Variable_term aspCore2Variable_term) {
        SimpleNode node = (SimpleNode) aspCore2Variable_term.parent;
        String parent = node.getClass().getName();
        boolean positive = true;
        while (!parent.equals("parser.ASPCore2Conjunction") && positive) {
            if (parent.equals("parser.ASPCore2Aggregate_element"))
                break;
            if (parent.equals("parser.ASPCore2Naf_Classic_literal") ||
                    parent.equals("parser.ASPCore2Naf_Aggregate_atom") || parent.equals("parser.ASPCore2Disjunction")
                    || parent.equals("parser.ASPCore2UnequalBuiltin_atom"))
                positive = false;
            if (positive && node.parent != null) {
                SimpleNode newNode = (SimpleNode) node.parent;
                node = newNode;
                parent = node.getClass().getName();
                //System.out.println(parent);
            }
        }
        if (positive) {
            positiveVariable.add(aspCore2Variable_term);
            //System.out.println("positiva " + aspCore2Variable_term.value.toString());
        } else {
            negativeVariable.add(aspCore2Variable_term);
            //System.out.println("negativa " + aspCore2Variable_term.value.toString());
        }
    }

    public void checkSafety() throws SafetyException {
        for (int i = 0; i < negativeVariable.size(); i++)
            if (!positiveVariable.contains(negativeVariable.get(i)))
                throw new SafetyException(negativeVariable.get(i));
    }

    public void checkWarningForAtomNotInHead() throws WarningException {
        //System.out.println(atoms.size()+" "+atomsInHead.size());
        for(ASPCore2Atom atom: atoms){
            if(!atomsInHead.contains(atom))
                throw new WarningException(atom);
        }
    }
}
