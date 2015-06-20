/**
 * Class File Name: BarangayClearanceMain.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.config.java.context.JavaConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thub.areyes1.ui.BgyClearanceFrame;

public class BarangayClearanceMain {

	/**
	 * The main BarangayClearanceMain constructor
	 */
	public BarangayClearanceMain() {
		
		JFrame bgyClearanceFrame = new BgyClearanceFrame();
		bgyClearanceFrame.setLocationByPlatform(true);
		bgyClearanceFrame.setLocationRelativeTo(null);
		bgyClearanceFrame.setVisible(true);
		
	}
	
	/**
	 * This is the main class
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(
		            UIManager.getSystemLookAndFeelClassName());
			}catch(UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}catch(ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
			}catch(IllegalAccessException iae) {
				iae.printStackTrace();
			}catch(InstantiationException ie) {
				ie.printStackTrace();
			}
		
		new BarangayClearanceMain();
	}
}
