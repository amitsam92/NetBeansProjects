/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobdifference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author samdarshi
 */
public class JobDifference {

    private int minJobDynamic(List<String> list) {
        
        Map<Integer, Job> map = new HashMap<Integer, Job>(); 
        for(String x : list){
            Job job = new Job(x);
            if(job.type.equals("STARTING")){
                for(int d = job.dd;d<1000;d++){
                    map.put(d, job);
                }
            }
            
        }
        
        return 0;
    }
    
    class Job{
        int hh;
        int mm;
        int dd;
        String type; 
        
        public Job(String job){
            String[] arr = job.split(" ");
            String[] time = arr[0].split(":");
            this.hh = Integer.parseInt(time[0]);
            this.mm = Integer.parseInt(time[1]);
            this.type = arr[1];
            this.dd = Integer.parseInt(arr[2]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list = new ArrayList<String>();
        int ans = minJobDynamic(list);
    }
    
}
