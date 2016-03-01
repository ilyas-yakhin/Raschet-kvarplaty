private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

JFileChooser open = new JFileChooser(); //cоздадим диалог выбора файлов
int option = open.showOpenDialog(open); //отобразим окно выбора файлов
if (option == JFileChooser.APPROVE_OPTION) { //если файл выбран, тогда
   try {
       //System.out.println("select");
       File f = open.getSelectedFile(); //выбранный файл
       //создаем InputStreamReader, кодировка "CP866"
       InputStreamReader in =   new InputStreamReader(new FileInputStream(f),"CP866"); 
       //создаем переменную BufferedReader для использования метода readLine( ), 
       BufferedReader bufferedIn=new BufferedReader(in);
       String p[]; //переменные для отображения тарифов на форме
       p=new String[6];            
       //присваиваем переменным значения из файла, используя чтение построчно readLin()        
       p[1]=bufferedIn.readLine().trim();
       p[2]=bufferedIn.readLine().trim();
       p[3]=bufferedIn.readLine().trim();
       p[4]=bufferedIn.readLine().trim();
       p[5]=bufferedIn.readLine().trim();
       bufferedIn.close(); in.close(); //закрываем поток

jTextField5.setText(p[1]);jTextField8.setText(p[2]);jTextField11.setText(p[3]);
       jTextField14.setText(p[4]);jTextField17.setText(p[5]);
       //поля с результатами очищаем     
       jTextField4.setText("");jTextField7.setText("");jTextField10.setText("");
       jTextField13.setText("");jTextField16.setText("");
       jTextField6.requestFocusInWindow();        
   
   } catch (Exception ex) {
     System.out.println(ex.getMessage());
   }
}
}                                        
private void openFrmJkx(java.awt.event.WindowEvent evt) {                            

}                           
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   //процедура расчета
   Raschet();
}     
private void Raschet(){

   if((frmJkx.this.jTextField5.getText().trim().equals(""))||
      (frmJkx.this.jTextField8.getText().trim().equals(""))||
      (frmJkx.this.jTextField11.getText().trim().equals(""))||
      (frmJkx.this.jTextField14.getText().trim().equals(""))||
      (frmJkx.this.jTextField17.getText().trim().equals(""))){
      //если хотя бы одно из полей, выделенных под тарифы, незаполнено,выводим ошибку 
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
          d = Double.parseDouble(frmJkx.this.jTextField5.getText())*Double.parseDouble(frmJkx.this.jTextField6.getText());    

        }  
        //переводим в число формата 0,00
        dd=new java.text.DecimalFormat("0.00").format(d);   
        //меняем "," на "."
        dd=dd.replace(",",".");
        //отображаем сумму на форме в расчетах
        frmJkx.this.jTextField4.setText(dd);
        //итоговая накопительная
        ddd=d;
        //2.Холодная вода        
        if(frmJkx.this.jTextField9.getText().trim().equals("")){
          d=0.00;             
        }else{
          d = Double.parseDouble(frmJkx.this.jTextField8.getText())*Double.parseDouble(frmJkx.this.jTextField9.getText());    
        }  
        dd=new java.text.DecimalFormat("0.00").format(d);   
        dd=dd.replace(",",".");
        frmJkx.this.jTextField7.setText(dd);
        ddd=ddd+d;
        //3.Электричество        

                if(frmJkx.this.jTextField12.getText().trim().equals("")){
          d=0.00;    
        }else{
          d = Double.parseDouble(frmJkx.this.jTextField11.getText())*Double.parseDouble(frmJkx.this.jTextField12.getText());    
        }  
        dd=new java.text.DecimalFormat("0.00").format(d);
        dd=dd.replace(",",".");
        frmJkx.this.jTextField10.setText(dd);
        ddd=ddd+d;
        //4.Газ         
if(frmJkx.this.jTextField15.getText().trim().equals("")){
          d=0.00;    
        }else{
d = Double.parseDouble(frmJkx.this.jTextField14.getText())*Double.parseDouble(frmJkx.this.jTextField15.getText());    
        }  
        dd=new java.text.DecimalFormat("0.00").format(d);  
        dd=dd.replace(",",".");
        frmJkx.this.jTextField13.setText(dd);
        ddd=ddd+d;
        //5.Интернет
private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        }else{
          d = Double.parseDouble(frmJkx.this.jTextField17.getText())*Double.parseDouble(frmJkx.this.jTextField18.getText());    
        }
        dd=new java.text.DecimalFormat("0.00").format(d);
        dd=dd.replace(",",".");
        frmJkx.this.jTextField16.setText(dd);
        ddd=ddd+d;
        //меняем формат итоговой суммы на 0,00
        dd=new java.text.DecimalFormat("0.00").format(ddd);   
        //меняем "," на ".Э
        dd=dd.replace(",",".");
        //отображаем итоговую сумму на форме
        frmJkx.this.jTextField19.setText(dd);
        return;
    }    
}
private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  

   //Завершение программы при закрытии окна
    System.exit(0);
}                                 
private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {                                       

    if((evt.getKeyCode() == 40)||(evt.getKeyCode() == 10)){
      //при нажатии на кнопки Enter или Down идет переход фокуса на поле
      //ввода показания счетчика для электирчества
        jTextField12.requestFocusInWindow()  ;
    }else{
    if(evt.getKeyCode() == 38){
      //при нажатии на кнопки Up идет переход фокуса на поле
//ввода показания счетчика для газа
            jTextField15.requestFocusInWindow()  ;
        }
    }
}                                       
private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {                                       
    if((evt.getKeyCode() == 40)||(evt.getKeyCode() == 10)){
      //при нажатии на кнопки Enter или Down идет переход фокуса на поле
      //ввода показания счетчика для холодной воды  
      jTextField9.requestFocusInWindow()  ;
    }
    }                                      
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
