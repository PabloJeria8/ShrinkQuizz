package cl.empresapjm.shrinkquizz;

public class MatchResult extends MatchAnswer {

    public MatchResult(int myago, int myagocouply) {
        super(myago, myagocouply);
    }

    public String calulate(){
        int varago = getMyago();
        int varagocouply = getMyagocouply();

        if (varago>varagocouply)
        {
            return "Soy mas viejo :(";
        }else if (varago==varagocouply){
            return "Somos compatibles";
        }else
        {
            return "Mi pareja es mayor :/";
        }

    }

}
