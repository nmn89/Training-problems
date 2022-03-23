import java.util.*;
import java.io.*;

public class airtravel {
    public static void main(String[] args) throws IOException {

        String path = "C:/Users/naman sharma/Downloads/airtravel.csv";

        printAverage(path);

    }

    public static void printAverage(String csvPath) {

        String line;
        ArrayList<String> column1Values = new ArrayList<String>();
        ArrayList<String> column2Values = new ArrayList<String>();
        ArrayList<String> column3Values = new ArrayList<String>();

        String[] columnValues;
        BufferedReader bf;

        try {
            
            bf = new BufferedReader(new FileReader(csvPath));

            bf.readLine(); // reading header line

            while ((line = bf.readLine()) != null && !line.isEmpty()) {

                columnValues = line.split(",");
                column1Values.add(columnValues[1]);
                column2Values.add(columnValues[2]);
                column3Values.add(columnValues[3]);
            }

            System.out.println(getAverages(column1Values));
            System.out.println(getAverages(column2Values));
            System.out.println(getAverages(column3Values));

            bf.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public static double getAverages(ArrayList<String> values) {

        try {
            double sum = 0;

            for (String value : values) {
                sum += Double.parseDouble(value.trim());
            }
            double average = sum / values.size();
            return average;
        } catch (Exception e) {
            return 0.0;
        }
    }
}