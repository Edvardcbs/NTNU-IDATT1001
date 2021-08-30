import javax.swing.JOptionPane;

class leapYear{

    public static void main(String[] args) {
        
    
        String yearIn = JOptionPane.showInputDialog(null, "Velg år:");
        int year = Integer.parseInt(yearIn);

        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){JOptionPane.showMessageDialog(null, "Året "+year+" er et skuddår.");
            }else{JOptionPane.showMessageDialog(null, "Året "+year+" er ikke et skuddår.");
            }
            }else{JOptionPane.showMessageDialog(null, "Året "+year+" er et skuddår.");}
        }else{
            JOptionPane.showMessageDialog(null, "Året "+year+" er ikke et skuddår.");
        }
        }
    }