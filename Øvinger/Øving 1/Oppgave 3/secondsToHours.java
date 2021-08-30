import static javax.swing.JOptionPane.*;

class secondsToHours{
    public static void main(String[] args) {
        
        
        try {
        String rawSec = showInputDialog(null, "Skriv inn sekunder: ");    
        int sec = Integer.parseInt(rawSec);
        int h = sec / 3600;
        int m = (sec % 3600) / 60;
        int s = sec%60;

        if(h>=0 && m>=0 && s>=0 ){
            String result =
            String.format("%s sekunder er %s timer, %s minutter og %s sekunder.", rawSec, h, m, s);
            showMessageDialog(null, result);
        }else{
            showMessageDialog(null, "Du kan ikke bruke negative tider.");
        }

        } 
        catch (Exception e) {
            showMessageDialog(null, "feil input");
            System.exit(0);

        }        
    }
}


