public class Carrusel05Java {

    private String titulo;
    private String subtitulo;

    public Carrusel05Java(String titulo, String subtitulo, String picaddress) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.picaddress = picaddress;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getPicaddress() {
        return picaddress;
    }

    public void setPicaddress(String picaddress) {
        this.picaddress = picaddress;
    }

    private String picaddress;

}
