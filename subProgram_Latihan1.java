package subProgram;
//step 1
import java.io.*;

public class subProgram_Latihan1 {
    public static int totalSPP; //variabel global (bisa dibaca semua blok program)
    public static void main(String[] args) {
        //step 3, declare buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        /*soal latihan 1:
            Buat suatu program untuk menghitung total SPP dalam beberapa jumlah semester
        */
        //step 2
        try {
            //logic program true
            do {
            //Deklarasi variabel
            String nim = null, nama = null;
            int jml_sem = 0;
            
            //Menu dg Switch-Case
            System.out.println("--------------------");
            System.out.println("1. Input Data");
            System.out.println("2. Output Data");
            System.out.println("3. Logout");
            System.out.println("--------------------");
            System.out.println("Pilih Menu : ");
            //inputan dg bufferedreader (tipe:int)
            int menu = Integer.parseInt(br.readLine());
            switch(menu) {
                case 1: //menu 1
                    System.out.print("Isi NIM : ");
                    //input br type String
                    nim = br.readLine();
                    System.out.print("Isi Nama : ");
                    //input br type String
                    nim = br.readLine();
                    System.out.print("Isi Semester yang sudah ditempuh : ");
                    jml_sem = Integer.parseInt(br.readLine());
           
                    //cara call function/fungsi
                    total_SPP(jml_sem);
                    //gunakan println jika di dalam fungsi tidak ada 
                    //System.out.println
                    System.out.println("Total SPP : " + total_SPP(jml_sem) + " Juta rupiah");
                    break; //program break
                case 2: //menu 2
                    //cetak data (nim, nama, jml semester, total spp)
                    System.out.println("NIM: " + nim);
                    System.out.println("Nama: " + nama);
                    System.out.println("Jumlah Semester: " + jml_sem);
                    break;
                default: //else
                    System.exit(0); //perintah keluar program
            }
            }while (true);
            
        } catch (Exception e) {
            //Jika ada yg salah akan catch
            System.out.println("Error adalah " + e.getMessage());
        }
        System.out.println(" ");
    }
    
    //Function
    static public int total_SPP(int sem) { //int smt --> parameter
            //nilai
                totalSPP = sem * 15000000;
                return totalSPP;
        }
    //Procedure
    static public void cetakData(){
       
        
     }
        
 }
        
        
