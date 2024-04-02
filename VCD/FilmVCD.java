package VCD;

public class FilmVCD{
    private String judul, aktor, sutradara, publisher, kategori;
    protected String namaClass = "FilmVCD";
    protected void setJudul(String judul){
        this.judul =judul;
        judul = null;
    }
    protected String getJudul(){
        return judul;
    }
    protected void setAktor (String aktor){
        this.aktor = aktor;
        aktor = null;
    }
    protected String getAktor (){
        return aktor;
    }
    protected void setSutradara (String sutradara){
        this.sutradara = sutradara;
        sutradara = null;
    }
    protected String getSutradara(){
        return sutradara;
    }
    protected void setPublisher (String publisher){
        this.publisher = publisher;
        publisher  = null;
    }
    protected String getPublisher(){
        return publisher;
    }
    protected void setKategori(String kategori){
        this.kategori = kategori;
        kategori = null;
    }
    protected String getKategori(){
        return kategori;
    }
    protected void tampil(String a){
        System.out.println(a);
        a = null;
    }
    protected String keterangan(){
        return("ini adalah class " + namaClass);
    }
    protected void hapus(){
        judul = null;
        aktor = null;
        sutradara = null;
        publisher = null;
        kategori = null;
        namaClass = null;
    }
}