/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warehouse.backend;

/**
 *
 * @author agoi-sharif
 */
public class ReportModel {

    private int ProductID;
    private String Productname;
    private String Shippername;
    private String Customername;
    private String Quantityreturned;
    private String Reason;
    private String Datereturned;

    public  ReportModel(int ProductID, String Productname, String Shippername, String Customername, String Quantityreturned,String Reason, String Datereturned) {
        this.ProductID = ProductID;
        this.Productname = Productname;
        this.Shippername = Shippername;
        this.Customername = Customername ;
        this.Quantityreturned = Quantityreturned;
        this.Reason = Reason;
        this.Datereturned = Datereturned;
    }

    public Object[] toRowTable() {
        return new Object[]{ProductID, Productname, Shippername,Customername,Quantityreturned ,Reason, Datereturned};
    }

    public int getProductid() {
        return ProductID;

    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductname() {
        return Productname;
    }

    public void setProductname(String Productname) {
        this.Productname = Productname;
    }

    public String getShippername() {
        return Shippername;
    }

    public void setShippername(String Shippername) {
        this.Shippername = Shippername;
    }

    public String getCustomername() {
        return Customername;
    }

    public void setCustomername(String Customername) {
        this.Customername = Customername;
    }

    public String getQuantityreturned() {
        return Quantityreturned;
    }

    public void setQuantityreturned(String Quantityreturned) {
        this.Quantityreturned= Quantityreturned;

    }
    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason= Reason;

    }
    public String getDatereturned() {
        return Datereturned;
    }

    public void setDatereturned(String Datereturned) {
        this.Datereturned= Datereturned;

    }

}
