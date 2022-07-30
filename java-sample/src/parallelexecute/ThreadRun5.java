package parallelexecute;
import java.util.concurrent.Callable;

public class ThreadRun5 implements Callable<String>{
	public String call() {
		for(int i=0; i<3; i++) {
			System.out.println("Thread side: " + i + "times executed");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		return "All executions on thread side have finished" ;
	}
	

}
