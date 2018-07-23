package parser;

public class WarningException extends Exception {
    WarningException(ASPCore2Atom atom){
        super("Attention, the atom doesn't appear in any head. This rule will be always false");
    }
}
