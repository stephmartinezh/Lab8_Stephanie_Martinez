
package lab8_stephaniemartinez;

import javax.swing.JProgressBar;


public class adminTiempo extends Thread{
     private JProgressBar progBar;
    private boolean avanzar;
    private boolean vive;

    public adminTiempo(JProgressBar progBar) {
        this.progBar = progBar;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar.setValue(progBar.getValue() + 1);
                progBar.setString(Integer.toString(progBar.getValue()) + " Mínutos");

            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }
}
