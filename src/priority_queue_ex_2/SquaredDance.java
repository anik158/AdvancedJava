package priority_queue_ex_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class SquaredDance {

    public static void main(String[] args) {
        PriorityQueue<String> men = new PriorityQueue<>();
        PriorityQueue<String> women = new PriorityQueue<>();

        String sex = "";

        File file = new File("E:\\Java\\Intellij Idea\\AdvancedJava\\src\\priority_queue_ex_2\\people.txt");


        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;

            while((line = br.readLine()) !=null){
                sex = line.substring(0,1);

                if(sex.equals("M")){
                    men.add(line.substring(2));
                }else{
                    women.add(line.substring(2));
                }
            }
        }catch (IOException e){
            System.err.print("Error opening the file.");
        }

        System.out.println("The dance partner will be:");
        int i = 0;
        while (!men.isEmpty() && !women.isEmpty()){
            System.out.println(++i+". "+men.poll() + " and "+women.poll());
        }

        if(men.isEmpty()){
            System.out.println("There are "+women.size()+" women waiting to dance");
            System.out.println(women.peek()+" is next dancer");
        }

        if(women.isEmpty()){
            System.out.println("There are "+men.size()+" men waiting to dance");
            System.out.println(men.peek()+" is next dancer");
        }
    }
}
