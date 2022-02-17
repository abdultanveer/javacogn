package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShowOrganizer {
	
	public static void main(String[] args) {
        //hiring 5 students        //creating a pool of 5 threads  
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        for (int i = 0; i < 10; i++) {   //i have 10 files to be signed
            Runnable worker = new Student("fileno-" + i);  
            executor.execute(worker);
        }
        
        executor.shutdown();  //show organiser is going to end the show
        
        while (!executor.isTerminated()) {   }  
        
        System.out.println("Finished all threads");  
    }  



	}


