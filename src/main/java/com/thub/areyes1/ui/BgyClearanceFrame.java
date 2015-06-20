/**
 * Class File Name: BgyClearanceFrame.java
 * Author: alvinreyes
 * Date Generate: May 8, 2015
 * Description
 */

package com.thub.areyes1.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.GridBagLayout;


public class BgyClearanceFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BgyClearanceFrame frame = new BgyClearanceFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BgyClearanceFrame() {
		setTitle("Barangay Business Clearance Registartion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 450, 800, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 52, 788, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(113, 6, 540, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblBusinessName = new JLabel("Business Name");
		lblBusinessName.setBounds(6, 12, 95, 16);
		panel.add(lblBusinessName);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(665, 7, 117, 29);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(6, 105, 788, 447);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(787, 446, -784, -440);
		panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(6, 6, 788, 41);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JDialog newRegistrationDialog = new BgyClearanceRegistrationDialog();
				newRegistrationDialog.setModal(true);
				newRegistrationDialog.setLocationRelativeTo(null);
				newRegistrationDialog.setVisible(true);
			}
		});
		btnNew.setBounds(6, 6, 117, 29);
		panel_2.add(btnNew);
		
		JButton btnGenerateReport = new JButton("Change Bgy Configuration");
		btnGenerateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGenerateReport.setBounds(581, 6, 201, 29);
		panel_2.add(btnGenerateReport);
	}
}
