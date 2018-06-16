package parser;

public class SafetyException extends Exception {
    SafetyException(ASPCore2Variable_term variableTerm){
        super("Safety error. Variable "+variableTerm.value.toString()+" not appear in any positive predicate.");
    }
}
