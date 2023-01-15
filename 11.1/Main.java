package Task;

import java.io.*;
import java.util.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("LinkToWeb.txt");
        String spec = "";
        try(Scanner sc = new Scanner(file)){
            for(; sc.hasNextLine() ;){
                InetAddress adress = InetAddress.getByName(spec + sc.nextLine());
                System.out.println("Доступен: " +  adress);
            }
        }catch (IOException e){
            System.out.println("Error");
        }

    }
 }

