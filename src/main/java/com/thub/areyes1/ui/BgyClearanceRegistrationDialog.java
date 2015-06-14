/**
 * Class File Name: BgyClearanceRegistrationDialog.java
 * Author: alvinreyes
 * Date Generate: May 8, 2015
 * Description
 */

package com.thub.areyes1.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import org.springframework.beans.factory.annotation.Autowired;

import com.thub.areyes1.obj.BarangayClearance;
import com.thub.areyes1.service.BarangayClearanceService;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.acl.Owner;

public class BgyClearanceRegistrationDialog extends JDialog {

	//	Services
	@Autowired
	private BarangayClearanceService barangayClearanceService;
	
	private BarangayClearance barangayClearance =new BarangayClearance();
	private final JPanel contentPanel = new JPanel();
	private JTextField businessNameTxt;
	private JTextField addressTxt;
	private JTextField typeOfActivityTxt;
	private JTextField capitalizationTxt;
	private JTextField managerOperatorTxt;
	private JTextField controlNumberTxt;
	private JTextField applicantMemberOfTxt;
	private JTextField assocHomeOwnerTxt;
	private JTextField amountPaid;
	private JTextField orNumber;
	private JTextField secondEndNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BgyClearanceRegistrationDialog dialog = new BgyClearanceRegistrationDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BgyClearanceRegistrationDialog() {
		setBounds(100, 100, 823, 662);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 811, 589);
		contentPanel.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Registration", null, panel, null);
		panel.setLayout(null);
		
		JRadioButton rdbtnNew = new JRadioButton("New");
		rdbtnNew.setBounds(6, 6, 94, 23);
		panel.add(rdbtnNew);
		
		JRadioButton rdbtnRenewal = new JRadioButton("Renewal");
		rdbtnRenewal.setBounds(83, 6, 94, 23);
		panel.add(rdbtnRenewal);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNew);
		buttonGroup.add(rdbtnRenewal);
		
		controlNumberTxt = new JTextField();
		controlNumberTxt.setBounds(124, 40, 134, 28);
		panel.add(controlNumberTxt);
		controlNumberTxt.setColumns(10);
		
		JLabel lblBusinessName = new JLabel("Business Name:");
		lblBusinessName.setBounds(16, 86, 104, 16);
		panel.add(lblBusinessName);
		
		businessNameTxt = new JTextField();
		businessNameTxt.setBounds(124, 80, 660, 28);
		panel.add(businessNameTxt);
		businessNameTxt.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(16, 120, 104, 16);
		panel.add(lblAddress);
		
		addressTxt = new JTextField();
		addressTxt.setBounds(124, 114, 660, 28);
		panel.add(addressTxt);
		addressTxt.setColumns(10);
		
		JLabel lblTypeOfActivity = new JLabel("Type of Activity:");
		lblTypeOfActivity.setBounds(16, 157, 104, 16);
		panel.add(lblTypeOfActivity);
		
		typeOfActivityTxt = new JTextField();
		typeOfActivityTxt.setBounds(124, 151, 660, 28);
		panel.add(typeOfActivityTxt);
		typeOfActivityTxt.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Owned");
		chckbxNewCheckBox.setBounds(124, 191, 128, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Rented");
		chckbxNewCheckBox_1.setBounds(264, 191, 128, 23);
		panel.add(chckbxNewCheckBox_1);
		
		capitalizationTxt = new JTextField();
		capitalizationTxt.setBounds(124, 232, 660, 28);
		panel.add(capitalizationTxt);
		capitalizationTxt.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Corportation");
		chckbxNewCheckBox_2.setBounds(124, 272, 128, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Single Proprietorship");
		chckbxNewCheckBox_3.setBounds(124, 295, 186, 23);
		panel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Partnership");
		chckbxNewCheckBox_4.setBounds(124, 318, 128, 23);
		panel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Others");
		chckbxNewCheckBox_5.setBounds(124, 341, 128, 23);
		panel.add(chckbxNewCheckBox_5);
		
		managerOperatorTxt = new JTextField();
		managerOperatorTxt.setBounds(16, 416, 503, 28);
		panel.add(managerOperatorTxt);
		managerOperatorTxt.setColumns(10);
		
		JLabel lblControlNumber = new JLabel("Control No.");
		lblControlNumber.setBounds(16, 46, 96, 16);
		panel.add(lblControlNumber);
		
		JLabel lblCapitalization = new JLabel("Capitalization:");
		lblCapitalization.setBounds(16, 238, 94, 16);
		panel.add(lblCapitalization);
		
		JLabel lblManagerOperator = new JLabel("Manager / Operator");
		lblManagerOperator.setBounds(16, 392, 123, 16);
		panel.add(lblManagerOperator);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Endorsment", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(6, 6, 778, 111);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAssociationHomeowners = new JLabel("Association / Homeowner's President");
		lblAssociationHomeowners.setBounds(6, 43, 253, 16);
		panel_2.add(lblAssociationHomeowners);
		
		JLabel lblApplicantIsA = new JLabel("Applicant is a member of:");
		lblApplicantIsA.setBounds(6, 12, 173, 16);
		panel_2.add(lblApplicantIsA);
		
		applicantMemberOfTxt = new JTextField();
		applicantMemberOfTxt.setBounds(177, 6, 583, 28);
		panel_2.add(applicantMemberOfTxt);
		applicantMemberOfTxt.setColumns(10);
		
		assocHomeOwnerTxt = new JTextField();
		assocHomeOwnerTxt.setBounds(6, 66, 754, 28);
		panel_2.add(assocHomeOwnerTxt);
		assocHomeOwnerTxt.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(6, 127, 778, 121);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNo = new JLabel("NO:");
		lblNo.setBounds(55, 6, 31, 16);
		panel_3.add(lblNo);
		
		JLabel lblOrNo = new JLabel("OR. No.");
		lblOrNo.setBounds(33, 49, 53, 16);
		panel_3.add(lblOrNo);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid");
		lblAmountPaid.setBounds(6, 89, 80, 16);
		panel_3.add(lblAmountPaid);
		
		amountPaid = new JTextField();
		amountPaid.setBounds(94, 83, 366, 28);
		panel_3.add(amountPaid);
		amountPaid.setColumns(10);
		
		orNumber = new JTextField();
		orNumber.setBounds(94, 43, 366, 28);
		panel_3.add(orNumber);
		orNumber.setColumns(10);
		
		secondEndNo = new JTextField();
		secondEndNo.setBounds(94, 0, 366, 28);
		panel_3.add(secondEndNo);
		secondEndNo.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Save and Generate Report");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//	Validation first.
						validateForm();
						
						//	Then we put it on the clearance object.
						barangayClearance.setBusinessName(businessNameTxt.getText());
						barangayClearance.setCapitalization(capitalizationTxt.getText());
						barangayClearance.setAssocHomeOwnerPresident(assocHomeOwnerTxt.getText());
						barangayClearance.setApplicantMemberOf(applicantMemberOfTxt.getText());
						barangayClearance.setAmountPaid(Float.valueOf(amountPaid.getText()));
						barangayClearance.setAddress(addressTxt.getText());
						
						
						//	Save and generate the report.
						
						//	Generate the report
						
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private String validateForm() {
		
		return "";
		
	}
}
