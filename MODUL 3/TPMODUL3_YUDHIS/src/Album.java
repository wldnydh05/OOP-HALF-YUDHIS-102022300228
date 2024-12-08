public class Album {
    private String judul;
    private String artis;
    private int total;
    private int rented;

    public Album(String judul, String artis, int total, int rented) {
        this.judul = judul;
        this.artis = artis;
        this.total = total;
        this.rented = rented;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRented() {
        return rented;
    }

    public void setRented(int rented) {
        this.rented = rented;
    }
}
