package cl.empresapjm.shrinkquizz;



public class LuckyResult extends LuckyAnswer {


    public LuckyResult(boolean inputUserCheck)
    {
        super(inputUserCheck);
    }

    private String useranswer (){
        boolean answer = isInputUserCheck();

        if (answer == true){
            return "Esa es la actitud!. ";
        }else {
            return "Anímate!. ";
        }
    }

    private String userresult (){
        boolean result = isLuckyDay();

        if (result == true){
            return "Y es tu día de suerte!";
        }else {
            return "Vendrán mejores tiempos :)";
        }
    }

    public String result(){
        return (useranswer()+userresult());
    }







}
