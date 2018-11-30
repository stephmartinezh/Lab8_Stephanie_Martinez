package lab8_stephaniemartinez;

import java.util.ArrayList;

public class Mesa {

    private int numero;
    private boolean estado;
    private ArrayList<Clientes> clientes = new ArrayList();

    public Mesa(int numero, boolean estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
