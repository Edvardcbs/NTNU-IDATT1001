import static javax.swing.JOptionPane.*;

class centiBeregning{
    public static void main(String[] args) {
        double tommer = 0;
        String tommerLest = showInputDialog("Lengde:"+(tommer));
        tommer= Double.parseDouble(tommerLest);
        if(tommer>=0){
            double centi = tommer * 2.54;
            showMessageDialog(null, tommer+" tommer er " + centi + " centimeter.");
        }else{
            showMessageDialog(null, "Du kan ikke bruke negative lengder.");
        }
    }
}