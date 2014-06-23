/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sri.clases;

import java.util.ArrayList;

/**
 *
 * @author USRLAN
 */
public class ListFactura {
    private ArrayList<Factura>  t= new ArrayList();
    public void addFact(String numFactura, String idPersona, String nomPersona, String fecha, double total, double iva,double subtotal)
    {
        Factura a=new Factura(numFactura, idPersona, nomPersona, fecha, total, iva,subtotal);
        getT().add(a);
    }
    public double calTotal()
    {
        double tot=0;
        for(int i=0;i<getT().size();i++)
            tot+=getT().get(i).getTotal();
        return tot;
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

    /**
     * @return the t
     */
    public ArrayList<Factura> getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(ArrayList<Factura> t) {
        this.t = t;
    }
            
}
