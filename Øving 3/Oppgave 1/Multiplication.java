import javax.swing.JOptionPane;
class multiplication{
    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog(null, "Velg tall 1:");
        int start = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog(null, "Velg tall 2:");
        int stop = Integer.parseInt(input2);

        for(int n = start; n<=stop; n++){
            for (int i = 1; i <= 10; i++) {
                System.out.println(n+" x "+i+" = "+(n*i));
            }
        }        

    }


}