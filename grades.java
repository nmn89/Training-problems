import java.util.*;
import java.io.*;
public class grades {
    public static void main(String[] args) throws Exception {
        String line;
        String path = "C:/Users/naman sharma/Downloads/grades.csv";
        String[] arr;
        BufferedReader bf = new BufferedReader(new FileReader(path));
        bf.readLine();
        TreeMap<Double,String[]> set1 = new TreeMap<Double,String[]>();
        TreeMap<Double,String[]> set2 = new TreeMap<Double,String[]>();
        TreeMap<Double,String[]> set3 = new TreeMap<Double,String[]>();
        TreeMap<Double,String[]> set4 = new TreeMap<Double,String[]>();
        while((line=bf.readLine())!=null && !line.isEmpty()){
            arr = line.split(",");
            set1.put(Double.parseDouble(arr[3].trim()),arr);
            set2.put(Double.parseDouble(arr[4].trim()),arr);
            set3.put(Double.parseDouble(arr[5].trim()),arr);
            set4.put(Double.parseDouble(arr[6].trim()),arr);
        }
        String[] arr1 = set1.get(set1.lastKey());
        String[] arr2 = set2.get(set2.lastKey());
        String[] arr3 = set3.get(set3.lastKey());
        String[] arr4 = set4.get(set4.lastKey());
        System.out.println("Highest no. in test1 is of: " + arr1[1]+arr1[0]+" & SSN is: "+arr1[2]);
        System.out.println("Highest no. in test2 is of: " + arr2[1]+arr2[0]+" & SSN is: "+arr2[2]);
        System.out.println("Highest no. in test3 is of: " + arr3[1]+arr3[0]+" & SSN is: "+arr3[2]);
        System.out.println("Highest no. in test4 is of: " + arr4[1]+arr4[0]+" & SSN is: "+arr4[2]);
        bf.close();

    }
}