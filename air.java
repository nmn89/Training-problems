
import java.io.*;
public class air {
    public static void main(String[] args) throws IOException {
        String line;
        int sumof1958 =0,sumof1959=0,sumof1960=0;
        int row=0;
        String path = "C:/Users/naman sharma/Downloads/airtravel.csv";
        String[] arry;
        BufferedReader bf = new BufferedReader(new FileReader(path));
        bf.readLine();
        while((line=bf.readLine())!=null && !line.isEmpty()){
            arry = line.split(",");
            row++;
            sumof1958 = sumof1958 +Integer.parseInt(arry[1].trim());
            sumof1959 = sumof1959 +Integer.parseInt(arry[2].trim());
            sumof1960 = sumof1960 +Integer.parseInt(arry[3].trim());  
                   
        }  
        System.out.println(sumof1958/row);
        System.out.println(sumof1959/row);
        System.out.println(sumof1960/row);
        bf.close();
    }
}
