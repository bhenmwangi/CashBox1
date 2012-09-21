/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.lwuit.Button;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Container;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.BoxLayout;
import javax.microedition.midlet.*;

/**
 * @author bena
 */
public class CashBox extends MIDlet implements ActionListener {

    public void startApp() {
        Display.init(this);
        Login();
        //MainMenu();
    }
    //declarations
    private Form frmLogin;
    private Label lblUsername, lblPassword;
    private TextField txtUsername, txtPassword;
    private Button btnLogin;
    private Container contLogin;

    public void Login() {
        //initialisation
        frmLogin = new Form("Login");
        frmLogin.setLayout(new BorderLayout());

        lblUsername = new Label("Username");
        txtUsername = new TextField();

        lblPassword = new Label("Password");
        txtPassword = new TextField();
        txtPassword.setConstraint(TextField.PASSWORD);
        txtPassword.setMaxSize(8);

        btnLogin = new Button("Login");
        btnLogin.addActionListener(this);

        contLogin = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        contLogin.addComponent(lblUsername);
        contLogin.addComponent(txtUsername);
        contLogin.addComponent(lblPassword);
        contLogin.addComponent(txtPassword);
        contLogin.addComponent(btnLogin);

        frmLogin.addComponent(BorderLayout.CENTER, contLogin);
        frmLogin.show();

        frmLogin.addCommand(new Command("Exit") {
            public void actionPerformed(ActionEvent ae) {
                destroyApp(true);
            }
        });

    }
    //declarations
    private Form frmMainMenu;
    private Button btnPayments, btnCustomers, btnReport, btnBusiness;
    //private Label lblPayments, lblCustomers, lblReport, lblBusiness;
    private Container contMainMenu;

    public void MainMenu() {
        //initialisation
        frmMainMenu = new Form("CashBox");
        //frmMainMenu.setTransitionInAnimator(Transition3D.createCube(800, true));
        frmMainMenu.setLayout(new BorderLayout());

        btnPayments = new Button("Payments");
        btnPayments.addActionListener(this);

        btnCustomers = new Button("Customers");
        btnCustomers.addActionListener(this);

        btnReport = new Button("Reports");
        btnReport.addActionListener(this);

        btnBusiness = new Button("Business");
        btnBusiness.addActionListener(this);

        contMainMenu = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        contMainMenu.addComponent(btnPayments);
        contMainMenu.addComponent(btnCustomers);
        contMainMenu.addComponent(btnReport);
        contMainMenu.addComponent(btnBusiness);
        frmMainMenu.addComponent(BorderLayout.NORTH, contMainMenu);
        frmMainMenu.show();

        frmMainMenu.addCommand(new Command("Back") {
            public void actionPerformed(ActionEvent ae) {
                Login();
            }
        });
    }
    //declarations
    private Form frmCustomers;
    private Button btnAddCustomers, btnBalance, btnClients, btnTopUp, btnAddExtra;
    private Container contCustomers;

    public void Customers() {
        //initialise
        frmCustomers = new Form("Manage Customer");
        //frmCustomers.setTransitionOutAnimator(Transition3D.createFlyIn(800));
        frmCustomers.setLayout(new BorderLayout());

        btnAddCustomers = new Button("Add Customers");
        btnAddCustomers.addActionListener(this);

        btnBalance = new Button("Check Balance");
        btnBalance.addActionListener(this);

        btnClients = new Button("View Clients");
        btnClients.addActionListener(this);

        btnTopUp = new Button("Top Up");
        btnTopUp.addActionListener(this);

        btnAddExtra = new Button("Add Extra Customer Account");
        btnAddExtra.addActionListener(this);

        contCustomers = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        contCustomers.addComponent(btnAddCustomers);
        contCustomers.addComponent(btnBalance);
        contCustomers.addComponent(btnClients);
        contCustomers.addComponent(btnTopUp);
        contCustomers.addComponent(btnAddExtra);

        frmCustomers.addComponent(BorderLayout.CENTER, contCustomers);
        frmCustomers.show();

        frmCustomers.addCommand(new Command("Back") {
            public void actionPerformed(ActionEvent ae) {
                MainMenu();
            }
        });
    }
    private Form frmAddCustomer;
    private Label lblClientDetails, lblFirstName, lblSecondName, lblMobileNumber, lblEmail;
    private TextField txtFirstName, txtSecondName, txtMobileNumber, txtEmail;
    private Button btnAddClient;
    private Container contAddCustomer;

