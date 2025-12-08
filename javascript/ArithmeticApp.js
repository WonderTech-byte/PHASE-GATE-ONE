
    const prompt = require("prompt-sync")();    
       

        let trial = 0;
        let score =0;
        let firstNumber =0;
        let secondNumber = 0;
        let result = 0;
        let range  = 10;

        let startTime = Date.now();
        
    console.log("Time Start Now:");
    
        
    console.log("Solve Mathematical problems\nOn differences of two Numbers\n");
    while(trial != range){
         
            firstNumber = Math.floor(Math.random(52)* 23);
            secondNumber = Math.floor(Math.random(13) * 12);

         if(firstNumber > secondNumber){
            console.log((trial+1),  ". ",firstNumber , " - ", secondNumber+ " = ");
            result = prompt("   Enter result: ")

                if(result != firstNumber - secondNumber){          
                    console.log("  Try again");
                    console.log("  ", firstNumber, " - ", secondNumber, " = ");
                    let  result = prompt("    Enter result: ")
                        if(result == firstNumber - secondNumber){ 
                            score++; 
                            console.log("  correct");
                         }
               }
               else if(result == firstNumber - secondNumber){ 
                    score++; 
                    console.log("   correct");
                }
                    trial++;
         }
    }
    let stopTime = Date.now()
    let total = startTime - stopTime
        total =Math.floor(total /-1000); 
    console.log("Total time used(sec):", total);
    console.log("Score: ", score ," of ", range, " questions");
    

    

        







