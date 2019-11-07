/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan60.akatsuki;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Akatsuki

 */
public class IF110118028Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("AKATSUKI");
        
        //Petinggi 
        System.out.println("\nPetinggi Akatsuki");
        PetinggiAkatsuki pAkatsuki = new PetinggiAkatsuki();
        pAkatsuki.TampilNama();
        pAkatsuki.asalDesa();
        pAkatsuki.kekuatan();
        pAkatsuki.jutsuSpecial();
        pAkatsuki.penampilan();
        System.out.println();
        
        //Team Kakuzu
        System.out.println("Team Kakuzu");
        TeamKakuzu tKakuzu = new TeamKakuzu();
        System.out.println();
        
        //Team Itachi
        System.out.println("Team Itachi");
        TeamItachi tItachi = new TeamItachi();
        System.out.println();
        
        //Team Sasori
        System.out.println("Team Sasori");
        TeamSasori tSasori = new TeamSasori();
        System.out.println();
        
        //Team Pain
        System.out.println("Team Pain");
        TeamPain tPain = new TeamPain();
    }
    
}
