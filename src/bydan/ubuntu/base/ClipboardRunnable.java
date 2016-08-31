package bydan.ubuntu.base;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ClipboardRunnable implements Runnable {
	public String sDatos="";
	
	public ClipboardRunnable() {
		this.sDatos="";
    }

	public ClipboardRunnable(String sDatos) {
		this.sDatos=sDatos;
    }
	
	@Override
    public void run() {
    	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		StringSelection stringSelection = new StringSelection(this.sDatos);
		
		clipboard.setContents(stringSelection, stringSelection);
    }
}
