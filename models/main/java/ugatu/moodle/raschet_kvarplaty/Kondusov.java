
       //отображаем

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
