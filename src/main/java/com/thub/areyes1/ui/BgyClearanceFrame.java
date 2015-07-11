/**
 * Class File Name: BgyClearanceFrame.java
 * Author: alvinreyes
 * Date Generate: May 8, 2015
 * Description
 */

package com.thub.areyes1.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thub.areyes1.exception.BarangayClearanceServiceException;
import com.thub.areyes1.obj.BarangayClearance;
import com.thub.areyes1.service.BarangayClearanceService;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.ListSelectionModel;

/**
 * The Class BgyClearanceFrame.
 */
@Component
public class BgyClearanceFrame extends JFrame {

	/** The bgy clearance dialog. */
	@Autowired(required = true)
	private JDialog bgyClearanceDialog;

	@Autowired(required = true)
	private BarangayClearanceService barangayClearanceService;

	/** The content pane. */
	private JPanel contentPane;

	/** The table. */
	private JTable table;

	/** The text field. */
	private JTextField textField;

	/**
	 * Launch the application.
	 *
	 * @param args
	 *            the arguments
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

		table = new JTable();
		table.setBounds(787, 446, -784, -445);
		table.setCellSelectionEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setColumnSelectionAllowed(true);
		table.setVisible(true);
		// panel_1.setLayout(new Absolute);

		panel_1.setVisible(true);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(6, 6, 788, 41);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// JDialog newRegistrationDialog = new
				// BgyClearanceRegistrationDialog();
				JDialog newRegistrationDialog = bgyClearanceDialog;

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
		panel_1.setLayout(null);

		table.setPreferredSize(new Dimension(250, 250));
		JScrollPane jscrollPane = new JScrollPane(table);
		jscrollPane.setBounds(6, 6, 776, 435);
		panel_1.add(jscrollPane, BorderLayout.CENTER);

	}
	
	public void getAllBgyClearances() {

		try {

			DefaultTableModel tableModel = new DefaultTableModel() {

				@Override
				public boolean isCellEditable(int row, int column) {
					// Only the third column
					return false;
				}
			};
			
			table.addMouseListener(new MouseListener() {
				
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				public void mouseClicked(MouseEvent arg0) {
					if(arg0.getClickCount() == 2) {
			            ((BgyClearanceRegistrationDialog)bgyClearanceDialog).loadEditData(Integer.valueOf(table.getValueAt(table.getSelectedRow(), 0).toString()));
			            bgyClearanceDialog.setModal(true);
			            bgyClearanceDialog.setLocationRelativeTo(null);
			            bgyClearanceDialog.setVisible(true);
					}
					
				}
			});
			
			table.setModel(tableModel);
			tableModel.addColumn("ID");
			tableModel.addColumn("Control Number");
			tableModel.addColumn("Business Name");
			table.setShowGrid(true);
			for (BarangayClearance bgyClr : barangayClearanceService
					.getAllBarangayClearance()) {
				Vector<String> newRow = new Vector<String>();
				newRow.add(String.valueOf(bgyClr.getId()));
				newRow.add(String.valueOf(bgyClr.getControlNumber()));
				newRow.add(bgyClr.getBusinessName());
				// newRow.add(new JButton());
				tableModel.insertRow(0, newRow);
			}
			// table.setModel(tableModel);
		} catch (BarangayClearanceServiceException e) {
			e.printStackTrace();
		}
	}
}
