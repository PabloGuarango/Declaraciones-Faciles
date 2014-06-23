package com.sri.clases;

import java.util.ArrayList;
public class ListFacturasCompras {
    private ArrayList<FacturaCompra>  t= new ArrayList();
    public void addFact1(String numFactura, String idPersona, String nomPersona,String tipog, String fecha, double total, double iva,double subtotal)
    {
        FacturaCompra a=new FacturaCompra(numFactura, idPersona, nomPersona, tipog, fecha, total, iva,subtotal);
        getT().add(a);
    }
    public double calTotal()
    {
        double tot=0;
        for(int i=0;i<getT().size();i++)
            tot+=getT().get(i).getTotal();
        return tot;
    }
    public boolean modificarFact(String numFactura, String idPersona, String nomPersona,String tipg, String fecha, double total, double iva,double subtotal)
    {
        for(FacturaCompra f:t)
       {
           if(f.getNumFactura().equals(numFactura))
           {
               f.setNumFactura(numFactura);
               f.setCodProvee(idPersona);
               f.setNomProvee(nomPersona);
               f.setTipoGasto(tipg);
               f.setFecha(fecha);
               f.setTotal(total);
               f.setIva(iva);
               f.setSubtotal(subtotal);
               return true;
                }}
        return false;
    }
    public FacturaCompra buscarFact(String a)
    {
       for(FacturaCompra f:t)
       {
           if(f.getNumFactura().equals(a))
               return f;
                }
       return null;
    }
    public boolean eliminarFact(String a)
    {
        int i=0;
       for(FacturaCompra f:t)
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
    public ArrayList<FacturaCompra> getT() {
        return t;
    }
    public void setT(ArrayList<FacturaCompra> t) {
        this.t = t;
    }
}
