
package pertemuan301;

import java.util.Scanner;

/**
 *
 * @author Rambu intan
 * tgl 22 Maret 2025
 */
public class Pertemuan301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aw = 0;
        Scanner dtIN = new Scanner(System.in);
        System.out.print ("Nilai Awal:");
        aw = Integer.parseInt(dtIN.nextLine () );
        
        
        int awal = aw;
        int akhir = 10;
        System.out.print ("Nilai Awal:");
        akhir = Integer.parseInt(dtIN.nextLine() );
        
        System.out.println("Pertualangan While");
        while(awal<akhir){
            System.out.println("Pertemuan ke-" +awal);
            awal++; //awal=awal+1
        }
        System.out.println("Pertualangan do .. wheli");
        awal = 10;
        do{
            System.out.println("Pertualangan ke-"+awal);
            awal++;
        }while(awal<akhir);
        
         System.out.println("Pertualangan For");
         for(awal=0;awal<akhir;awal++){
             System.out.println("Pertualagan ke-"+awal);
        
        }
    }
    
}
