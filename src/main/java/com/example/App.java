package com.example;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.collect.ImmutableList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ImmutableList<String> fruits =ImmutableList.of("Apple","banana","cherry");
        System.out.println( fruits );
        File src=new File("source.txt");
        File dest=new File("destination.txt");
        try{
        FileUtils.copyFile(src,dest);
        System.out.println("File copied successfully");
        }
        catch(IOException e)
        {
        System.err.println("Error occured"+e.getMessage());
        }
        
    }
}
