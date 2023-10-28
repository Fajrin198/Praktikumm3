/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author MY ASUS
 */
public class GeneratorProgram {
    public static void main(String[] args) {
        try {
            for (int j = 1; j <= 20; j++) {
                String namaClass = "Main"+j;
                StringBuffer sb = new StringBuffer();
                sb.append("import Nomor1.*;\n\n");
                sb.append("public class "+namaClass+" {\n");
                sb.append("public static void main(String[] args){\n");

                String[] tipeData = {"Anjing","Ayam","Bebek","BelahKetupat","Burung","Harimau","JajarGenjang",
                "Kucing","Kuda","LayangLayang","Lingkaran","Mobil","Monyet","Motor","Panda","Persegi","PersegiPanjang",
                "Segitiga","Singa","Trapesium"};
                for (int i = 0; i < 30; i++) {
                    int indexTD = i%tipeData.length;
                    sb.append("\t"+tipeData[indexTD]+" object"+(i+1)+" = new "+tipeData[indexTD]+"();\n");
                }
                sb.append("\t}");
                sb.append("}");
                File f = new File("src/Nomor2/"+namaClass+".java");
                Files.writeString(f.toPath(), sb.toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
