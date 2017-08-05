package cl.empresapjm.shrinkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LuckyAnswer {

    private boolean inputUserCheck;
    private boolean luckyDay;

    public LuckyAnswer(boolean inputUserCheck) {
        this.inputUserCheck = inputUserCheck;
        luckyDay = new LuckyDate().ObtenerFecha();
    }

    public boolean isInputUserCheck() {
        return inputUserCheck;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    public class LuckyDate {

        private boolean ObtenerFecha() {

            Date datenow = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            int day = Integer.parseInt(simpleDateFormat.format(datenow));

            if(day%2==0){
                return true;
            }else{
                return false;
            }
        }
    }
}
