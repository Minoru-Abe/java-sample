package parallelexecute;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	public static void main (String args[]) {
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		Future<String> futureResult = ex.submit(new ThreadRun5());
		
		for(int i=0; i<3; i++) {
			System.out.println("Main side: " + i + "times executed.");
			try {
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			
		}
		
		try {
			String result = futureResult.get();
			System.out.println(result);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("All steps on main sides are done.");
		
		System.exit(0);
	}
	

}
