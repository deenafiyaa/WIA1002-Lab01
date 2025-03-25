/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds.lab01;

/**
 *
 * @author deena
 */
import java.io.*;
import java.util.*;
public class ReadMyLetter_23002721 {
    public static void main(String[] args) {
        try{
            FileReader in=new FileReader("Nurdeena_23002721.txt");
            int character;
            while((character=in.read())!=-1){
                System.out.print((char)character);
            }
            System.out.println();
            in.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        String fileName="Nurdeena_23002721.txt";
        try{
            FileWriter out=new FileWriter(fileName,true);
            Scanner input=new Scanner(System.in);
            System.out.println("\nEnter text to append file (type 'exit' to finish): ");
            
            while(true){
                String text=input.nextLine();
                if(text.equalsIgnoreCase("exit")){
                    break;
                }
                out.write(text + "\n");
            }
            input.close();
            out.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        try{
            FileReader in=new FileReader("Nurdeena_23002721.txt");
            int character;
            while((character=in.read())!=-1){
                System.out.print((char)character);
            }
            System.out.println();
            in.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
