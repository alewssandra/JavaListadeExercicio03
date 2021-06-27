package exercicio3;

public class Calculadora extends javax.swing.JFrame {
    String numero1, numero2, operador;
    
    public Calculadora() {
        initComponents();
        
        numero1 = null;  //Primeiro numerador.
        numero2 = null;  //Segundo numerador.
        operador = null; //Operação.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_historico = new javax.swing.JTextField();
        tf_resultado = new javax.swing.JTextField();
        bt_7 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_adicao = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_subtracao = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_multiplicacao = new javax.swing.JButton();
        bt_0 = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        bt_divisao = new javax.swing.JButton();
        bt_resultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Calculadora Maldita");

        tf_historico.setText("Histórico de Operações");
        tf_historico.setEnabled(false);

        tf_resultado.setText("Resultado");
        tf_resultado.setEnabled(false);

        bt_7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_7.setText("7");
        bt_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_7MouseClicked(evt);
            }
        });

        bt_8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_8.setText("8");
        bt_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_8MouseClicked(evt);
            }
        });

        bt_9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_9.setText("9");
        bt_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_9MouseClicked(evt);
            }
        });

        bt_adicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_adicao.setText("+");
        bt_adicao.setEnabled(false);
        bt_adicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_adicaoMouseClicked(evt);
            }
        });

        bt_4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_4.setText("4");
        bt_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_4MouseClicked(evt);
            }
        });

        bt_5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_5.setText("5");
        bt_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_5MouseClicked(evt);
            }
        });

        bt_6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_6.setText("6");
        bt_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_6MouseClicked(evt);
            }
        });

        bt_subtracao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_subtracao.setText("-");
        bt_subtracao.setEnabled(false);
        bt_subtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_subtracaoMouseClicked(evt);
            }
        });

        bt_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_1.setText("1");
        bt_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_1MouseClicked(evt);
            }
        });

        bt_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_2.setText("2");
        bt_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_2MouseClicked(evt);
            }
        });

        bt_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_3.setText("3");
        bt_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_3MouseClicked(evt);
            }
        });

        bt_multiplicacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_multiplicacao.setText("*");
        bt_multiplicacao.setEnabled(false);
        bt_multiplicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_multiplicacaoMouseClicked(evt);
            }
        });

        bt_0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_0.setText("0");
        bt_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_0MouseClicked(evt);
            }
        });

        bt_limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_limpar.setText("C");
        bt_limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_limparMouseClicked(evt);
            }
        });

        bt_divisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_divisao.setText("/");
        bt_divisao.setEnabled(false);
        bt_divisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_divisaoMouseClicked(evt);
            }
        });

        bt_resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_resultado.setText("=");
        bt_resultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_resultadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tf_historico, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tf_resultado)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt_0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(bt_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(bt_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(bt_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bt_subtracao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_divisao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_multiplicacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_adicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_historico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_adicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(bt_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_divisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Clique no botão "1" da calculadora.
    private void bt_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_1MouseClicked
       gerenciaCliqueNosNumeros("1");
       gerenciaHistorico("1");
       habilitarOperacoes();
    }//GEN-LAST:event_bt_1MouseClicked

    //Clique no botão "2" da calculadora.
    private void bt_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_2MouseClicked
        gerenciaCliqueNosNumeros("2");
        gerenciaHistorico("2");
        habilitarOperacoes();
    }//GEN-LAST:event_bt_2MouseClicked

    //Clique no botão "3" da calculadora.
    private void bt_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_3MouseClicked
        gerenciaCliqueNosNumeros("3");
        gerenciaHistorico("3");
        habilitarOperacoes();
    }//GEN-LAST:event_bt_3MouseClicked

    //Clique no botão "4" da calculadora.
    private void bt_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_4MouseClicked
        gerenciaCliqueNosNumeros("4");
        gerenciaHistorico("4");
        habilitarOperacoes();
    }//GEN-LAST:event_bt_4MouseClicked

    //Clique no botão "5" da calculadora.
    private void bt_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_5MouseClicked
        gerenciaCliqueNosNumeros("5");
        gerenciaHistorico("5");
        habilitarOperacoes();
    }//GEN-LAST:event_bt_5MouseClicked

    //Clique no botão "6" da calculadora.
    private void bt_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_6MouseClicked
        gerenciaCliqueNosNumeros("6");
        gerenciaHistorico("6");
        habilitarOperacoes();
    }//GEN-LAST:event_bt_6MouseClicked

    //Clique no botão "7" da calculadora.
    private void bt_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_7MouseClicked
        gerenciaCliqueNosNumeros("7");
        gerenciaHistorico("7");
        habilitarOperacoes();
    }//GEN-LAST:event_bt_7MouseClicked

    //Clique no botão "8" da calculadora.
    private void bt_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_8MouseClicked
        gerenciaCliqueNosNumeros("8");
        gerenciaHistorico("8");
        habilitarOperacoes();
    }//GEN-LAST:event_bt_8MouseClicked

    //Clique no botão "9" da calculadora.
    private void bt_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_9MouseClicked
        gerenciaCliqueNosNumeros("9");
        gerenciaHistorico("9");
        habilitarOperacoes();
    }//GEN-LAST:event_bt_9MouseClicked

    //Clique no botão "0" da calculadora.
    private void bt_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_0MouseClicked
        gerenciaCliqueNosNumeros("0");
        gerenciaHistorico("0");
        habilitarOperacoes();
    }//GEN-LAST:event_bt_0MouseClicked

    //Clique no botão "=" da calculadora.
    private void bt_resultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_resultadoMouseClicked
        if(numero1 != null && numero2 != null && operador != null){  //Verifica se os dois numeradores possuem valor.
            int n1, n2, resultado = 0;                               //Verifica se o operador possui valor.
            
            n1 = Integer.parseInt(numero1);  //Converte as strings para inteiros.
            n2 = Integer.parseInt(numero2);
            
            switch(operador){  //Faz o switch sobre o operador para verificar qual operação deve ser realizada.
                case "+":
                    resultado = n1 + n2;
                    break;
                case "-":
                    resultado = n1 - n2;
                    break;
                case "*":
                    resultado = n1 * n2;
                    break;
                case "/":
                    resultado = n1 / n2;
                    break;
            }
            
            tf_historico.setText(tf_historico.getText() + "=" + resultado); //Seta o texto do histórico.
            tf_resultado.setText(String.valueOf(resultado));                //Seta o texto do resultado.
            
            numero1 = String.valueOf(resultado); //Após o calculo, o numerador1 passa a ser o resultado, para que mais operações
            numero2 = null;                      //possam ser efetuadas sobre o resultado.
            operador = null;
            habilitarOperacoes();
        }
    }//GEN-LAST:event_bt_resultadoMouseClicked

    //Clique no botão "+".
    private void bt_adicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_adicaoMouseClicked
        if(bt_adicao.isEnabled()){
            operador = "+";
            desabilitarOperacoes();
            gerenciaHistorico(operador);
        }
    }//GEN-LAST:event_bt_adicaoMouseClicked

    //Clique no botão "-".
    private void bt_subtracaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_subtracaoMouseClicked
        if(bt_subtracao.isEnabled()){
            operador = "-";
            desabilitarOperacoes();
            gerenciaHistorico(operador);
        }
    }//GEN-LAST:event_bt_subtracaoMouseClicked

    //Clique no botão "*".
    private void bt_multiplicacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_multiplicacaoMouseClicked
        if(bt_multiplicacao.isEnabled()){
            operador = "*";
            desabilitarOperacoes();
            gerenciaHistorico(operador);
        }
    }//GEN-LAST:event_bt_multiplicacaoMouseClicked

    //Clique no botão "/".
    private void bt_divisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_divisaoMouseClicked
        if(bt_divisao.isEnabled()){
            operador = "/";
            desabilitarOperacoes();
            gerenciaHistorico(operador);
        }
    }//GEN-LAST:event_bt_divisaoMouseClicked

    //Clique no botão "C".
    private void bt_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_limparMouseClicked
        tf_historico.setText("");
        tf_resultado.setText("");
        numero1 = null;
        numero2 = null;
        operador = null;
    }//GEN-LAST:event_bt_limparMouseClicked

    //Método executado toda vez que algum número é clicado.
    private void gerenciaCliqueNosNumeros(String numero){
        if(operador == null){
           if(numero1 == null){
               numero1 = numero; //Numerador 1 de 1 digito.
           }
           else{
               numero1 = numero1 + numero; //Numerador 1 com mais de 1 digito.
           }
       }
        else{
            if(numero2 == null){
               numero2 = numero; //Numerador 2 de 1 digito.
            }
            else{
               numero2 = numero2 + numero; //Numerador 2 com mais de 1 digito.
            }
        }
    }
    
    //Método executado sempre que algum número ou operador é clicado.
    //É responsável por gerenciar o texto que será exibido no histórico.
    private void gerenciaHistorico(String s){
        String textoHistorico = tf_historico.getText();
        
        if(textoHistorico.equals("Histórico de Operações")){  //Primeiro número digitado no programa.
            tf_historico.setText(s);
        }
        else{  //Caso quando já existem outros números/operações aparecendo no histórico.
            tf_historico.setText(textoHistorico + s);
        }
    }
    
    //Método responsável por habilitar os botões das operações.
    private void habilitarOperacoes(){
        if(operador == null){
            bt_adicao.setEnabled(true);
            bt_subtracao.setEnabled(true);
            bt_multiplicacao.setEnabled(true);
            bt_divisao.setEnabled(true);
        }
    }
    
    //Método responsável por desabilitar os botões das operações.
    private void desabilitarOperacoes(){
        bt_adicao.setEnabled(false);
        bt_subtracao.setEnabled(false);
        bt_multiplicacao.setEnabled(false);
        bt_divisao.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_0;
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JButton bt_adicao;
    private javax.swing.JButton bt_divisao;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_multiplicacao;
    private javax.swing.JButton bt_resultado;
    private javax.swing.JButton bt_subtracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf_historico;
    private javax.swing.JTextField tf_resultado;
    // End of variables declaration//GEN-END:variables
}
