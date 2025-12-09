
items = []




labelCount =1;
option = -1;

menu = """ 
========== GROCERY MANAGER APP ===========
1. Add Items
2. Remove Items
3. Show all Available Items
========================================== 
""";

def addItem(item):
     lists = []
     items.append(item);
     return items;


def removeItem(item):
    lists = []
    items.remove(item);
    return items;   

    


while(option != 0):  
    print(menu)
    option = int(input("Enter option: "))     

    match option:
        case 1:
            item = input("Enter item: ")
            items = addItem(item);
            print(item +" Addedd successfully\n")

        case 2:
            item = input("Enter item Name to Remove: ")
            for elm in items:
                if elm == item:
                    items = removeItem(item);    
                    print(item+ " Removed successfully\n");
            print("No item", item, " found")

        case 3:
            if len(items) == 0:
                print("no available item")
            for item in items:
                print(".--. ", item);
               
                           
        













