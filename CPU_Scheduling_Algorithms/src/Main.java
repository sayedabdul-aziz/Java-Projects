
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main
{
          static CPUScheduler fcfs = new FirstComeFirstServe();
          static CPUScheduler sjf = new ShortestJobFirst();
          static CPUScheduler srt = new ShortestRemainingTime();
          static CPUScheduler psn = new PriorityNonPreemptive();
          static CPUScheduler psp = new PriorityPreemptive();
          static CPUScheduler rr = new RoundRobin();
          static Scanner sc;
        

    public static void main(String[] args)
    {
         String filename;
        filename = "C:\\Users\\Sayed Abdulaziz\\Desktop\\binary.txt";
        BufferedReader br = null;
        try {
            String sCurrentLine;
            sc = new Scanner(System.in);
            br = new BufferedReader(new FileReader(filename));
            while ((sCurrentLine = br.readLine()) != null) {
                String a[] = sCurrentLine.split(",");
                String processId = a[0];
                int arrivalTime = new Integer(a[1]);
                int cpuTime = new Integer(a[2]);
                int priority = new Integer(a[3]);
                
                fcfs.add(new Row(processId, arrivalTime, cpuTime));
                sjf.add(new Row(processId, arrivalTime, cpuTime));
                srt.add(new Row(processId, arrivalTime, cpuTime));
                psn.add(new Row(processId, arrivalTime, cpuTime,priority));
                psp.add(new Row(processId, arrivalTime, cpuTime,priority));
                rr.add(new Row(processId, arrivalTime, cpuTime));
            }
            System.out.println("Enter no of CPU Scheduling Algorithm :"
                    + "\n1 - First Come First Serve"
                    + "\n2 - Shortest Job First"
                    + "\n3 - Shortest Remaining Time"
                    + "\n4 - Priority NonPreemptive"
                    + "\n5 - Priority Preemptive"
                    + "\n6 - Round Robin");
            System.out.print("No. : ");
            int num = sc.nextInt();
            switch(num){
                case 1 : 
                     System.out.println("-----------------FCFS-----------------");
                     fcfs.process();
                     display(fcfs);
                    break;
                case 2 :
                     System.out.println("-----------------SJF-----------------");
                     sjf.process();
                     display(sjf);
                    break;
                case 3 :
                     System.out.println("-----------------SRT-----------------");
                     srt.process();
                     display(srt);
                    break;
                case 4 :
                     System.out.println("-----------------PSN-----------------");
                     psn.process();
                     display(psn);
                    break;
                case 5 :
                     System.out.println("-----------------PSP-----------------");
                     psp.process();
                     display(psp);
                    break;
                case 6 :
                     System.out.print("Enter a time quantum :");
                     int tq = sc.nextInt();
                     rr.setTimeQuantum(tq);
                     System.out.println("\n-----------------RR-----------------");
                     rr.process();
                     display(rr);
                    break;
                default:
                    System.out.println("Wrong num , plz try again");
                  
            }
              
        } catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    
    public static void display(CPUScheduler object)
    {
        System.out.println("Process\tAT\tBT\tWT\tTAT");

        for (Row row : object.getRows())
        {
            System.out.println(row.getProcessName() + "\t" + row.getArrivalTime() + "\t" + row.getBurstTime() + "\t" + row.getWaitingTime() + "\t" + row.getTurnaroundTime());
        }
                System.out.println();
                System.out.print("Gantt Chart =>   ");

        for (int i = 0; i < object.getTimeline().size(); i++)
        {
            List<Event> timeline = object.getTimeline();
            System.out.print(timeline.get(i).getStartTime() + "(" + timeline.get(i).getProcessName() + ")");
            
            if (i == object.getTimeline().size() - 1)
            {
                System.out.print(timeline.get(i).getFinishTime());
            }
        }
        System.out.println("\n");
        
        System.out.println("Average WT: " + object.getAverageWaitingTime() + "\nAverage TAT: " + object.getAverageTurnAroundTime());
    }
}
