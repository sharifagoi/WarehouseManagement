/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warehouse.backend;

/**
 *
 * @author agoi-sharif
 */
public class OrdertableModel {
    
    private int orderid;
    private String txtName;
    private String date;
    private String totalamountcharged;
     
    
     public  OrdertableModel(int orderid,String name, String date, String totalamountcharged){
        this.orderid=orderid;
        this.txtName= name;
        this.date = date;
        this.totalamountcharged = totalamountcharged;
        
}
     
    public Object[] toRowTable(){
        return new Object[]{orderid,txtName,date,totalamountcharged};
        
    }
    public int getorderid(){
        return orderid;
}
public void setAppuserid(int dispatchid){
    this.orderid=dispatchid;
    }
    
    public String gettxtName(){
        return txtName;
        
    }
    public void settxtName(String name){
        this.txtName=name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String Date){
        this.date =Date;
    }
     public String  getTotalamountcharged(){
         return totalamountcharged;
    }
     public void setTotalamountcharged(String Totalamountcharged){
         this.totalamountcharged=Totalamountcharged;
     }
   }

