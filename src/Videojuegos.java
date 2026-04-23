public class Videojuegos implements Entregable {

    public String titulo;
    public int horas = 10;
    public boolean entregado = false;
    public String genero;
    public String companhia;

    // Constructor por defecto
    public Videojuegos() {
        this.titulo = "";
        this.horas = 10;
        this.entregado = false;
        this.genero = "";
        this.companhia = "";
    }

    // Constructor con título y horas estimadas
    public Videojuegos(String titulo, int horas) {
        this.titulo = titulo;   // <- corregido
        this.horas = horas;     // <- corregido
        this.entregado = false;
        this.genero = "";
        this.companhia = "";
    }

    // Constructor con todos los atributos excepto entregado
    public Videojuegos(String titulo, int horas, String genero, String companhia) {
        this.titulo = titulo;      // <- corregido
        this.horas = horas;        // <- corregido
        this.genero = genero;      // <- corregido
        this.companhia = companhia;// <- corregido
        this.entregado = false;
    }

    // Getters y setters excepto entregado
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public void entregar() {
        this.entregado = true;
    }

    @Override
    public boolean devolver() {
        return this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuegos otro = (Videojuegos) a;

        if (this.horas > otro.horas) return 1;
        if (this.horas < otro.horas) return -1;
        return 0;
    }

    //                  toString
    @Override
    public String toString() {
        return "Videojuegos [titulo=" + titulo + ", horas=" + horas + ", entregado=" + entregado + ", genero="
                + genero + ", companhia=" + companhia + "]";
    }

	@Override
	public boolean entregado() {
		// TODO Auto-generated method stub
		return false;
	}
}
