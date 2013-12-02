public class Affectation extends Instruction {

    private Expression variable;
    private Expression droite;

    public Affectation(Expression variable, Expression droite){
        this.variable = variable;
        this.droite = droite;
    }

    public void genererCode(Label suivant) {
        EnumOp droiteType = droite.getType();
        //System.out.println("Type de l'affectation : " + droiteType);

        Identifiant resDroite = droite.genererCode();
        Identifiant resVariable = variable.genererCode();
        System.out.println(resVariable + " = " + resDroite);
    }
}
