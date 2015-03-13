package gpsbabel;



import javax.swing.JOptionPane;

/**
 * Class execute two external program through command line. (Window$)
 * Simple biding(reference) to: *  
 * -gpsbabel - Connect GPS and create *.gpx file.
 * -gpx2shp - Convert *.gpx to *.shp.
 * 
 * @author 
 *
 */
public class CMDLineWin {

	/**
	 *  Method start gpsbabel.exe
	 *  
	 * @param gpxFile - Filename
	 * @param port - Connect serial/usb port
	 * @param type - Data type: waypoints (-w), routes (-r), tracks (-t).
	 */
	public void runGPSBabel(String gpxFile, String port, String type){
		String babelpath = "lib/gpsbabel.exe -p " + "\"\" " + type + " -i garmin -f "+ port.toLowerCase() +": -o gpx -F " + "\"" + gpxFile + "\"" + ".gpx";
		System.out.println(babelpath);
		try{  
			Process p = Runtime.getRuntime().exec(babelpath); 
			p.waitFor();
			if(p.exitValue()==0){  
				JOptionPane.showMessageDialog(null, gpxFile + " Created"); 
			}  
		}catch(Exception e){  
			JOptionPane.showMessageDialog(null, "Please verify your connection: " + e.getMessage() + 
					" Error "+ JOptionPane.ERROR_MESSAGE);
		}  
	}

	/**
	 * Method start gpx2shp
	 * 
	 * @param gpxFile - filename
	 * @param type - Data type: waypoints (-w), routes (-r), tracks (-t).
	 */
	public void runGPX2SHP(String gpxFile, String type){
		String gpx2shpPath = "lib/gpx2shp.exe " + type + " " + "\"" + gpxFile + "\"";
		try{  
			Process p = Runtime.getRuntime().exec(gpx2shpPath);  
			p.waitFor();
			if(p.exitValue()==0){  
				JOptionPane.showMessageDialog(null, gpxFile + " Shapefile Created");  
			}  
		}catch(Exception e){  
			JOptionPane.showMessageDialog(null, "Please verify your connection: " + e.getMessage() + 
					"Error"+ JOptionPane.ERROR_MESSAGE);
		}  
	}
}
