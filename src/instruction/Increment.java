package instruction;

import java.util.*;
import tac.Label;

public class Increment extends Instruction {

    private String nomVariable;

    //On verra plus tard les tableaux
    public Increment(String nomVariable){
        this.nomVariable = nomVariable;
    }

    public void genererCode(Label suivant, Stack pileTableVariable) {
        HashMap hm = (HashMap)pileTableVariable.peek();
        /*Identifiant resDroite = droite.genererCode();
        Identifiant resVariable = variable.genererCode();
        System.out.println(resVariable + " = " + resDroite);*/
    }
}
