import static javax.swing.JOptionPane.*;

class kiloPrice{
    public static void main(String[] args) {
        double aPrice = 35.9;
        double aWeight = 0.45;
        double bPrice = 39.5;
        double bWeight = 0.5;
        double aKilo = aPrice/aWeight;
        double bKilo = bPrice/bWeight;
        
        System.out.println(aKilo);
        System.out.println(bKilo);
        double aKiloRound = Math.round(aKilo*100.0)/100.0;
        double bKiloRound = Math.round(bKilo*100.0)/100.0;
        System.out.println(aKiloRound);
        System.out.println(bKiloRound);
        
    
        if(aKiloRound<bKiloRound){
            showMessageDialog(null, "Kiloprisen for kjøttdeig type A er: "+aKiloRound+",-/kg og kiloprisen for kjøttdeig type B er: "+ bKiloRound+",-/kg. A er billigst.");
        }else{
            showMessageDialog(null, "Kiloprisen for kjøttdeig type A er: "+aKiloRound+",-/kg og kiloprisen for kjøttdeig type B er: "+ bKiloRound+",-/kg. B er billigst.");
        }


        


        

    }
}