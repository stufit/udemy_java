package section03;

public class gugudan {

    public static int convertHoursToMinutes(int hours){
        if(hours < 0){
            return -1;
        }
        return hours * 60;
    }

    public int convertDaysToMinutes(int days){
        if(days < 0){
            return -1;
        }
        return days * 24 * 60;
    }

}


