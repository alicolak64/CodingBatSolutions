public class answerCell {

    public boolean answerCell ( boolean isMorning , boolean isMom, boolean isAsleep) {
        
        if ( isAsleep || ( isMorning && !isMom ) ) 
            return false;
        else 
            return true;
    
    }

}