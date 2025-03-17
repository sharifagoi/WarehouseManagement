/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warehouse.backend;

/**
 *
 * @author agoi-sharif
 */
public class IncomingStockModel {

    private int ProdID;
    private String Name;
    private String Quantity;
    private String Amountcharged;
    private String Supplier;
    private String Date;
    private String Location;

    public IncomingStockModel(int ProdID, String Name, String Quantity, String Amountcharged, String Supplier, String Date, String Location) {
        this.ProdID = ProdID;
        this.Name = Name;
        this.Quantity = Quantity;
        this.Amountcharged= Amountcharged;
        this.Supplier = Supplier;
        this.Date = Date;
        this.Location = Location;

    }

    public Object[] toRowTable() {
        return new Object[]{ProdID, Name, Quantity, Amountcharged, Supplier, Date, Location};
    }

    public int getProdID() {
        return ProdID;

    }

    public void setProdID(int ProdID) {
        this.ProdID = ProdID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getAmountcharged() {
        return Amountcharged;
    }

    public void setAmountcharged(String Amountcharged) {
        this.Amountcharged = Amountcharged;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
}
