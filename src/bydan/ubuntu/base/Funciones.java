package bydan.ubuntu.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Funciones {

	public static void RegistrarArchivoComando(String sComando){
		try
		{
			//String sPath=Funciones.class.getResource("").getPath();
			String sPath  = System.getenv("HOME")+"/comandos_log";;
			
			File fileFolder = new File(sPath);
		
			fileFolder.mkdirs();
			
		    String sFileName= sPath + "/comandos_linux_log.txt";
		   
		    System.out.println(sFileName);
		    
		    FileWriter fileWriter = new FileWriter(sFileName,true);
		    
		    fileWriter.write(sComando+"\n");
		   
		    fileWriter.close();
		}
		catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
	}
	
	public static String RegistrarArchivoResultadoComando(String sComando){
		String sComandoModificado=sComando;
		
		try
		{
			
			//String sPath=Funciones.class.getResource("").getPath();
			String sPath  = System.getenv("HOME")+"/comandos_resultados";
			
			File fileFolder = new File(sPath);
			
			fileFolder.mkdirs();
			
			String sFileName=  sPath+ "/" + GetNombreArchivoResultadoComando();//sPath + "/comandos_linux_log.txt";
			   
		    System.out.println(sFileName);
			
		    sComandoModificado=sComandoModificado + " >> " + sFileName;
		    
		    /*		    		    
		    FileWriter fileWriter = new FileWriter(sFileName,true);
		    
		    fileWriter.write(sComando+"\n");
		   
		    fileWriter.close();
		    */
		    		   
		}
		catch(Exception ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
		
		 return sComandoModificado;
	}
	
	public static String GetNombreArchivoResultadoComando() {
		String sNombreArchivo="";
		
		Date date=new Date(); 
		
	    Calendar cal = Calendar.getInstance();
	    
	    cal.setTime(date);
	    
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    
	    
	    int hour = cal.get(Calendar.HOUR_OF_DAY);
	    int minute = cal.get(Calendar.MINUTE);
	    int second = cal.get(Calendar.SECOND);
	    int millis = cal.get(Calendar.MILLISECOND);
	    
	    sNombreArchivo=""+year+"_"+month+"_"+day+"___"+hour+"_"+minute+"_"+second+"_"+millis+".txt";
	    	
	    return sNombreArchivo;
	}
	
	public static Boolean PermiteArchivoResultadoComando(String sComando){
		Boolean permite=true;
		
		if(sComando.contains("adduser")) {
			permite=false;
		}
		
		return permite;
	}
	
	public static void CargarConfiguracion() throws IOException {
		InputStream inputStream;
		
		Properties properties = new Properties();
		String sFileName = "config.properties";

		inputStream = Comando.class.getResourceAsStream(sFileName);

		if(!Constantes.CONFIG_LOAD) {
			if (inputStream != null) {
				properties.load(inputStream);
									
				String sCON_EJECUTAR_BASH = properties.getProperty("CON_EJECUTAR_BASH");
				
				
				if(sCON_EJECUTAR_BASH.equals("true")) {
					Constantes.CON_EJECUTAR_BASH=true;
					
				} else {
					Constantes.CON_EJECUTAR_BASH=false;
				}
				
				
				String sCON_COMANDO_ARCHIVO = properties.getProperty("CON_COMANDO_ARCHIVO");
				
				if(sCON_COMANDO_ARCHIVO.equals("true")) {
					Constantes.CON_COMANDO_ARCHIVO=true;
					
				} else {
					Constantes.CON_COMANDO_ARCHIVO=false;
				}
				
				
				String sCON_RESULTADO_COMANDO_ARCHIVO = properties.getProperty("CON_RESULTADO_COMANDO_ARCHIVO");
				
				if(sCON_RESULTADO_COMANDO_ARCHIVO.equals("true")) {
					Constantes.CON_RESULTADO_COMANDO_ARCHIVO=true;
					
				} else {
					Constantes.CON_RESULTADO_COMANDO_ARCHIVO=false;
				}
				
				
				String sUBUNTU = properties.getProperty("UBUNTU");
				
				if(sUBUNTU.equals("true")) {
					Constantes.UBUNTU=true;
					
				} else {
					Constantes.UBUNTU=false;
				}
				
			} else {
				throw new FileNotFoundException("Archivo de Propiedades '" + sFileName + "' no encontrado");
			}
			
			Constantes.CONFIG_LOAD=true;
		}				
	}
}
