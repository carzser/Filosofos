
package filosofoscomensales;

import java.applet.Applet;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
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
    //private JTable table = new JTable();

    public Comedor(Interface frame, JTable table) {
        this.frame = frame;
        
        Random r = new Random();
        int low = 3;
        int high = 10;
        this.cantidad = r.nextInt(high-low) + low;;
        numPlatos = 0;
        this.frame.agregarCantidad(this.cantidad);
        iniciarFilosofos();
    }
    
    /*@Override
    public void paint(Graphics g){
        //ImageIcon imagenComedor = new ImageIcon("ruta.png");
        //imagenComedor.paintIcon(this.frame, this.frame.getGraphics(), 0, 0);
        for (int i = 0; i < this.cantidad; i++) {
            Ten[i].getImagen().paintIcon(this.frame,this.frame.getGraphics(),Ten[i].getCoordenadas()[0],Ten[i].getCoordenadas()[1]);
            Fil[i].getImagenFil().paintIcon(this.frame,this.frame.getGraphics(),Fil[i].getCoordFil()[0],Fil[i].getCoordFil()[1]);
            Fil[i].getImagenEstado().paintIcon(this.frame,this.frame.getGraphics(),Fil[i].getCoordEstado()[0],Fil[i].getCoordEstado()[1]);
        }
        
        
    }*/
    
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
        this.frame.getGraphics().clearRect(400,0, 700, 700);
        //ImageIcon imagenComedor = new ImageIcon("ruta.png");
        //imagenComedor.paintIcon(this.frame, this.frame.getGraphics(), 0, 0);
        frame.modificarTabla(this);
        
        ImageIcon comedor = new ImageIcon("Circulo.png");
        comedor.paintIcon(this.frame,this.frame.getGraphics(),490,156);
        
        
        for(int i=0;i<this.cantidad;i++){
            
            if(Ten[i].getEstado() == true){
               Ten[i].getImagen().paintIcon(this.frame, this.frame.getGraphics(),Ten[i].getCoordenadas()[0],Ten[i].getCoordenadas()[1]);
           
            }
            
        }
       

            
        
        /*for (int i = 0; i < this.cantidad; i++) {
            Ten[i].getImagen().paintIcon(this.frame,this.frame.getGraphics(),Ten[i].getCoordenadas()[0],Ten[i].getCoordenadas()[1]);
            Fil[i].getImagenFil().paintIcon(this.frame,this.frame.getGraphics(),Fil[i].getCoordFil()[0],Fil[i].getCoordFil()[1]);
            Fil[i].getImagenEstado().paintIcon(this.frame,this.frame.getGraphics(),Fil[i].getCoordEstado()[0],Fil[i].getCoordEstado()[1]);
        }*/
        int contInanicion = 0;
        for (int i = 0; i < this.cantidad; i++) {
            Fil[i].getImagenFil().paintIcon(this.frame,this.frame.getGraphics(),Fil[i].getCoordFil()[0],Fil[i].getCoordFil()[1]);
            Fil[i].getImagenEstado().paintIcon(this.frame,this.frame.getGraphics(),Fil[i].getCoordEstado()[0],Fil[i].getCoordEstado()[1]);
            if(Fil[i].getEstado().equals("Comiendo")){
            Fil[i].getImagenComida().paintIcon(this.frame,this.frame.getGraphics(),Fil[i].getCoordComida()[0],Fil[i].getCoordComida()[1]);
            }else{
                ImageIcon plato = new ImageIcon("plato.png");
                plato.paintIcon(this.frame, this.frame.getGraphics(), Fil[i].getCoordComida()[0],Fil[i].getCoordComida()[1]);
            }
            
            if(Fil[i].getTenDerecha().getEstado() == false) contInanicion++;
        }
        
        //if(contInanicion == this.cantidad) this.frame.displayInanicion();
    }
    
    private void iniciarFilosofos(){
        Ten = new Tenedor[this.cantidad];
        for (int i = 0; i < this.cantidad; i++) {
            Ten[i] = new Tenedor(i);
            Ten[i].setImagen(new ImageIcon("Ten"+(i+1)+".png"));
            int [] coordenadas;
            
            
            if(i == 0){
                coordenadas = new int[]{610,175};
               
                Ten[i].setCoordenadas(coordenadas);
                 
            }else if(i ==1){
                
                coordenadas = new int[]{707,195};
                
                Ten[i].setCoordenadas(coordenadas);
                
            }else if(i == 2){
                
                coordenadas = new int[]{760,258};
                
                Ten[i].setCoordenadas(coordenadas);
                
            }else if(i == 3){
                
                coordenadas = new int[]{758,340};
                
                Ten[i].setCoordenadas(coordenadas);
                
            }else if(i == 4){
                
                coordenadas = new int[]{718,388};
                
                Ten[i].setCoordenadas(coordenadas);
                
            }else if(i == 5){
                
                coordenadas = new int[]{655,426};
                
                Ten[i].setCoordenadas(coordenadas);
                
            }else if(i == 6){
                
                coordenadas = new int[]{576,418};
               
                Ten[i].setCoordenadas(coordenadas);
                
            }else if(i == 7){
                
                coordenadas = new int[]{532,388};
               
                Ten[i].setCoordenadas(coordenadas);
                
            }else if(i == 8){
                
                coordenadas = new int[]{504,310};
               
                Ten[i].setCoordenadas(coordenadas);
                
            }else if(i == 9){
                
                coordenadas = new int[]{520,227};
               
                Ten[i].setCoordenadas(coordenadas);
                
            }
            
        }
        
        
        
        
        
        Fil = new Filosofo[this.cantidad];
        for (int i = 0; i < this.cantidad; i++) {
            if(i == this.cantidad-1){ 
                Fil[i] = new Filosofo(i,"Filosofo "+i,Ten[i],Ten[0]);
                
            }else{
                Fil[i] = new Filosofo(i, "Filosofo "+i, Ten[i], Ten[i+1]);
                
            }
            
            Fil[i].setImagenComida(new ImageIcon("F.png"));
            int [] coordenadasFil;
            int [] coordenadasCom;
            int [] coordenadasEstado;
                
            
            if(i == 0){
                
                Fil[i].setImagenFil(new ImageIcon("Aristoteles.png"));
 
                coordenadasFil = new int[]{620,116};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{620,162};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{620,70};
                Fil[i].setCoordEstado(coordenadasEstado);
               
                 
            }else if(i ==1){
                
                Fil[i].setImagenFil(new ImageIcon("Epicuro.png"));
 
                coordenadasFil = new int[]{750,165};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{715,195};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{780,130};
                Fil[i].setCoordEstado(coordenadasEstado);
                
               
                
            }else if(i == 2){
                
                Fil[i].setImagenFil(new ImageIcon("Karl.png"));
 
                coordenadasFil = new int[]{790,260};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{752,270};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{837,260};
                Fil[i].setCoordEstado(coordenadasEstado);
                
                
                
            }else if(i == 3){
                
                Fil[i].setImagenFil(new ImageIcon("Zenon.png"));
 
                coordenadasFil = new int[]{770,355};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{730,350};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{810,350};
                Fil[i].setCoordEstado(coordenadasEstado);
                
                
                
            }else if(i == 4){
                
                Fil[i].setImagenFil(new ImageIcon("Tales.png"));
 
                coordenadasFil = new int[]{720,425};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{685,390};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{720,470};
                Fil[i].setCoordEstado(coordenadasEstado);
                
                
                
            }else if(i == 5){
                
                Fil[i].setImagenFil(new ImageIcon("Platon.png"));
 
                coordenadasFil = new int[]{620,458};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{620,410};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{620,503};
                Fil[i].setCoordEstado(coordenadasEstado);
                
               
                
            }else if(i == 6){
                
                Fil[i].setImagenFil(new ImageIcon("Socrates.png"));
 
                coordenadasFil = new int[]{515,425};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{545,390};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{510,470};
                Fil[i].setCoordEstado(coordenadasEstado);
                
                
                
            }else if(i == 7){
                
                Fil[i].setImagenFil(new ImageIcon("Nietzsche.png"));
 
                coordenadasFil = new int[]{465,355};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{507,350};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{412,350};
                Fil[i].setCoordEstado(coordenadasEstado);
                
               
                
            }else if(i == 8){
                
                Fil[i].setImagenFil(new ImageIcon("Descartes.png"));
 
                coordenadasFil = new int[]{445,260};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{490,270};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{400,260};
                Fil[i].setCoordEstado(coordenadasEstado);
                
               
                
            }else if(i == 9){
                
                Fil[i].setImagenFil(new ImageIcon("Kant.png"));
 
                coordenadasFil = new int[]{478,165};
                Fil[i].setCoordFil(coordenadasFil);
                
                coordenadasCom = new int[]{528,197};
                Fil[i].setCoordComida(coordenadasCom);
                
                coordenadasEstado = new int[]{440,130};
                Fil[i].setCoordEstado(coordenadasEstado);
                               
                
            }
            
        }
    }
    
    
    public void iniciarSimulacion() {
        for (int i = 0; i < this.cantidad; i++) {
            Fil[i].start();   
        }
         this.actualizar();
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
    
    
   
    
    
    
    
    
    
    
    
    
    
  
            
