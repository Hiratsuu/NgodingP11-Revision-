package VCD;

public class VCDStock extends FilmVCD{
    private long stok;
    protected String namaCLass = "VCD";

    protected void setStok (String stok){
        this.stok = Long.parseLong(stok);
        stok = null;
    }
    protected long getStok (){
        return stok;
    }
    protected String keterangan(){
        return (namaClass + " : ini adalah class" + namaClass);
    }
    public String keterangan_String(){
        return super.namaClass+ " : "+super.keterangan();
    }
    protected void hapus(){
        stok = 0;
        super.hapus();
    }
}
