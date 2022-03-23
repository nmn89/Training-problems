import java.util.*;
import java.io.*;
public class oscar2 {
    public static void main(String[] args) throws Exception {
        String line;
        String path = "C:/Users/naman sharma/Downloads/oscar_age_male.csv";
        String[] arry;
        TreeMap<Integer,String[]> se = new TreeMap<Integer,String[]>();
        BufferedReader bf = new BufferedReader(new FileReader(path));
        bf.readLine();
        try{    
            while((line=bf.readLine())!=null && !line.isEmpty()){
            arry = line.split(",");
            se.put(Integer.parseInt(arry[4].trim()),arry);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        String[] p1=se.get(se.firstKey());
        String[] p2=se.get(se.lastKey());
        System.out.println("Youngest Actor to won oscar : "+p1[6]+"   for movie: "+p1[8]+"   in year: "+p1[2]);
        System.out.println("Eldest Actor to won oscar"+p2[6]+"   for movie: "+p2[8]+"   in year: "+p2[2]);
        bf.close();
    }
}