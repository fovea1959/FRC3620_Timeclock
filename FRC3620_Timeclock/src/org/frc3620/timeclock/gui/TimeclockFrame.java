package org.frc3620.timeclock.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author WEGSCD
 */
public class TimeclockFrame extends javax.swing.JFrame {

    Logger logger = LoggerFactory.getLogger(getClass());
    FormEventListener formEventListener;

    /**
     * Creates new form TimeClockFrame
     *
     * @param t
     */
    public TimeclockFrame(TableModel t, FormEventListener formEventListener) {
        this.formEventListener = formEventListener;
        tableModel = t;
        tableColumnModel = new DefaultTableColumnModel();
        tableColumnModel.addColumn(new TableColumn(0, 200));
        tableColumnModel.addColumn(new TableColumn(1, 50));
        tableColumnModel.addColumn(new TableColumn(2, 50));
        DefaultTableCellRenderer rRenderer = new DefaultTableCellRenderer();
        rRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableColumnModel.getColumn(1).setCellRenderer(rRenderer);
        tableColumnModel.getColumn(2).setCellRenderer(new HHMMRenderer());
        initComponents();

        personsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        personsTable.getSelectionModel().addListSelectionListener(new PersonsTableSelectionListener());
        // setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    TableModel tableModel = null;
    TableColumnModel tableColumnModel = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        personNameLabel = new javax.swing.JLabel();
        checkInButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        currentTime.setBackground(new java.awt.Color(204, 255, 204));
        currentTime.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        currentTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentTime.setText("hh:mm:ss");
        currentTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        personsTable.setModel(tableModel);
        jScrollPane1.setViewportView(personsTable);

        personNameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        personNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personNameLabel.setText("X");
        personNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        checkInButton.setText("Check In");
        checkInButton.setEnabled(false);
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });

        checkOutButton.setText("Check Out");
        checkOutButton.setEnabled(false);
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(checkInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(personNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(personNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkInButton)
                    .addComponent(checkOutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(currentTime, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(currentTime)
                    .addGap(0, 374, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        logger.info("window closing event fired");
        windowClosing = true;
    }//GEN-LAST:event_formWindowClosing

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed
        logger.info("checkin event = {}", evt);
        int i = personsTable.getSelectionModel().getLeadSelectionIndex();
        if (i >= 0) {
            formEventListener.checkin(i);
        }
    }//GEN-LAST:event_checkInButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        logger.info("checkout event = {}", evt);
        int i = personsTable.getSelectionModel().getLeadSelectionIndex();
        if (i >= 0) {
            formEventListener.checkout(i);
        }
    }//GEN-LAST:event_checkOutButtonActionPerformed

    public void setCheckInButtonEnabled(boolean b) {
        checkInButton.setEnabled(b);
        checkInButton.repaint();
        logger.debug("checkinButtonEnabled: {}", b);
    }

    public void setCheckOutButtonEnabled(boolean b) {
        checkOutButton.setEnabled(b);
        checkOutButton.repaint();
        logger.debug("checkOutButtonEnabled: {}", b);
    }

    public void setTimeText(String s) {
        currentTime.setText(s);
    }

    private boolean windowClosing = false;

    public boolean isWindowClosing() {
        return windowClosing;
    }

    class PersonsTableSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            logger.info("selection event = {}", e);
            if (e.getValueIsAdjusting()) {
                Integer selection = personsTable.getSelectionModel().getLeadSelectionIndex();
                formEventListener.personSelected(selection);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkInButton;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JLabel currentTime;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JTable personsTable;
    // End of variables declaration//GEN-END:variables
}
