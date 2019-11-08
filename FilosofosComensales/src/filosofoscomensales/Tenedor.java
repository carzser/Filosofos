
package filosofoscomensales;

import javax.swing.ImageIcon;

public class Tenedor {
    
    private int id;
    private boolean estado;
    private Filosofo [] cola;
    private ImageIcon imagen;
    private int coordenadas [];

    public Tenedor(int id) {
        this.id = id;
        this.estado = true;
        this.cola = new Filosofo [2];
        this.cola[0] = null;
        this.cola[1] = null;
        this.coordenadas = new int [2];
        
     }
    
    
    
    public void encolar(Filosofo f){
        if(this.cola[0] != f && this.cola[1] != f){
            if(this.cola[0] == null){
                this.cola[0] = f;
            }else{
                this.cola[1] = f;
            }
        }                            
    }
    
    public void desEncolar(){
        this.cola[0] = this.cola[1];
        this.cola[1] = null;
    }
    

    public Filosofo[] getCola() {
        return cola;
    }

    public boolean getEstado() {
        return estado;
    }

    

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public int[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    
    
    
    
}
