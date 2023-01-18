/**
 *
 * @autores: Jorge Eduardo Escobar Bugarini
 *                     Rocio Vanesa Gardea Hernandez
 *                      Diego Gael Martin del Campo
 *                      Julio Eduardo Rascon Vega
 *                      Jesus Alejandro Torres Ramirez
 */
import javax.swing.JOptionPane;

public class Window extends java.awt.Frame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        cuadrado = new javax.swing.JButton();
        cubo = new javax.swing.JButton();
        cilindro = new javax.swing.JButton();
        supPerCuadrado = new javax.swing.JButton();
        sumaDecimales = new javax.swing.JButton();
        supCirculo = new javax.swing.JButton();
        supPerRectangulo = new javax.swing.JButton();
        temperaturas = new javax.swing.JButton();
        metros = new javax.swing.JButton();
        areaTriangulo = new javax.swing.JButton();
        numeroInvertido = new javax.swing.JButton();
        segundosFormatados = new javax.swing.JButton();
        positivoNegativo = new javax.swing.JButton();
        diferentesIguales = new javax.swing.JButton();
        mayorMenor = new javax.swing.JButton();
        Pascua = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        sumatoriaN = new javax.swing.JButton();
        charMinusculas = new javax.swing.JButton();
        Potencia = new javax.swing.JButton();
        sumatorias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        lblSalida = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 255));
        setLocationRelativeTo(null);
        setMaximumSize(new java.awt.Dimension(750, 430));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setName("Ventana"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(750, 430));
        setTitle("Ejercicios FP");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        title.setBackground(new java.awt.Color(51, 51, 51));
        title.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Ejercicios FP");
        title.setName("title"); // NOI18N

        name.setBackground(new java.awt.Color(51, 51, 51));
        name.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(51, 51, 51));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Jorge Eduardo Escobar Bugarini ISC-FP-9");
        name.setName("title"); // NOI18N

        name2.setBackground(new java.awt.Color(51, 51, 51));
        name2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        name2.setForeground(new java.awt.Color(51, 51, 51));
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("Rocío Vanesa Gardea Hernández");
        name2.setName("title"); // NOI18N

        name3.setBackground(new java.awt.Color(51, 51, 51));
        name3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        name3.setForeground(new java.awt.Color(51, 51, 51));
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText("Diego Gael Martin del Campo");
        name3.setName("title"); // NOI18N

        name4.setBackground(new java.awt.Color(51, 51, 51));
        name4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        name4.setForeground(new java.awt.Color(51, 51, 51));
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name4.setText("Jesus Alejandro Torres Ramirez");
        name4.setName("title"); // NOI18N

        name5.setBackground(new java.awt.Color(51, 51, 51));
        name5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        name5.setForeground(new java.awt.Color(51, 51, 51));
        name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name5.setText("Julio Eduardo Rascón Vega");
        name5.setName("title"); // NOI18N

        cuadrado.setBackground(new java.awt.Color(51, 51, 51));
        cuadrado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cuadrado.setForeground(new java.awt.Color(255, 255, 255));
        cuadrado.setText("Cuadrado");
        cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoActionPerformed(evt);
            }
        });

        cubo.setBackground(new java.awt.Color(51, 51, 51));
        cubo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cubo.setForeground(new java.awt.Color(255, 255, 255));
        cubo.setText("Cubo");
        cubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuboActionPerformed(evt);
            }
        });

        cilindro.setBackground(new java.awt.Color(51, 51, 51));
        cilindro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cilindro.setForeground(new java.awt.Color(255, 255, 255));
        cilindro.setText("Cilindro");
        cilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindroActionPerformed(evt);
            }
        });

        supPerCuadrado.setBackground(new java.awt.Color(51, 51, 51));
        supPerCuadrado.setFont(new java.awt.Font("Verdana", 0, 8)); // NOI18N
        supPerCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        supPerCuadrado.setText("Sup y Per. de Cuadrado");
        supPerCuadrado.setToolTipText("");
        supPerCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supPerCuadradoActionPerformed(evt);
            }
        });

        sumaDecimales.setBackground(new java.awt.Color(51, 51, 51));
        sumaDecimales.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        sumaDecimales.setForeground(new java.awt.Color(255, 255, 255));
        sumaDecimales.setText("Suma Decimales");
        sumaDecimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaDecimalesActionPerformed(evt);
            }
        });

        supCirculo.setBackground(new java.awt.Color(51, 51, 51));
        supCirculo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        supCirculo.setForeground(new java.awt.Color(255, 255, 255));
        supCirculo.setText("Sup. Círculo");
        supCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supCirculoActionPerformed(evt);
            }
        });

        supPerRectangulo.setBackground(new java.awt.Color(51, 51, 51));
        supPerRectangulo.setFont(new java.awt.Font("Verdana", 0, 8)); // NOI18N
        supPerRectangulo.setForeground(new java.awt.Color(255, 255, 255));
        supPerRectangulo.setText("Sup y Per. Rectangulo");
        supPerRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supPerRectanguloActionPerformed(evt);
            }
        });

        temperaturas.setBackground(new java.awt.Color(51, 51, 51));
        temperaturas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        temperaturas.setForeground(new java.awt.Color(255, 255, 255));
        temperaturas.setText("°C a °F");
        temperaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperaturasActionPerformed(evt);
            }
        });

        metros.setBackground(new java.awt.Color(51, 51, 51));
        metros.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        metros.setForeground(new java.awt.Color(255, 255, 255));
        metros.setText("Metros a ft, in");
        metros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metrosActionPerformed(evt);
            }
        });

        areaTriangulo.setBackground(new java.awt.Color(51, 51, 51));
        areaTriangulo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        areaTriangulo.setForeground(new java.awt.Color(255, 255, 255));
        areaTriangulo.setText("Area triangulo lados");
        areaTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTrianguloActionPerformed(evt);
            }
        });

        numeroInvertido.setBackground(new java.awt.Color(51, 51, 51));
        numeroInvertido.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        numeroInvertido.setForeground(new java.awt.Color(255, 255, 255));
        numeroInvertido.setText("Numero 5 cifras invertido");
        numeroInvertido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroInvertidoActionPerformed(evt);
            }
        });

        segundosFormatados.setBackground(new java.awt.Color(51, 51, 51));
        segundosFormatados.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        segundosFormatados.setForeground(new java.awt.Color(255, 255, 255));
        segundosFormatados.setText("Seg a min y seg");
        segundosFormatados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundosFormatadosActionPerformed(evt);
            }
        });

        positivoNegativo.setBackground(new java.awt.Color(51, 51, 51));
        positivoNegativo.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        positivoNegativo.setForeground(new java.awt.Color(255, 255, 255));
        positivoNegativo.setText("Positivo o Negativo");
        positivoNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positivoNegativoActionPerformed(evt);
            }
        });

        diferentesIguales.setBackground(new java.awt.Color(51, 51, 51));
        diferentesIguales.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        diferentesIguales.setForeground(new java.awt.Color(255, 255, 255));
        diferentesIguales.setText("Num. Diferentes o Iguales");
        diferentesIguales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diferentesIgualesActionPerformed(evt);
            }
        });

        mayorMenor.setBackground(new java.awt.Color(51, 51, 51));
        mayorMenor.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        mayorMenor.setForeground(new java.awt.Color(255, 255, 255));
        mayorMenor.setText("Num. Mayor y Menor");
        mayorMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorMenorActionPerformed(evt);
            }
        });

        Pascua.setBackground(new java.awt.Color(51, 51, 51));
        Pascua.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Pascua.setForeground(new java.awt.Color(255, 255, 255));
        Pascua.setText("Pascua");
        Pascua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PascuaActionPerformed(evt);
            }
        });

        factorial.setBackground(new java.awt.Color(51, 51, 51));
        factorial.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        factorial.setForeground(new java.awt.Color(255, 255, 255));
        factorial.setText("Factorial");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        sumatoriaN.setBackground(new java.awt.Color(51, 51, 51));
        sumatoriaN.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        sumatoriaN.setForeground(new java.awt.Color(255, 255, 255));
        sumatoriaN.setText("Sumatoria 1 hasta n");
        sumatoriaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumatoriaNActionPerformed(evt);
            }
        });

        charMinusculas.setBackground(new java.awt.Color(51, 51, 51));
        charMinusculas.setFont(new java.awt.Font("Verdana", 0, 9)); // NOI18N
        charMinusculas.setForeground(new java.awt.Color(255, 255, 255));
        charMinusculas.setText("Caracteres minusculas");
        charMinusculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charMinusculasActionPerformed(evt);
            }
        });

        Potencia.setBackground(new java.awt.Color(51, 51, 51));
        Potencia.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Potencia.setForeground(new java.awt.Color(255, 255, 255));
        Potencia.setText("Potencia");
        Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaActionPerformed(evt);
            }
        });

        sumatorias.setBackground(new java.awt.Color(51, 51, 51));
        sumatorias.setForeground(new java.awt.Color(255, 255, 255));
        sumatorias.setText("Sumatorias");
        sumatorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumatoriasActionPerformed(evt);
            }
        });

        salida.setColumns(20);
        salida.setRows(5);
        jScrollPane1.setViewportView(salida);

        lblSalida.setBackground(new java.awt.Color(51, 51, 51));
        lblSalida.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSalida.setForeground(new java.awt.Color(51, 51, 51));
        lblSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalida.setText("Salida");
        lblSalida.setName("title"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cilindro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(supPerCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sumaDecimales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(supCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(supPerRectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(temperaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(areaTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(metros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numeroInvertido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(segundosFormatados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(positivoNegativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(diferentesIguales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mayorMenor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Pascua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(sumatorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sumatoriaN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(charMinusculas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(lblSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(name3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mayorMenor)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cuadrado)
                                    .addComponent(areaTriangulo)
                                    .addComponent(sumatoriaN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cubo)
                                    .addComponent(metros)
                                    .addComponent(factorial))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroInvertido)
                                    .addComponent(charMinusculas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(supPerCuadrado)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(segundosFormatados)
                                        .addComponent(Potencia)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(sumaDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(positivoNegativo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(supCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(diferentesIguales))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(supPerRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(name))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblSalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(temperaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pascua))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name2)
                        .addGap(7, 7, 7)
                        .addComponent(name3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name5))
                    .addComponent(sumatorias))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void cuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoActionPerformed
  
        int rspt = 250*250;
        salida.setText(" 250 * 250 = " + rspt); 
        
    }//GEN-LAST:event_cuadradoActionPerformed

    private void cuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuboActionPerformed
        int n = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduce un número al que desees calcularle el cubo. "));
        int rspt = n*n*n;
        salida.setText("El cubo del número " + n + " es " + rspt); 
    }//GEN-LAST:event_cuboActionPerformed

    private void cilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroActionPerformed
         int r = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduce el radio del cilindro "));
         int h = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduce la altura del cilindro")); 
         double area,perimetro;
       
         area= 2*Math.PI*r*h+2*Math.PI*(r*r);
         perimetro= Math.PI*(r*r)*h;
        
         salida.setText("El area es igual a = "+ area + "\n" + "El perimetro es igual a = " + perimetro);
    }//GEN-LAST:event_cilindroActionPerformed

    private void supPerCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supPerCuadradoActionPerformed

        int l = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduce la longitud del lado del cuadrado "));
        int perimetro,superficie;
        
            perimetro = l+l+l+l;
            superficie = l*l;
            salida.setText("El perimetro es igual a " + perimetro + "\n" + "La superficie es igual a " + superficie);
      
    }//GEN-LAST:event_supPerCuadradoActionPerformed

    private void sumaDecimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaDecimalesActionPerformed
        
        float a,b;
        a = Float.parseFloat(JOptionPane.showInputDialog("Introduce un numero"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Introduce otro numero"));
        
        salida.setText("La suma de "+a+" y "+b+" es:\n"+(a+b));
    }//GEN-LAST:event_sumaDecimalesActionPerformed

    private void supCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supCirculoActionPerformed
          double r=  Double.parseDouble(JOptionPane.showInputDialog(this,"dime el radio de tu circulo"));
          double res=Math.PI* Math.pow(r, 2) ;
          salida.setText("la superfice de tu circulo con un radio de "+r+" es:"+res);
    }//GEN-LAST:event_supCirculoActionPerformed

    private void supPerRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supPerRectanguloActionPerformed

        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce la base del rectangulo"));
        double h = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce la altura del rectangulo"));
        
        double perimetro,superficie;
        
            perimetro = 2*b+2*h;
            superficie = b*h;
            salida.setText("El perimetro es igual a " + perimetro + "\n" + "La superficie es igual a " + superficie);
      
    }//GEN-LAST:event_supPerRectanguloActionPerformed

    private void temperaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperaturasActionPerformed
        
        double celsius = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce la temperatura en grados Celsius"));
        double fahreinheit = (9.0/5.0)*celsius+32;
        
        salida.setText("La temperatura de "+celsius+"°C en grados\n Fahreinheit es: \n"+fahreinheit+"°F");
    }//GEN-LAST:event_temperaturasActionPerformed

    private void metrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metrosActionPerformed
        double m = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce la cantidad de metros"));
        
        double ft,in;
        ft = m*3.28084;
        in = m*39.3701;
        salida.setText("Los "+m+" metros que ingresaste son:\n"+ft+" pies\n"+in+" pulgadas");
    }//GEN-LAST:event_metrosActionPerformed

    private void areaTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTrianguloActionPerformed
        double a = Double.parseDouble(JOptionPane.showInputDialog(this,"Introduzca el primer lado: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog(this,"Introduzca el segundo lado: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog(this,"Introduzca el tercer lado: "));
        double are, p;
          p=(a+b+c)/2;
          are=Math.sqrt(p*(p-a)*(p-b)*(p-c));
       
         salida.setText("El área del triángulo en\n función de la longitud de sus lados es: \n"+are);
    }//GEN-LAST:event_areaTrianguloActionPerformed

    private void segundosFormatadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundosFormatadosActionPerformed
        int segundos = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la cantidad de segundos a mostrar en minutos y segundos"));
        
        int minutos =  segundos/60;
        segundos%=60;
        
        salida.setText("Los segundos que ingresaste en\nel formato de\nminutos y segundos es:\n"+minutos+" minutos con "+segundos+" segundos");
    }//GEN-LAST:event_segundosFormatadosActionPerformed

    private void numeroInvertidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroInvertidoActionPerformed
        int numero,invertido=0, numInicial;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero de 5 cifras"));
        numInicial = numero;
        while(numero>0){
            int temp  = numero%10;
            numero-=temp;
            numero/=10;
            invertido=invertido*10+temp;
        }
        
        if(numInicial>=10000 && numInicial<=99999) salida.setText("El numero "+numInicial+" invertido es:\n"+invertido);
        else salida.setText("El numero no es de cinco cifras");
    }//GEN-LAST:event_numeroInvertidoActionPerformed

    private void PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaActionPerformed
      int base = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el numero de la base"));
      int exponente = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el exponente"));
      int resultado = (int)(Math.pow(base, exponente));
      salida.setText("El "+base+" elevado a la potencia "+exponente+"\nes: "+resultado);
        
    }//GEN-LAST:event_PotenciaActionPerformed

    private void charMinusculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charMinusculasActionPerformed
        String caracteres="";
        int contador=1;
        for(int i=97; i<=122; i++){
            char minuscula = (char)i;
            caracteres+=" "+contador+".-\t"+minuscula+"\n";
            contador++;
        }
        salida.setText("Los caracteres correspondientes\na las minusculas son:\n"+caracteres);
    }//GEN-LAST:event_charMinusculasActionPerformed

    private void sumatoriaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumatoriaNActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero limite de la sumatoria"));
        int sumatoria=0;
        for(int i=1; i<=numero; i++){
            sumatoria+=i;
        }
        salida.setText("La sumatoria del 1 hasta el "+numero+"\nes: "+sumatoria);
    }//GEN-LAST:event_sumatoriaNActionPerformed

    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialActionPerformed
        int numero;
        numero  = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el numero al cual le sacaras factorial"));
        
        long f=1;
        
        for(int i=numero; i>1; i--)
            f*=i;
        if(numero>=0)
        salida.setText("El factorial de "+numero+" es:\n"+f);
        else salida.setText("El numero seleccionado\nno tiene factorial");
    }//GEN-LAST:event_factorialActionPerformed

    private void PascuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PascuaActionPerformed
     int año = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un año entre 1986 y el 2000"));
     if(año>=1986 && año<=2000){
         int a,b,c,d,e,n;
         a = año%19;
         b = año%4;
         c = año%7;
         d = (19*a+24)%30;
         e = (2*b+4*c+6*d+5)%7;
         n =22+d+e;
         if(n>31){
             n%=31;
             salida.setText("El día de pascua del año "+año+"\nfue el "+n+" de abril");
         }
         else salida.setText("El día de pascua del año "+año+"\nfue el "+n+" de Marzo");   
     }else salida.setText("El año no esta en el rango especificado");
    }//GEN-LAST:event_PascuaActionPerformed

    private void mayorMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayorMenorActionPerformed
        int a,b;
        boolean esReordenado=false;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro numero"));
        
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
            esReordenado=true;
        }
        if(esReordenado)
            salida.setText("Los numeros han sido reordenados en\norden ascendente y quedaron\n de esta manera: \n"+a+" "+b);
        else 
            salida.setText("Los numeros ya estaban en orden\n ascendente no fueron reordenados\n y quedaron de esta manera: \n"+a+" "+b);
    }//GEN-LAST:event_mayorMenorActionPerformed

    private void diferentesIgualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diferentesIgualesActionPerformed
        int a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce otro numero"));
        
        if(a==b) salida.setText("Los numeros son iguales");
        else salida.setText("Los numeros son diferentes");
    }//GEN-LAST:event_diferentesIgualesActionPerformed

    private void positivoNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positivoNegativoActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero"));
        
        if(numero>=0) salida.setText("El numero es positivo");
        else salida.setText("El numero es negativo.");
    }//GEN-LAST:event_positivoNegativoActionPerformed

    private void sumatoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumatoriasActionPerformed
       String opciones = "";
       int n,s,x;
       boolean esPositivo=true;
       for (int i=1;i<=12;i++) opciones+="Opcion num. "+i+"\n";
       opciones+="Selecciona una opcion";
       int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,opciones,"Ingresa una opcion"));
           switch(opcion){
               case 1:
                 n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                 s = 0;
                 if(n>=0){
                   for(int i=1; i<=n;i++){
                       s+=i;
                   }
                   salida.setText("La sumatoria es: "+s);
                 }else salida.setText("Ingresa un numero mayor a cero");
                   break;
                case 2:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    s = 0;
                    if(n>=0){
                      for(int i=n; i>=0;i--){
                          s+=i;
                      }
                      salida.setText("La sumatoria es: "+s);
                    }else salida.setText("Ingresa un numero mayor a cero");
                   break;
                case 3:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    s = 0;
                    if(n>=0){
                      for(int i=1; i<=n;i+=2){                          
                          s+=i;
                      }
                      salida.setText("La sumatoria es: "+s);
                    }else salida.setText("Ingresa un numero mayor a cero");
                   break;   
                 case 4:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    s = 0;
                    if(n>=0){
                      for(int i=n; i>=0;i--){
                          s+=i*2;
                      }
                      salida.setText("La sumatoria es: "+s);
                    }else salida.setText("Ingresa un numero mayor a cero");
                   break;
                 case 5:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    double sum = 1;
                    if(n>=0){
                      for(int i=1; i<=n;i++){                        
                          double j = (2*i)+1;
                          sum= sum+ (1.0/j);
                      }
                      salida.setText("La sumatoria es: "+sum);
                    }else salida.setText("Ingresa un numero mayor a cero");
                   break;
                 case 6:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    s = 1;
                    if(n>=0){
                      for(int i=1; i<=n;i++){                        
                          int j = (2*i)+1;
                          if(esPositivo==true){
                              j*=-1;
                              esPositivo=false;
                          }else esPositivo=true;
                          System.out.println(j);
                          s+=j;
                      }
                      salida.setText("La sumatoria es: "+s);
                    }else salida.setText("Ingresa un numero mayor a cero");   
                   break;
                 case 7:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    s = 0;
                    if(n>=0){
                      for(int i=2; i<=n;i++){                          
                          s+=Math.pow(i,i);
                      }
                      salida.setText("La sumatoria es: "+s);
                    }else salida.setText("Ingresa un numero mayor a cero");
                   break;
                 case 8:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    s = 0;
                    if(n>=0){
                      for(int i=2; i<=n;i++){                          
                          s+=Math.pow(i,2*i);
                      }
                      salida.setText("La sumatoria es: "+s);
                    }else salida.setText("Ingresa un numero mayor a cero");
                   break;
                  case 9:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    s = 2;
                    if(n>=0){
                      for(int i=2; i<=n;i+=2){                          
                          s+=Math.pow(i,i-1);
                          if(i==2) s=2;
                      }
                      salida.setText("La sumatoria es: "+s);
                    }else salida.setText("Ingresa un numero mayor a cero");
                   break;
                 case 10:
                  n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));                 
                  x  = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa otro numero"));
                  s = 1;
                  if(n>=0 && x>=1){
                  for(int i=2; i<=n; i++){
                      s+=Math.pow(x,i);
                   }
                  salida.setText("La sumatoria es: "+s);
                  } 
                 break;
                 case 11:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    sum = 1;
                    if(n>=0){
                      for(int i=1; i<=n;i++){                        
                          double j = (2*i)+1;
                          if(esPositivo==true){
                             j*=-1;
                             esPositivo=false;
                          }else esPositivo=true;  
                          sum= sum+(1.0/j);
                          System.out.println(j);
                      }
                      salida.setText("La sumatoria es: "+sum);
                    }else salida.setText("Ingresa un numero mayor a cero");    
                   break;
                 case 12:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                    x  = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa otro numero"));
                    s = 1;
                    if(n>=0 && x>=1){
                      for(int i=1; i<=n;i++){                        
                          if(esPositivo==true){
                              x*=-1;
                              esPositivo=false;
                          }else esPositivo=true;
                          s+=Math.pow(x,2*i);
                      }
                      salida.setText("La sumatoria es: "+s);
                    }else salida.setText("Ingresa un numero mayor a cero");    
                   break;  
                 default:
                     salida.setText("Selecciona una opcion valida\nIntentalo de nuevo");
                     break;        
           }
    }//GEN-LAST:event_sumatoriasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pascua;
    private javax.swing.JButton Potencia;
    private javax.swing.JButton areaTriangulo;
    private javax.swing.JButton charMinusculas;
    private javax.swing.JButton cilindro;
    private javax.swing.JButton cuadrado;
    private javax.swing.JButton cubo;
    private javax.swing.JButton diferentesIguales;
    private javax.swing.JButton factorial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSalida;
    private javax.swing.JButton mayorMenor;
    private javax.swing.JButton metros;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JButton numeroInvertido;
    private javax.swing.JButton positivoNegativo;
    private javax.swing.JTextArea salida;
    private javax.swing.JButton segundosFormatados;
    private javax.swing.JButton sumaDecimales;
    private javax.swing.JButton sumatoriaN;
    private javax.swing.JButton sumatorias;
    private javax.swing.JButton supCirculo;
    private javax.swing.JButton supPerCuadrado;
    private javax.swing.JButton supPerRectangulo;
    private javax.swing.JButton temperaturas;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}