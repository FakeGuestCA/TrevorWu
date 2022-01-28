import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {

        // going over txt file //
        String word = "the"; // word to be searched //
        int L = 0;
        int index = 0;
        int a = 0;
        String[] f;
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        // putting each line into the array called "lines" //
        while((line = br.readLine()) != null){
            System.out.println(line);
            lines.add(line);
            L++;



            // search word function //
            if (line.contains(word)){
                System.out.println("Found word in line "+L);
                f = line.split("(?!^)");

                // for if word is in the beginning of the line //
                index = line.indexOf(word,index)+1;
                System.out.println("Index : "+index);

                // for if word is in the rest of the line //
                while(a < f.length){
                    index = line.indexOf(word,index+1)+1;
                        if(index == 0){
                            break;
                        }
                    System.out.println("Index : "+index);
                    a++;
                }
            }
        }
        br.close();
    }
}