import static javax.swing.JOptionPane.*;

class centiBeregning{
    public static void main(String[] args) {
        double tommer = 0;
        String tommerLest = showInputDialog("Lengde:"+(tommer));
        
        public static boolean isNumeric(String tommerLest) {
            if (tommerLest == null) {
                showMessageDialog(null, "Du kan ikke bruke negative lengder.");
            }
            try {
                double tommer = Double.parseDouble(tommerLest);
            } catch (NumberFormatException nfe) {
                showMessageDialog(null, "Du kan ikke bruke negative lengder.");
            }
            double centi = tommer * 2.54;
            showMessageDialog(null, tommer+" tommer er " + centi + " centimeter.");
        }
        
       //* tommer= Double.parseDouble(tommerLest);
        
       /* if(tommer<=0){
            showMessageDialog(null, "Du kan ikke bruke negative lengder.");
        }else{
            double centi = tommer * 2.54;
            showMessageDialog(null, tommer+" tommer er " + centi + " centimeter.");
        }*/
    }
}



