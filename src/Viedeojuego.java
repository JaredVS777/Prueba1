public class Viedeojuego {
    //Atributos
    String nombre;
    String idioma;
    int anio;
    String tipo_juego;
    String premios;

    //Constructor que inicializan los objetos

    public Viedeojuego(String nombre, String idioma, int anio, String tipo_juego, String premios) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.anio = anio;
        this.tipo_juego = tipo_juego;
        this.premios = premios;
    }

    //Metodos

    //METODO GET Y SET NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //METODO GET Y SET IDIOMA

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    //METODO GET Y SET ANIO

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //METODO GET Y SET TIPO_JUEGO
    public String getTipo_juego() {
        return tipo_juego;
    }

    public void setTipo_juego(String tipo_juego) {
        this.tipo_juego = tipo_juego;
    }
    //METODO GET Y SET PREMIOS

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }
}
