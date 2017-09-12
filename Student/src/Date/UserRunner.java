package Date;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class UserRunner {

    private static Set x;

    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("c:\\zp.txt");
        int length = stream.available();
        byte [] data = new byte[length];
        stream.read(data);
        String text = new String(data);
       // System.out.println(text);
        ArrayList<String[]> lineWords = new ArrayList<>();

        String [] lines = text.split("\r\n");
        System.out.println(lines.length);
        for (String line:lines){
            String [] words = line.split(";");
            lineWords.add(words);
            //System.out.println(words);
        }
        List<Users> users2 = new ArrayList<Users>();
        LinkedList <Users> users = new LinkedList<>();
                System.out.println("Amount of line " + lineWords.size());
        for (String [] words:lineWords){
            users.add(new Users(words[1],words[2]));
                 for (String  word:words){

                }
        }

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String [] words: lineWords){
            if(map.containsKey(words[3])){
                Integer k = map.get(words[3]);
                k = k+1;
                map.put(words[3],k);
            }
            else {
                map.put(words[3],1);
            }
        }
        System.out.println(map.get("Отпускные"));
        for(String key:map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
       //users.sort();
       // Collections.sort(NameList1)
       for (int i=0;i<=(users.size()-1);i++){
          // System.out.println(user.toString());
           System.out.println(i + " "+users.get(i).getName());
       }

       List<String> color = new ArrayList<String>();

       color.add("blue");
       color.add("white");
       color.add("red");

       for (int i=0; i<=(color.size()-1); i++){
           System.out.println(color.get(i));
       }

        Set x = new HashSet<>();
        x.add(1984);
        x.add(2001);
        x.add(1987);
        x.add(1984);
        x.add(2005);

        Iterator y = x.iterator();
        while (y.hasNext()){
            System.out.print(y.next() + " ");

    }
    }
}
