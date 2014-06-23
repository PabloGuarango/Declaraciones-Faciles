package com.sri.clases;

import java.util.ArrayList;
public class ListFacturasVentas {
    private ArrayList<FacturaVenta>  t= new ArrayList();
    public void addFact(String numFactura, String ciPersona, String nomcl, String fecha, double total, double iva,double subtotal)
    {
        FacturaVenta a=new FacturaVenta(numFactura, ciPersona , nomcl, fecha, total, iva,subtotal);
        getT().add(a);
    }
    public double calTotal()
    {
        double tot=0;
        for(int i=0;i<getT().size();i++)
            tot+=getT().get(i).getTotal();
        return tot;
    }
    public boolean modificarFact(String numFactura, String idPersona, String nomCl,String fecha, double total, double iva,double subtotal)
    {
        for(FacturaVenta f:t)
       {
           if(f.getNumFactura().equals(numFactura))
           {
               f.setNumFactura(numFactura);
               f.setCiCliente(idPersona);
               f.setNomCli(nomCl);
               f.setFecha(fecha);
               f.setTotal(total);
               f.setIva(iva);
               f.setSubtotal(subtotal);
               return true;
                }}
        return false;
    }
    public FacturaVenta buscarFact(String a)
    {
       for(FacturaVenta f:t)
       {
           if(f.getNumFactura().equals(a))
               return f;
                }
       return null;
    }
    public boolean eliminarFact(String a)
    {
        int i=0;
       for(FacturaVenta f:t)
       {
           if(f.getNumFactura().equals(a))
           {
               t.remove(i);
               return true;
           }
           i++;
                }
       return false;
    }
    public double calTotalIva()
    {
        double tot=0;
        for(int i=0;i<getT().size();i++)
            tot+=getT().get(i).getIva();
        return tot;
    }
    public double calTotalSubt()
    {
        double tot=0;
        for(int i=0;i<getT().size();i++)
            tot+=getT().get(i).getSubtotal();
        return tot;
    }
    public ArrayList<FacturaVenta> getT() {
        return t;
    }
    public void setT(ArrayList<FacturaVenta> t) {
        this.t = t;
    }
}
