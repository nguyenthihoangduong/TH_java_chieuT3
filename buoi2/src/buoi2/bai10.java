/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai10 {
   public static void main(String[] args) throws Exception
    {
        String fileName="";
        File f = new File("");
        fileName = f.getAbsolutePath()+"\\src\\data.txt";
        f = new File(fileName);
        if(f.exists())
        {
            System.out.println("File da ton tai");
            System.exit(0);
        }
        //ghi du lieu vao file
        PrintWriter pw = new PrintWriter(f);
        pw.print("Coppyright by Duong Thanh Phet - ");
        pw.println(2015);
        pw.print("https://thayphet.net");
        pw.close();
        System.out.println("Da ghi file xong");
        //doc file
        Scanner inp = new Scanner(f);
        while(inp.hasNext())
        {
            String ten = inp.nextLine();
            System.out.print(ten+"");
            String maso = inp.nextLine();
            System.out.println(maso);
        }
    } 
}
