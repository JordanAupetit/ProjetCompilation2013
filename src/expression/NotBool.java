package expression;

import tac.Label;
import identifiant.Identifiant;

public class NotBool extends OperationBooleenne {

    private Expression exp;

    public NotBool(Expression exp) {
        this.exp = exp;
    }

    public void genererJumpCode(Label oui, Label non) {
        this.exp.genererJumpCode(non, oui);
    }

    public Identifiant genererCode() {
        return null;
    }
}