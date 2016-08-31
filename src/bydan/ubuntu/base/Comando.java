package bydan.ubuntu.base;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Comando {
	
	
	public static void executeCommandApplication(String command, JFrame jframe) {
		//Process process;		
			try {
				String sSudoInstall="sudo apt-get install ";
				
				jframe.setTitle(sSudoInstall+command);
				
				Comando.executeCommand(command);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void RegistrarArchivo(String sComando) {
		if(Constantes.CON_COMANDO_ARCHIVO) {
			Funciones.RegistrarArchivoComando(sComando);
		}
	}
	
	public static String RegistrarArchivoResultado(String sComando) {
		String sComandoModificado = sComando;
		
		if(Constantes.CON_RESULTADO_COMANDO_ARCHIVO) {
			if(Funciones.PermiteArchivoResultadoComando(sComando)) {
				sComandoModificado=Funciones.RegistrarArchivoResultadoComando(sComando);
			}
		}
		
		return sComandoModificado;
	}
	
	public static void executeCommand(String command, JFrame jframe) {
		try {
			
			Comando.executeCommand(command,"",jframe);				
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void executeCommand(String command,String sPathBase, JFrame jframe) {
		try {			
			jframe.setTitle(command);
												
			Comando.executeCommand(command,sPathBase);				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void executeCommand(String command) {
		executeCommand(command,"");
	}
	
	public static void executeCommand(String command,String sPathBase) {
		Process process=null;
		File dirActual=null;
		
		try {
			System.out.println("Comando: "+command);
					
			Comando.RegistrarArchivo(command);
			
			command=Comando.RegistrarArchivoResultado(command);
			
			if(!sPathBase.equals("")) {
				dirActual = new File(sPathBase);
			}
			
			if(Constantes.CON_EJECUTAR_BASH) {
				if(Constantes.CON_BASH) {
					if(sPathBase.equals("")) {
						process = Runtime.getRuntime().exec(new String[]{"bash","-c",command});
					
					} else {
						process = Runtime.getRuntime().exec(new String[]{"bash","-c",command},null,dirActual);
					}
					
				} else {
					if(sPathBase.equals("")) {			
						process = Runtime.getRuntime().exec(command);
						
					} else {
						process = Runtime.getRuntime().exec(command,null,dirActual);
					}
				}
			}
			//process.waitFor();			
			//BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        // writer.write("jfm5jfm5");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void executeCommands(String[] commands,String sComandoMostrar,String sPathBase) {
		Process process=null;
		File dirActual=null;
		
		try {
			System.out.println("Comando: "+sComandoMostrar);
					
			Comando.RegistrarArchivo(sComandoMostrar);
			
			sComandoMostrar=Comando.RegistrarArchivoResultado(sComandoMostrar);
			
			if(!sPathBase.equals("")) {
				dirActual = new File(sPathBase);
			}
			
			if(Constantes.CON_EJECUTAR_BASH) {
				if(Constantes.CON_BASH) {
					if(sPathBase.equals("")) {
						process = Runtime.getRuntime().exec(commands);
					
					} else {
						process = Runtime.getRuntime().exec(commands,null,dirActual);
					}
					
				} else {
					if(sPathBase.equals("")) {			
						process = Runtime.getRuntime().exec(commands);
						
					} else {
						process = Runtime.getRuntime().exec(commands,null,dirActual);
					}
				}
			}
			//process.waitFor();			
			//BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
	        // writer.write("jfm5jfm5");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void executeCommandGkSudo(String command, JFrame jframe) {
		try {			
			jframe.setTitle(command);
						
			Comando.executeCommandGkSudo(command);				
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void executeCommandGkSudo(String command) {
		executeCommandGkSudo(command,"");
	}
	
	public static void executeCommandGkSudo(String command,String sPathBase) {
		Process process=null;
		File dirActual=null;
		
		try {
			System.out.println("Comando: "+command);
			
			Comando.RegistrarArchivo(command);
			
			command=Comando.RegistrarArchivoResultado(command);
			
			if(!sPathBase.equals("")) {
				dirActual = new File(sPathBase);
			}
			
			//process = Runtime.getRuntime().exec(command);			
			//process = Runtime.getRuntime().exec(new String[]{"gksudo",command});
			
			if(Constantes.CON_EJECUTAR_BASH) {
				if(Constantes.CON_BASH) {
					if(sPathBase.equals("")) {
						process = Runtime.getRuntime().exec(new String[]{"bash","-c","gksudo " + command});
					
					} else {
						process = Runtime.getRuntime().exec(new String[]{"bash","-c","gksudo " + command},null,dirActual);
					}
				} else {
								
					if(sPathBase.equals("")) {			
						process = Runtime.getRuntime().exec("gksudo" + command);
						
					} else {
						process = Runtime.getRuntime().exec("gksudo" + command,null,dirActual);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String executeCommandWithReturn(String command,JFrame jFrame) {
		String sReturn="";
		
		sReturn=Comando.executeCommandWithReturn(command,"",jFrame);
		
		return sReturn;
	}
	
	public static String executeCommandWithReturn(String command,String sPathBase,JFrame jFrame) {
		String sReturn="";
		
		if(true) {
			jFrame.setTitle(command);
		}
		
		sReturn=Comando.executeCommandWithReturn(command,sPathBase,true);
		
		return sReturn;
	}
	
	public static String executeCommandWithReturn(String command,JFrame jFrame,Boolean conMostrarComando) {
		String sReturn="";
		
		sReturn=Comando.executeCommandWithReturn(command,"",jFrame,conMostrarComando);
		
		return sReturn;
	}
	
	public static String executeCommandWithReturn(String command,String sPathBase,JFrame jFrame,Boolean conMostrarComando) {
		String sReturn="";
		
		if(conMostrarComando) {
			jFrame.setTitle(command);
		}
		
		sReturn=Comando.executeCommandWithReturn(command,sPathBase,conMostrarComando);
		
		return sReturn;
	}
	
	public static String executeCommandWithReturn(String command,Boolean conMostrarComando) {
		String sReturn="";
		
		sReturn=Comando.executeCommandWithReturn(command,"",conMostrarComando);
		
		return sReturn;
	}
	
	public static String executeCommandWithReturn(String command,String sPathBase,Boolean conMostrarComando) {
		StringBuffer stringBuffer = new StringBuffer();

		Process process=null;
		File dirActual=null;
		
		try {
			
			if(conMostrarComando) {
				System.out.println(command);
			}
			
			Comando.RegistrarArchivo(command);
			
			command=Comando.RegistrarArchivoResultado(command);
			
			if(!sPathBase.equals("")) {
				dirActual = new File(sPathBase);
			}
			
			if(Constantes.CON_EJECUTAR_BASH) {
				if(Constantes.CON_BASH) {
					if(sPathBase.equals("")) {
						process = Runtime.getRuntime().exec(new String[]{"bash","-c",command}); //NO VALIO "gksudo"
					} else {
						process = Runtime.getRuntime().exec(new String[]{"bash","-c",command},null,dirActual);
					}
					
				} else {
					if(sPathBase.equals("")) {
						process = Runtime.getRuntime().exec(command);
						
					} else {
						process = Runtime.getRuntime().exec(command,null,dirActual);
					}
				}
				
				
				process.waitFor();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

	            String line = "";	
	            
				while ((line = reader.readLine())!= null) {
					stringBuffer.append(line + "\n");
				}
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stringBuffer.toString();
	}
	
	public static void imprimirComando(String sComando, String sParametros) {
		System.out.println(sComando + " " + sParametros);
	}	
			
	//COMMANDS	
	public static String executeCommandsWithReturn(String[] commands,String sComandoMostrar,String sPathActual,JFrame jFrame) {
		String sReturn="";
		
		if(true) {
			jFrame.setTitle(sComandoMostrar);
		}
		
		sReturn=Comando.executeCommandsWithReturn(commands,sComandoMostrar,sPathActual,true);
		
		return sReturn;
	}
	
	public static String executeCommandsWithReturn(String[] commands,String sComandoMostrar,String sPathActual,JFrame jFrame,Boolean conMostrarComando) {
		String sReturn="";
		
		if(conMostrarComando) {
			jFrame.setTitle(sComandoMostrar);
		}
		
		sReturn=Comando.executeCommandsWithReturn(commands,sComandoMostrar,sPathActual,conMostrarComando);
		
		return sReturn;
	}
	
	public static String executeCommandsWithReturn(String[] commands,String sComandoMostrar,String sPathActual,Boolean conMostrarComando) {
		StringBuffer stringBuffer = new StringBuffer();
		File dirActual = null;
		Process process=null;
		
		try {
			
			if(!sPathActual.equals("")) {
				dirActual = new File(sPathActual);
			}
						
			if(conMostrarComando) {
				System.out.println(sComandoMostrar);
			}
			
			Comando.RegistrarArchivo(sComandoMostrar);
			
			sComandoMostrar=Comando.RegistrarArchivoResultado(sComandoMostrar);
			
			if(Constantes.CON_EJECUTAR_BASH) {
				if(Constantes.CON_BASH) {
					if(sPathActual.equals("")) {
						process = Runtime.getRuntime().exec(commands);
					
					} else {
						process = Runtime.getRuntime().exec(commands,null,dirActual);
					}
					
				} else {
					//process = Runtime.getRuntime().exec(command);
					
					if(sPathActual.equals("")) {
						process = Runtime.getRuntime().exec(commands);
						
					} else {
						process = Runtime.getRuntime().exec(commands,null,dirActual);
					}
				}
				
				
				process.waitFor();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

	            String line = "";	
	            
				while ((line = reader.readLine())!= null) {
					stringBuffer.append(line + "\n");
				}
			}						
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stringBuffer.toString();
	}
		
	//PORTAPAPELES	
	public static void GuardarPortaPapeles(String sDatos) {
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		StringSelection stringSelection = new StringSelection(sDatos);
		
		clipboard.setContents(stringSelection, stringSelection);
	}
	
	//NO FUNCIONO bash
	/*
	public static String[] BuildCommands(String sTipo,String sPathBase,String sComando) {
		ArrayList<String> arrComandos=new ArrayList<String>();
		
		if(sTipo.equals("COMANDO_CON_PATH_BASE")) {
			//BASH
			//arrComandos.add("sh ");
			
			arrComandos.add("bash ");
			arrComandos.add("-c");
			
			//PATH ACTUAL
			//arrComandos.add("cd "+sPathBase);
			
			//COMANDO GENERAL
			arrComandos.add(sComando);
		}
		
		String[] arrReturn = arrComandos.toArray(new String[0]);
		
		return arrReturn;
		
		//return (String[]) arrComandos.toArray();
	}
	*/	
}