    public void AddCustomer() {
        //initialising
        frmAddCustomer = new Form("Add Customer");
        frmAddCustomer.setLayout(new BorderLayout());

        lblClientDetails = new Label("Client Details");
        lblFirstName = new Label("First Name");
        txtFirstName = new TextField();

        lblSecondName = new Label("Second Name");
        txtSecondName = new TextField();

        lblMobileNumber = new Label("Mobile Number");
        txtMobileNumber = new TextField();

        lblEmail = new Label("Email");
        txtEmail = new TextField();

        btnAddClient = new Button("Add Client");

        contAddCustomer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        contAddCustomer.addComponent(lblClientDetails);
        contAddCustomer.addComponent(lblFirstName);
        contAddCustomer.addComponent(txtFirstName);
        contAddCustomer.addComponent(lblSecondName);
        contAddCustomer.addComponent(txtSecondName);
        contAddCustomer.addComponent(lblMobileNumber);
        contAddCustomer.addComponent(txtMobileNumber);
        contAddCustomer.addComponent(lblEmail);
        contAddCustomer.addComponent(txtEmail);
        contAddCustomer.addComponent(btnAddClient);

        frmAddCustomer.addComponent(BorderLayout.CENTER, contAddCustomer);
        frmAddCustomer.show();
        frmAddCustomer.addCommand(new Command("Back") {
            public void actionPerformed(ActionEvent ae) {
                Customers();
            }
        });
    }
    
    //declarations
    private Form frmBusiness;
    private Button btnAddAccount, btnEditAccount, btnViewAccount, btnUpdateAccount;
    private Container contBusiness;
    
    //For the business module
    public void Business(){
        //initialisation
        frmBusiness = new Form("Manage Business");
        frmBusiness.setLayout(new BorderLayout());
        
        btnAddAccount = new Button("Add Account");
        btnAddAccount.addActionListener(this);
        
        btnEditAccount = new Button("Edit Account");
        btnEditAccount.addActionListener(this);
        
        btnViewAccount = new Button("View Account");
        btnViewAccount.addActionListener(this);
        
        btnUpdateAccount = new Button("Update Account");
        btnUpdateAccount.addActionListener(this);
        
        contBusiness = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        contBusiness.addComponent(btnAddAccount);
        contBusiness.addComponent(btnEditAccount);
        contBusiness.addComponent(btnViewAccount);
        contBusiness.addComponent(btnUpdateAccount);
        
        frmBusiness.addComponent(BorderLayout.CENTER, contBusiness);
        frmBusiness.show();
        
        frmBusiness.addCommand(new Command("Back"){
            public void actionPerformed(ActionEvent ae){
                MainMenu();
            }
        });
    }
    //declarations
    private Form frmAddAccount;
    private Label lblAccountDetails, lblAccountName, lblAmount, lblHolder, lblSelectType;
    private TextField txtAccountName, txtAmount;
    private Button btnAddAccountDetails;
    private Container contAddAccount;
    private ComboBox cbxHolder, cbxSelectType;
    
    public void AddAccount(){
        //initialisation
        frmAddAccount = new Form("Add Account");
        frmAddAccount.setLayout(new BorderLayout());
        
        lblAccountDetails = new Label("Account Details");
        lblAccountName = new Label("Account Name");
        txtAccountName = new TextField();
        
        lblAmount = new Label("Default Amount");
        txtAmount = new TextField();
        
        lblHolder = new Label("Account Holder");
        String s[] = {"Select Account"};
        cbxHolder = new ComboBox(s);
        
        lblSelectType = new Label("Select Account Type");
        String[] i = {"Select","Income Account", "Expense Account"};
        cbxSelectType = new ComboBox(i);
        
        btnAddAccountDetails = new Button("Add Account");
        btnAddAccountDetails.addActionListener(this);
        
        contAddAccount = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        contAddAccount.addComponent(lblAccountDetails);
        contAddAccount.addComponent(lblAccountName);
        contAddAccount.addComponent(txtAccountName);
        contAddAccount.addComponent(lblAmount);
        contAddAccount.addComponent(txtAmount);
        contAddAccount.addComponent(lblHolder);
        contAddAccount.addComponent(cbxHolder);
        contAddAccount.addComponent(lblSelectType);
        contAddAccount.addComponent(cbxSelectType);
        contAddAccount.addComponent(btnAddAccountDetails);
        
        frmAddAccount.addComponent(BorderLayout.CENTER, contAddAccount);
        frmAddAccount.show();
        
        frmAddAccount.addCommand(new Command("Back"){
            public void actionPerformed(ActionEvent ae){
                Business();
            }
        });
    }
    
    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnLogin) {
            MainMenu();
        } else if (ae.getSource() == btnCustomers) {
            Customers();
        } else if (ae.getSource() == btnAddCustomers) {
            AddCustomer();
        } else if (ae.getSource() == btnBusiness){
            Business();
        }else if(ae.getSource() == btnAddAccount){
            AddAccount();
        }
    }
}