
package filosofoscomensales;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JTable;


public class Comedor extends Applet{
    private Interface frame;
    private String tipo;
    private int numPlatos;
    private Filosofo Fil[];
    private Tenedor Ten[];
    private int cantidad;
    public Timer timer = new Timer();
    private TimerTask actualizar;
    private JTable table = new JTable();

    public Comedor(Interface frame, JTable table) {
        this.frame = frame;
        
        Random r = new Random();
        int low = 2;
        int high = 9;
        this.cantidad = r.nextInt(high-low) + low;;
        numPlatos = 0;
        this.frame.agregarCantidad(this.cantidad);
        iniciarFilosofos();
    }
    
    
    public void dibujar(Graphics g){
        ImageIcon imagenComedor = new ImageIcon("ruta.png");
        imagenComedor.paintIcon(this.frame, this.frame.getGraphics(), 0, 0);
        for (int i = 0; i < this.cantidad; i++) {
            Ten[i].getImagen().paintIcon(this.frame,this.frame.getGraphics(),Ten[i].getCoordenadas()[0],Ten[i].getCoordenadas()[1]);
            Fil[i].getImagenFil().paintIcon(this.frame,this.frame.getGraphics(),Fil[i].getCoordFil()[0],Fil[i].getCoordFil()[1]);
            Fil[i].getImagenEstado().paintIcon(this.frame,this.frame.getGraphics(),Fil[i].getCoordEstado()[0],Fil[i].getCoordEstado()[1]);
        }
        
        
    }
    
    public void actualizar(){
        this.actualizar = new TimerTask(){       
            @Override
            public void run(){
                act();
            }
        };
        timer.scheduleAtFixedRate(actualizar, 0, 800);
    }
    
    
    public void act(){
        this.frame.getGraphics().clearRect(0, 0, 300, 300);
        ImageIcon imagenComedor = new ImageIcon("ruta.png");
        imagenComedor.paintIcon(this.frame, this.frame.getGraphics(), 0, 0);
        frame.modificarTabla(this);
              
    }
    
    private void iniciarFilosofos(){
        Ten = new Tenedor[this.cantidad];
        for (int i = 0; i < this.cantidad; i++) {
            Ten[i] = new Tenedor(i);
            //INSERTAR COORDENADAS DE TENEDORES(SEGUNDO 25 DEL VIDEO)
        }
        
        Fil = new Filosofo[this.cantidad];
        for (int i = 0; i < this.cantidad; i++) {
            if(i == this.cantidad-1) Fil[i] = new Filosofo(i,"nombre "+i,Ten[i],Ten[0]);
            else Fil[i] = new Filosofo(i, "nombre "+i, Ten[i], Ten[i+1]);
            //INSERTAR COORDENADAS DE FILOSOFOS (SEGUNDO 25 DEL VIDEO)
        }
    }
    
    
    public void iniciarSimulacion(){
        for (int i = 0; i < this.cantidad; i++) {
            Fil[i].start();          
        }
    }
    
    public void pausarSimulacion() throws InterruptedException {
        for(int i=0;i<this.cantidad;i++)
            Fil[i].suspend();
    }
    
    public void reanudarSimulacion (){
        for (int i = 0; i < this.cantidad; i++) {
            Fil[i].resume();
        }
    }
    
    public int totalPlatos(){
        this.numPlatos = 0;
        for (int i = 0; i < this.cantidad; i++) {
            numPlatos = numPlatos + Fil[i].getPlatos(); 
        }
        return numPlatos;      
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumPlatos() {
        return numPlatos;
    }

    public void setNumPlatos(int numPlatos) {
        this.numPlatos = numPlatos;
    }

    public Filosofo[] getFil() {
        return Fil;
    }
    
    
    
    
    
    
    
}
    
    
   
    
    
    
    
    
    
    
    
    
    
  
            
