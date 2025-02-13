/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author krish
 */
public class CreateDetailsJPanel extends javax.swing.JPanel {

    Person person;
    /**
     * Creates new form CreateDetailsJPanel
     */
    public CreateDetailsJPanel(Person p) {
        initComponents();
        person = p;
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblDriversLicenseNumber = new javax.swing.JLabel();
        txtDriversLicenseNumber = new javax.swing.JTextField();
        lblDriversLicenseState = new javax.swing.JLabel();
        txtDriversLicenseState = new javax.swing.JTextField();
        lblSocialSecurityNumber = new javax.swing.JLabel();
        txtSocialSecurityNumber = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblNationality = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        lblMaritalStatus = new javax.swing.JLabel();
        txtMaritalStatus = new javax.swing.JTextField();
        lblLinkedIn = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        lblEmploymentStatus = new javax.swing.JLabel();
        txtEmploymentStatus = new javax.swing.JTextField();
        lblAddressLine1 = new javax.swing.JLabel();
        txtAddressLine1 = new javax.swing.JTextField();
        lblAddressLine2 = new javax.swing.JLabel();
        txtAddressLine2 = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZIP = new javax.swing.JLabel();
        txtZIP = new javax.swing.JTextField();
        lblTelephoneNumber = new javax.swing.JLabel();
        txtTelephoneNumber = new javax.swing.JTextField();
        lblFaxNumber = new javax.swing.JLabel();
        txtFaxNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        lblFirstName.setText("First Name");

        lblLastName.setText("Last Name");

        lblEmail.setText("Email");

        lblPhone.setText("Phone");

        lblDriversLicenseNumber.setText("Drivers License Number");

        lblDriversLicenseState.setText("Drivers License State");

        lblSocialSecurityNumber.setText("Social Security Number");

        lblDateOfBirth.setText("Date Of Birth");

        lblGender.setText("Gender");

        lblNationality.setText("Nationality ");

        lblMaritalStatus.setText("Marital Status");

        lblLinkedIn.setText("LinkedIn");

        lblEmploymentStatus.setText("Employment Status");

        lblAddressLine1.setText("Address Line 1");

        lblAddressLine2.setText("Address Line 2");

        lblCity.setText("City");

        lblState.setText("State");

        lblZIP.setText("ZIP");

        lblTelephoneNumber.setText("Telephone Number");

        lblFaxNumber.setText("Fax Number");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDriversLicenseNumber)
                                .addComponent(lblDriversLicenseState)
                                .addComponent(lblSocialSecurityNumber))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDriversLicenseNumber)
                                .addComponent(txtDriversLicenseState)
                                .addComponent(txtSocialSecurityNumber)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFirstName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblLastName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPhone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddressLine1)
                            .addComponent(lblAddressLine2)
                            .addComponent(lblCity)
                            .addComponent(lblState)
                            .addComponent(lblZIP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddressLine1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtAddressLine2)
                            .addComponent(txtCity)
                            .addComponent(txtState)
                            .addComponent(txtZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGender)
                                    .addComponent(lblNationality)
                                    .addComponent(lblMaritalStatus)
                                    .addComponent(lblLinkedIn)
                                    .addComponent(lblEmploymentStatus)
                                    .addComponent(lblDateOfBirth))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmploymentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelephoneNumber)
                                    .addComponent(lblFaxNumber))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelephoneNumber)
                                    .addComponent(txtFaxNumber))))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDateOfBirth, lblEmploymentStatus, lblGender, lblLinkedIn, lblMaritalStatus, lblNationality});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDateOfBirth, txtEmploymentStatus, txtGender, txtLinkedIn, txtMaritalStatus, txtNationality});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateOfBirth)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNationality)
                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaritalStatus)
                    .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriversLicenseNumber)
                    .addComponent(txtDriversLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDriversLicenseState)
                    .addComponent(txtDriversLicenseState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmploymentStatus)
                    .addComponent(txtEmploymentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSocialSecurityNumber)
                    .addComponent(txtSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine1)
                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelephoneNumber)
                    .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine2)
                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaxNumber)
                    .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZIP)
                    .addComponent(txtZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String FirstName = txtFirstName.getText();
        String LastName = txtLastName.getText();
        String Email = txtEmail.getText();
        String Phone = txtPhone.getText();
        String DriversLicenseNumber = txtDriversLicenseNumber.getText();
        String DriversLicenseState = txtDriversLicenseState.getText();
        String SocialSecurityNumber = txtSocialSecurityNumber.getText();
        
        String DateOfBirth = txtDateOfBirth.getText();
        String Gender = txtGender.getText();
        String Nationality = txtNationality.getText();
        String MaritalStatus = txtMaritalStatus.getText();
        String LinkedIn = txtLinkedIn.getText();
        String EmploymentStatus = txtEmploymentStatus.getText();
        
        String AddressLine1 = txtAddressLine1.getText();
        String AddressLine2 = txtAddressLine2.getText();
        String City = txtCity.getText();
        String State = txtState.getText();
        String ZIP = txtZIP.getText();
        String TelephoneNumber = txtTelephoneNumber.getText();
        String FaxNumber = txtFaxNumber.getText();
        
        
        person.setFirstName(FirstName);
        person.setLastName(LastName);
        person.setEmail(Email);
        person.setPhone(Phone);
        person.setDriversLicenseNumber(DriversLicenseNumber);
        person.setDriversLicenseState(DriversLicenseState);
        person.setSocialSecurityNumber(SocialSecurityNumber);

        person.setDateOfBirth(DateOfBirth);
        person.setGender(Gender);
        person.setNationality(Nationality);
        person.setMaritalStatus(MaritalStatus);
        person.setLinkedIn(LinkedIn);
        person.setEmploymentStatus(EmploymentStatus);

        person.setAddressLine1(AddressLine1);
        person.setAddressLine2(AddressLine2);
        person.setCity(City);
        person.setState(State);
        person.setZIP(ZIP);
        person.setTelephoneNumber(TelephoneNumber);
        person.setFaxNumber(FaxNumber);
   
        JOptionPane.showMessageDialog(this, "Personal Information Saved", "Success", JOptionPane.PLAIN_MESSAGE);
        
        txtFirstName.setText("");
        txtLastName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtDriversLicenseNumber.setText("");
        txtDriversLicenseState.setText("");
        txtSocialSecurityNumber.setText("");

        txtDateOfBirth.setText("");
        txtGender.setText("");
        txtNationality.setText("");
        txtMaritalStatus.setText("");
        txtLinkedIn.setText("");
        txtEmploymentStatus.setText("");

        txtAddressLine1.setText("");
        txtAddressLine2.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZIP.setText("");
        txtTelephoneNumber.setText("");
        txtFaxNumber.setText("");

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblAddressLine2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDriversLicenseNumber;
    private javax.swing.JLabel lblDriversLicenseState;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmploymentStatus;
    private javax.swing.JLabel lblFaxNumber;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMaritalStatus;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSocialSecurityNumber;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTelephoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZIP;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtDriversLicenseNumber;
    private javax.swing.JTextField txtDriversLicenseState;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmploymentStatus;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMaritalStatus;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSocialSecurityNumber;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTelephoneNumber;
    private javax.swing.JTextField txtZIP;
    // End of variables declaration//GEN-END:variables
}
