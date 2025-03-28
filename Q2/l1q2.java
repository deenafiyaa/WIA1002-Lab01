/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds.lab01;

/**
 *
 * @author deena
 */
import java.util.*;
import java.io.*;
public class l1q2 {
    public static void main(String[] args) {
        //text1(comma)
        try{
            FileReader in=new FileReader("text1.txt");
            Scanner input=new Scanner(in);
            String text="";
            while(input.hasNextLine()){
                String line=input.nextLine();
                String cleaned[]=line.split("\n");
                for(String clean:cleaned){
                    if(!clean.isEmpty()){
                        clean=clean.replaceAll("[,]+", "");
                        text+=clean+"\n";
                    }
                }
            }
            int count=text.length();
            System.out.println("Characters without special character for text1 : \n"+text);
            System.out.println("Number of characters : "+count);
            in.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        //text2(comma and space)
        try{
            FileReader in=new FileReader("text2.txt");
            Scanner input=new Scanner(in);
            String text="";
            while(input.hasNextLine()){
                String line=input.nextLine();
                String cleaned[]=line.split("\n");
                for(String clean:cleaned){
                    if(!clean.isEmpty()){
                        clean=clean.replaceAll("[,]+", "");
                        text+=clean+"\n";
                    }
                }
            }
            int count=text.length();
            System.out.println();
            System.out.println("Characters without special character for text2 : \n"+text);
            System.out.println("Number of characters : "+count);
            in.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        //text3(semicolon and space)
        try{
            FileReader in=new FileReader("text3.txt");
            Scanner input=new Scanner(in);
            String text="";
            while(input.hasNextLine()){
                String line=input.nextLine();
                String cleaned[]=line.split("\n");
                for(String clean:cleaned){
                    if(!clean.isEmpty()){
                        clean=clean.replaceAll("[;]+", "");
                        text+=clean+"\n";
                    }
                }
            }
            int count=text.length();
            System.out.println();
            System.out.println("Characters without special character for text3 : \n"+text);
            System.out.println("Number of characters : "+count);
            in.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        //text4(numbers)
        try{
            FileReader in=new FileReader("text4.txt");
            Scanner input=new Scanner(in);
            String text="";
            while(input.hasNextLine()){
                String line=input.nextLine();
                String cleaned[]=line.split("\n");
                for(String clean:cleaned){
                    if(!clean.isEmpty()){
                        clean=clean.replaceAll("[0-9]", "");
                        text+=clean+"\n";
                    }
                }
            }
            int count=text.length();
            System.out.println();
            System.out.println("Characters without special character for text4 : \n"+text);
            System.out.println("Number of characters : "+count);
            in.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
