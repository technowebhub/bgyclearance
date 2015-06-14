/**
 * Class File Name: BarangayClearanceMain.java
 * Author: alvinreyes
 * Date Generate: Jun 7, 2015
 * Description
 */

package com.thub.areyes1.main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import net.sf.jasperreports.engine.JRDataSource;
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
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thub.areyes1.ui.BgyClearanceFrame;

@Configurable
@ComponentScan("com.thub.areyes1.*")
public class BarangayClearanceMain {

	/**
	 * The main BarangayClearanceMain constructor
	 */
	public BarangayClearanceMain() {
		
		try {
			FileInputStream fis = new FileInputStream("/Users/alvinreyes/report1.jasper");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
            
            List<Map<String,?>> maps = new ArrayList<Map<String, ?>> ();
            for (int i = 0; i < 10; i++) {
                Map<String,Object> map = new HashMap<String, Object>();
                map.put("SAMPLE1", "1212");
                map.put("address", "1212");
                maps.add(map);
            }           
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("SAMPLE1", "1212");
            map.put("address", "1212");
            maps.add(map);
            
            
            JRMapCollectionDataSource dataSource = new JRMapCollectionDataSource(maps);
            
		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(bufferedInputStream);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map,dataSource);
		JasperViewer.viewReport(jasperPrint, false);
		      JFrame frame = new JFrame("Report");
		      frame.getContentPane().add(new JRViewer(jasperPrint));
		      frame.pack();
		      frame.setVisible(true);
		      
		}catch(Exception e) {e.printStackTrace();}
		
		
		
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
		
		//ApplicationContext appContext = 
		    	  //new ClassPathXmlApplicationContext("classpath:*/appContext.xml");
		
		JRDataSource j = null;
		String sourceFileName =
		         "/Users/alvinreyes/report1.jasper";
		      
		Map parameters = new HashMap();
		parameters.put("id", 42);
		
		
		      
		
		//	We then setup the look and feel.
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
