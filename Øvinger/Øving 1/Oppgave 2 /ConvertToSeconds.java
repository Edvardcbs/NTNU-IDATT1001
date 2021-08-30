import static javax.swing.JOptionPane.*;

class convertToSeconds{
    public static void main(String[] args) {
        double sekunder = 0;
        double minutter = 0;
        double timer = 0;
        double totSek = 0;

        try {
        String timLest = showInputDialog("Timeer: "+(timer));
        String minLest = showInputDialog("Minutter: "+(minutter));
        String sekLest = showInputDialog("Sekunder: "+(sekunder));

        timer = Double.parseDouble(timLest);
        minutter = Double.parseDouble(minLest);
        sekunder = Double.parseDouble(sekLest);
        }
        catch (Exception e) {
            showMessageDialog(null, "feil input");
            System.exit(0);
        }
        
        totSek= sekunder+minutter*60+timer*3600;
        
        if(sekunder>=0 && minutter>=0 && timer>=0){
            showMessageDialog(null, timer+" timer, "+ minutter+" minutter og "+sekunder+" er "+totSek+" sekunder.");
        }else{
            showMessageDialog(null, "Du kan ikke bruke negative tider.");
        }

        
    }
}