/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofoscomensales;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Carlos
 */
public class Filosofo extends Thread{
    private int id;
    private String nombre;
    private ImageIcon imagenFil;
    private ImageIcon imagenEstado;
    private ImageIcon imagenComida;
    private String estado;
    private int platos;
    private Tenedor tenIzquierda;
    private Tenedor tenDerecha;
    int tiempo;
    private int coordFil[];
    private int coordEstado[];
    private int coordComida[];
    
    ImageIcon estadoImg[] = {
                            new ImageIcon("Pensando.png"),
                            new ImageIcon("Esperando.png"),   
                            new ImageIcon("Comiendo.png"),
                            new ImageIcon("Saciado.png"),
    };

    public Filosofo(int id, String nombre, Tenedor tenIzquierda, Tenedor tenDerecha) {
        this.id = id;
        this.nombre = nombre;
        this.tenIzquierda = tenIzquierda;
        this.tenDerecha = tenDerecha;
        this.estado = "Pensando";
        
        Random r = new Random();
        int low = 2;
        int high = 9;
        this.platos = r.nextInt(high-low) + low;;
        
        this.tiempo = (int) ((Math.random()*7+3)*1000);
        this.coordEstado = new int[2];
        this.coordEstado = new int[2];
        this.coordEstado = new int[2];
    }
    
    
    @Override
    public void run(){
        try {
            System.out.println(nombre+" "+tiempo);             
            pensar();
        } catch (InterruptedException ex) {
           
        }
    }
    
    
    
    public synchronized void pensar() throws InterruptedException{
        System.out.println(this.nombre + " pensando...");
        this.estado = "Pensando";
        this.imagenEstado = estadoImg[0];  //Imagen de pensando
        sleep(this.tiempo);
        comer();
    }
    
    
    public synchronized void comer() throws InterruptedException{
        System.out.println(this.nombre+ " intentando comer");
        
        while(!tomarTenedorIzq() || !tomarTenedorDer()){
            esperar();
        }
        this.tenIzquierda.encolar(this);
        this.tenDerecha.encolar(this);
        
        if(this.tenIzquierda.getCola()[0] == this && this.tenDerecha.getCola()[0] == this){
            this.tenIzquierda.desEncolar();
            this.tenDerecha.desEncolar();
            this.tenIzquierda.setEstado(false);
            this.tenDerecha.setEstado(false);
            
            System.out.println(this.nombre+ " Comiendo");
            this.estado =  "Comiendo";
            this.imagenEstado = estadoImg[2];
            sleep(this.tiempo);
            this.platos--;
            soltarTenedores();
            if(this.platos == 0) saciado();
            else pensar();
        }else comer();
    }
    
    
    public synchronized void esperar() throws InterruptedException{
        this.estado = "Esperando";
        this.imagenEstado = estadoImg[1];
        
    }
    
    public synchronized void saciado(){
        this.estado = "Saciado";
        this.imagenEstado = estadoImg[3];
    }
    
    public synchronized boolean tomarTenedorIzq(){
        if(this.tenIzquierda.getEstado() == true) return true;
        else return false;
    }
    
     public synchronized boolean tomarTenedorDer(){
        if(this.tenDerecha.getEstado() == true) return true;
        else return false;
    }
     
    public synchronized void soltarTenedores(){
        this.tenIzquierda.setEstado(true);
        this.tenDerecha.setEstado(true);
        
    }
    
    
    
    
    
    
    
    
    

    public ImageIcon getImagenFil() {
        return imagenFil;
    }

    public void setImagenFil(ImageIcon imagenFil) {
        this.imagenFil = imagenFil;
    }

    public ImageIcon getImagenEstado() {
        return imagenEstado;
    }

    public void setImagenEstado(ImageIcon imagenEstado) {
        this.imagenEstado = imagenEstado;
    }

    public ImageIcon getImagenComida() {
        return imagenComida;
    }

    public void setImagenComida(ImageIcon imagenComida) {
        this.imagenComida = imagenComida;
    }

    public int[] getCoordFil() {
        return coordFil;
    }

    public void setCoordFil(int[] coordFil) {
        this.coordFil = coordFil;
    }

    public int[] getCoordEstado() {
        return coordEstado;
    }

    public void setCoordEstado(int[] coordEstado) {
        this.coordEstado = coordEstado;
    }

    public int[] getCoordComida() {
        return coordComida;
    }

    public void setCoordComida(int[] coordComida) {
        this.coordComida = coordComida;
    }

    public int getPlatos() {
        return platos;
    }

    public String getEstado() {
        return estado;
    }

    public Tenedor getTenDerecha() {
        return tenDerecha;
    }

    public String getNombre() {
        return nombre;
    }

    

   
    
    
    






}



