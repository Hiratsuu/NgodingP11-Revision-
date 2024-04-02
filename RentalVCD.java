import javax.swing.JOptionPane;
import VCD.*;

public class RentalVCD extends VCDStock{
    public static void main (String []args ){
        System.out.println("Tugas Modul Inheritance");
        System.out.println("====================================================");
        RentalVCD ob = new RentalVCD();
        String judul, aktor, sutradara, publisher, kategori, stok;

        String input = JOptionPane.showInputDialog("Masukkan Jumlah VCD yang ingin di Entrikan :");
        int JumlahVCD = Integer.parseInt(input);
        for (int i = 0 ; i < JumlahVCD; i++){

            JOptionPane.showMessageDialog(null, "Entri data VCD" + (i+1));
            System.out.println("Data VCD ke " + (i+1));
            
            judul = JOptionPane.showInputDialog("Judul : ");
            ob.setJudul(judul);
            ob.tampil("Judul Film : " + ob.getJudul());

            aktor = JOptionPane.showInputDialog("Aktor : ");
            ob.setAktor(aktor);
            ob.tampil("Aktor : " + ob.getAktor());

            sutradara = JOptionPane.showInputDialog("Sutradara : ");
            ob.setSutradara(sutradara);
            ob.tampil("Sutradara : " + ob.getSutradara());

            publisher = JOptionPane.showInputDialog("Publisher : ");
            ob.setPublisher(publisher);
            ob.tampil("Publisher : " + ob.getPublisher());

            kategori = JOptionPane.showInputDialog("Kategori (SU/D/R/A): ");
            ob.setKategori(kategori);
            ob.tampil("Kategori : " + ob.getKategori());

            stok = JOptionPane.showInputDialog("Stok : ");
            ob.setStok(stok);
            ob.tampil("Stok : " +ob.getStok());

            ob.hapus();
            judul = null;
            aktor = null;
            sutradara = null;
            publisher = null;
            kategori = null;
            stok = null;

            System.out.println("====================================================");
            }

        ob = null;
        System.exit(0);


    }
}