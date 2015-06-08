/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadi;

/**
 *
 * @author mozaze
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class BacaFile_lingkungan {
    public static void main(String[] args) {
        BufferedReader br=null;
        
        try{
            String line;
            br=new BufferedReader(new FileReader("lingkungankelas.txt"));
            
            while((line=br.readLine())!=null){
                System.out.println(line);
                StringTokenizer stringtoken=new StringTokenizer(line, "|");
                
                
            }
        }catch(IOException t){
            t.printStackTrace();
        }finally{
            try{
                if(br!=null){
                    br.close();
                }
            }catch(IOException w){
                w.printStackTrace();
            }
        }
    }
    
}
