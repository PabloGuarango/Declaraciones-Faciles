
package com.sri.clases;

public class FacturaCompra {
    private String numFactura;
    private String codProvee;
    private String nomProvee;

    
    private String tipoGasto;
    private String fecha;
    private double total;
    private double iva;
    private double subtotal;
    FacturaCompra(String numFactura, String codProvee, String nomProvee,String tipoGasto, String fecha, double total, double iva,double subtotal)
    {
        this.numFactura=numFactura;
        this.codProvee=codProvee;
        this.nomProvee=nomProvee;
        this.tipoGasto=tipoGasto;
        this.fecha=fecha;
        this.total=total;
        this.iva=iva;
        this.subtotal=subtotal;
    }
public String getNomProvee() {
        return nomProvee;
    }

    public void setNomProvee(String nomProvee) {
        this.nomProvee = nomProvee;
    }
    /**
     * @return the numFactura
     */
    public String getNumFactura() {
        return numFactura;
    }

    /**
     * @param numFactura the numFactura to set
     */
    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    /**
     * @return the codProvee
     */
    public String getCodProvee() {
        return codProvee;
    }

    /**
     * @param codProvee the codProvee to set
     */
    public void setCodProvee(String codProvee) {
        this.codProvee = codProvee;
    }

    /**
     * @return the tipoGasto
     */
    public String getTipoGasto() {
        return tipoGasto;
    }

    /**
     * @param tipoGasto the tipoGasto to set
     */
    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
}