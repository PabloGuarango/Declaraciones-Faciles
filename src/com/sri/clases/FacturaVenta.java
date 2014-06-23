
package com.sri.clases;

public class FacturaVenta {
    private String numFactura;
    private String ciCliente;
    private String nomCli;
    private String fecha;
    private double total;
    private double iva;
    private double subtotal;
    FacturaVenta(String numFactura, String codProvee, String nomCli, String fecha, double total, double iva,double subtotal)
    {
        this.numFactura=numFactura;
        this.ciCliente=codProvee;
        this.nomCli=nomCli;
        this.fecha=fecha;
        this.total=total;
        this.iva=iva;
        this.subtotal=subtotal;
    }

    /**
     * @return the numFactura
     */
    public String getNumFactura() {
        return numFactura;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    /**
     * @param numFactura the numFactura to set
     */
    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    /**
     * @return the ciCliente
     */
    public String getCiCliente() {
        return ciCliente;
    }

    /**
     * @param ciCliente the ciCliente to set
     */
    public void setCiCliente(String ciCliente) {
        this.ciCliente = ciCliente;
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