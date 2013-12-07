package expression;

import tac.EnumOp;
import tac.Label;
import identifiant.Identifiant;

public abstract class OperationArithmetique extends Expression {

    public void genererJumpCode(Label oui, Label non) {
           Identifiant res = genererCode();
           String result = "if " + res + " != 0 jump " + oui +
                           "\njump " + non;
           System.out.println(result);
    }

    //public abstract Identifiant genererCode();

    public EnumOp getType() {
        return EnumOp.OP_ARITHMETIQUE;
    }
}
