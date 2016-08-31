package bydan.ubuntu.base;

public class Constantes {
	public static String USUARIO="bydan";
	public static String SUDO_CLAVE="sudo < jfm5jfm5 ;";
	public static String GKSUDO="gksudo ";	
	public static String GKSUDO_PIPE="gksudo | ";
	public static String GKSUDO_MENSAJE="gksudo -m '111' -p | ";
	
	//GENERALMENTE SIEMPRE true	
	public static Boolean CON_BASH=true;
	
	//SIEMPRE DEBE ESTAR false, CUANDO CARGA SE PONE true,SE CAMBIA SOLO 1 VEZ
	public static Boolean CONFIG_LOAD=false;
		
	
	
	//CONFIGURABLES
	
	//GENERALMENTE SIEMPRE true, A MENOS QUE SE QUIERA SOLO EN ARCHIVO, TEXTO O TITULO DE PANTALLA
	public static Boolean CON_EJECUTAR_BASH=true;
	
	//GENERALMENTE false, SI SE NECESITA SE PONE true, GENERA LOG DE COMANDOS
	public static Boolean CON_COMANDO_ARCHIVO=false;
	
	//GENERALMENTE false, SI SE NECESITA SE PONE true, GENERA LOG DE COMANDOS
	public static Boolean CON_RESULTADO_COMANDO_ARCHIVO=false;			
		
	//GENERALMENTE false,Primero Mint
	public static Boolean UBUNTU=false;	
}
