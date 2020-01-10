import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.apache.poi.util.SystemOutLogger;

public class ThreadServices {
	
	public static void main(String[] args) {
		
		 ExecutorService Threadservice ;

		Threadservice = Executors.newFixedThreadPool(4);
		ArrayList<String> tcsToRun = new ArrayList<String>();
		tcsToRun.add("s1");		tcsToRun.add("s1");
		tcsToRun.add("s1");
		tcsToRun.add("s1");
		tcsToRun.add("s1");
		tcsToRun.add("s1");
		tcsToRun.add("s1");

		
		int threadstart=0;
		while (threadstart<tcsToRun.size()){
			
			for (int tc=1; tc<tcsToRun.size() && tc<10;tc++){
				//final Future f1=Threadservice.submit(new Task1(tcsToRun[tc][0], Integer.parseInt(tcsToRun[tc][1]),Integer.parseInt(tcsToRun[tc][2]), Integer.parseInt(tcsToRun[tc][3]), tcsToRun[tc][4], tcsToRun[tc][5],  tcsToRun[tc][6],tcsToRun[tc][7]));
				//QCTask(String [][] TestCaseArray, int startIndex,final Document objdoc,final IList tstestlist,final ITreeManager itreetest,final String strLocalResultFileName,final String strClientPath,final int basFactsTest,final int  windowPosition,final String strBrowserType,final String strStringTestSetName, int browserindex,String machineName)
		         //Threadservice.submit(Systemnew QCTask(tcsToRun,threadstart,objdoc,tstestlist,strLocalResultFileName,strClientPath,Integer.parseInt(tcsToRun[tc][4]),Integer.parseInt(tcsToRun[tc][0]),tcsToRun[tc][2],strStringTestSetName,Integer.parseInt(tcsToRun[tc][1]),tcsToRun[tc][3]));
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}	
			
			threadstart=threadstart+4;//MaxThreads;	       
		}		
		Threadservice.shutdown();


	}

}
