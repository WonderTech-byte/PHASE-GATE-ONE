import java.util.Scanner;
import java.util.ArrayList;
public class GroceryManagerApp{
    public static void main(String...args){

        Scanner input = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();


        
        
        int labelCount =1;
        int option = -1;

         String menu = """ 
        ========== GROCERY MANAGER APP ===========
        1. Add Items
        2. Remove Items
        3. Show all Available Items
        ========================================== 
        """;

    
        while(option != 0){
            System.out.print(menu + "Enter Option or 0 to opt out: ");    
            option =  input.nextInt();   
            
                switch (option){
                    case 1 -> {
                       System.out.print("Enter item: ");
                       String item = input.next();
                       items = addItem(item);
                       System.out.println(item +" Addedd successfully\n");
                     
                    }
                    case 2 -> {
                       System.out.print("Enter item Name to Remove: ");
                       String item = input.next();
                        
                           for(String elm: items){
                                if(elm.equalsIgnoreCase(item)){ 
                                   items = removeItem(item);    
                                   System.out.println(item+ " Removed successfully\n");
                                }else{ System.out.println("Item not found");
                                }
                            }
                    
                    }
                    case 3 ->{
                        for(String item: items){
                            System.out.println(labelCount++ +". "+item);
                            System.out.println("\n");
                        }
                    }
    
        }

    
      }

}
    



    public static ArrayList<String> addItem(String item){
         ArrayList<String> items = new ArrayList<>();
         items.add(item);
         return items;
    }  

    public static ArrayList<String> removeItem(String item){
        ArrayList<String> items = new ArrayList<>();
            items.remove(item);
    
        return items;

    }









}
