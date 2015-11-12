private void openFrmJkx(java.awt.event.WindowEvent evt) {                            

}                           
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   //процедура расчета
   Raschet();
}     
      (frmJkx.this.jTextField14.getText().trim().equals(""))||
      (frmJkx.this.jTextField17.getText().trim().equals(""))){
      //если хотя бы одно из полей, незаполнено,выводим ошибку 
       JOptionPane.showMessageDialog(null, "Не введены тарифы!");   
    }else{
        //переменные  
        Double d; String dd; Double ddd;
        d=0.00; dd=""; ddd=0.00;
        //Расчет

        //1.Горячая вода 
        if(frmJkx.this.jTextField6.getText().trim().equals("")){ //если показания счетчика 0, тогда 
          d=0.00;             
        }else{
          //если не 0, считаем по формуле  
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new frmJkx().setLocation(1000,1000);
        new frmJkx().setVisible(true);  
        new frmJkx().jTextField6.requestFocusInWindow();
        }
        });
    }
