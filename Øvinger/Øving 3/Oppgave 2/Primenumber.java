import javax.swing.JOptionPane;

class primeNumber{
    public static void main(String[] args) {
        while(true){
            String inputRaw = JOptionPane.showInputDialog(null, "Velg tall:");
    
            int input = Integer.parseInt(inputRaw);
            boolean prime = true;
            if(input>1){
                for(int i=input-1; i>1; i--){
                    if(input%i == 0){
                        prime = false;
                    }
                }   
            }if(input==1){
                prime = false;
            }if(prime){
                JOptionPane.showMessageDialog(null,input+" er et primtall.");
            }else{
                JOptionPane.showMessageDialog(null,input+" er ikke et primtall.");
            }
        }

        



    }
}