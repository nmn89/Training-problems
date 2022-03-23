import java.io.*;
import java.util.*;

public class house {
    public static void main(String[] args) throws IOException {
        String line;
        String path = "C:/Users/naman sharma/Downloads/homes.csv";
        ArrayList<Integer> ProfitL = new ArrayList<Integer>();
        BufferedReader bf = new BufferedReader(new FileReader(path));
        bf.readLine();
        try{while ((line = bf.readLine()) != null) {
                String[] array = line.split(",");
                int sell = Integer.parseInt(array[0].trim());
                int list = Integer.parseInt(array[1].trim());
                int tax = Integer.parseInt(array[array.length - 1].trim());
                int profit = ((list - sell) * 1000) - tax;
                ProfitL.add(profit);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        Collections.sort(ProfitL);
        System.out.println();
        for (int i = ProfitL.size() - 1; i >= ProfitL.size() - 3; i--) {
            System.out.println(ProfitL.get(i));
        }
        bf.close();
    }   
}