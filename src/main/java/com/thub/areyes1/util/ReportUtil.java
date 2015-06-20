/**
 * Class File Name: ReportUtil.java
 * Author: alvinreyes
 * Date Generate: Jun 15, 2015
 * Description
 */

package com.thub.areyes1.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import com.thub.areyes1.obj.BarangayClearance;

import static com.thub.areyes1.util.ReportConstants.*;

/**
 * This class is the utility class to generate jasper reports.
 * @author alvinreyes
 *
 */
public class ReportUtil {
	
	
	/**
	 * This method is used to call the generate the report and initialize the report viewer.
	 * @param bgyClearance
	 */
	public static void generateReport(BarangayClearance bgyClearance) {
		
		try {
			//	Get the compiled report.
			FileInputStream fis = new FileInputStream(ReportUtil.class.getResource(CONST_REPORT_LOCATION + CONST_CLEARANCE_REP).getFile());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
            
            //	Put up the parameters
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("SAMPLE1", "SAMPLE1");
            map.put("SAMPLE2", "SAMPLE2");
            
            //	Load the jasper reports and fill it up with the parameters.
			JasperReport jasperReport = (JasperReport) JRLoader.loadObject(bufferedInputStream);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map);
			JasperViewer.viewReport(jasperPrint, false);
		      
		}catch(Exception e) {e.printStackTrace();}
		
	}
	
	/**
	 * This method is used to generate the jasper print report object only.
	 * The jasper print report object can be embedded on the swing component.
	 * 
	 * example:
	 *  JFrame frame = new JFrame("Report");
	 *	frame.getContentPane().add(new JRViewer(jasperPrint));
	 *  frame.pack();
	 *	frame.setVisible(true);
	 *
	 * @param bgyClearance
	 * @return
	 */
	public static JasperPrint generateJasperPrintReport(BarangayClearance bgyClearance) {
		
		try {
			FileInputStream fis = new FileInputStream(ReportUtil.class.getResource(CONST_REPORT_LOCATION + CONST_CLEARANCE_REP).getFile());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
            
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("SAMPLE1", "1212");
            map.put("address", "1212");
			JasperReport jasperReport = (JasperReport) JRLoader.loadObject(bufferedInputStream);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, new JREmptyDataSource());
			
			return jasperPrint;
		      
		}catch(Exception e) {e.printStackTrace(); return null;}
		
	}

}
