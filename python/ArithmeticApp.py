import random
import time
import math

trial = 0;
score =0;
first_number =0;
second_number = 0;
result = 0;
time_range  = 10;

start_time = time.time();
        
print("Time Start Now");
    
print("Solve Mathematical problems\nOn differences of two Numbers\n");
while trial != time_range:
         
    first_number = random.randint(15,30);
    second_number = random.randint(2, 14);

    print((trial+1),  ". ",first_number , " - ", second_number, " = ");
    result = int(input("   Enter result: "))

    if result != first_number - second_number:        
        print("  Try again");
        print("  ", first_number, " - ", second_number, " = ");
        result = int(input("    Enter result: "))

        if result == first_number - second_number:
            score+=1; 
            print("  correct");

    elif result == first_number - second_number: 
        score+=1; 
        print(" correct");
    trial+=1;
    
stop_time = time.time();
total = math.floor(stop_time - start_time);
print("Total time used(sec): ", total);
print("Score: ", score ," of ", time_range, " questions");
    

    

        







