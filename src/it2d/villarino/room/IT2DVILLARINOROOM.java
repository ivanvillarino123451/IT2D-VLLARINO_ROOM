package IT2DVILLARINOROOM ;

import it2d.villarino.room.config;
import java.util.Scanner;

public class IT2DVILLARINOROOM {


    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
        String response;
        do{
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        System.out.print("Enter Action: ");
        int action =  sc.nextInt();
      IT2DVILLARINOROOM room ; 
            room = new IT2DVILLARINOROOM ();
        switch(action){
            case 1:
               
            room.addroom();
            break;
            
            case 2:
           room.viewroom();
            break;
        }
            System.out.println("Do you want to continue? (yes/no): ");
            response = sc.next();  
        }while(response.equalsIgnoreCase("yes"));
        System.out.println("Thank you so much!"); 
    }
       public void addroom(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        
        System.out.print(" ID: ");
         String rid = sc.next();
        System.out.print(" number: ");
        String rnumber = sc.next();
        System.out.print(" type: ");
        String rtype = sc.next();
        System.out.print("status: ");
        String rstatus = sc.next();
        System.out.print("rate: ");
        String rrate;
        rrate = sc.next();

        String sql;
        sql = "INSERT INTO tbl_room(r_id, r_number, r_type, r_status, r_rate ) VALUES (?, ?, ?, ?,?)";


        conf.addRecord(sql, rnumber, rtype,rstatus, rrate);


    }

    @SuppressWarnings("empty-statement")
    private void viewroom() {  
        config conf = new config();
        String roomQuery = "SELECT * FROM tbl_room";
        String[] roomHeaders = {"room ID", "room number", "room type", "room status", "room date"};
        String[] roomColumns = null;
        String[] roomcolumns = null;
        conf.viewRecords(roomQuery, roomHeaders,roomcolumns);
         

        conf.viewRecords(roomQuery, roomHeaders,roomColumns);
    }
    

private void updateroom(){
 Scanner sc = new Scanner(System.in);

System.out.println(" Enter the id to update: ");
int id = sc.nextInt();

System.out.println(" ID ");
String rid = sc.next();
System.out.println("number:");
String rnumber = sc.next();
System.out.println("type:");
String rtype = sc.next();
System.out.println("status:");
String status = sc.next();
System.out.println("rate:");
String rate = sc.next();



   }

 private void deleteroom(){

    Scanner sc = new Scanner(System.in);
    
    
System.out.println("Enter the id to delete:");
int id = sc.nextInt();

String qry = "DELETE FROM tbl_room WHERE c_id = ?";

 conf. deleteRecord(qry, id);
  config conf = new config();
 }

} 
 
 
 
 
 
 
 
 
 
  

   