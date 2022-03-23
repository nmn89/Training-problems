import java.util.*;
import java.io.*;
public class oscar {
    public static void main(String[] args) throws Exception {
        String line;
        String path = "C:/Users/naman sharma/Downloads/oscar_age_male.csv";
        String[] arry;
        TreeSet<Integer> se = new TreeSet<Integer>();
        BufferedReader bf = new BufferedReader(new FileReader(path));
        BufferedReader cf = new BufferedReader(new FileReader(path));
        bf.readLine();
        try{while((line=bf.readLine())!=null && !line.isEmpty()){
            arry = line.split(",");
            se.add(Integer.parseInt(arry[4].trim()));
        }
        int max = se.pollLast();
        int min = se.pollFirst();
        cf.readLine();
        while((line=cf.readLine())!=null && !line.isEmpty()){
            arry = line.split(",");
            if(Integer.parseInt(arry[4].trim()) == max){
                System.out.println("Oldest = " + line);
            }
            if(Integer.parseInt(arry[4].trim()) == min){
                System.out.println("Youngest = " + line);
            }
        }
    }catch(Exception e){
        e.printStackTrace();
    }
        bf.close();
        cf.close();
    }
}