public class Serie implements Entregable {

	public String titulo;
	public int temporada = 3;
	public boolean entregado = false;
	public String genero;
	public String creador;
	
	//Constructor por defecto
	public Serie() {
		this.titulo = null;
		this.temporada = 3;
		this.entregado = false;
		this.genero = null;
		this.creador = null;
	}
	
	//Constructor con el título y el creador	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	//Constructor con todos los atributos menos entrega
	public Serie(String titulo, int temporada, String genero, String creador) {
		this.titulo = titulo;
		this.temporada = temporada;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporada=" + temporada + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	@Override
	public boolean entregado() {
		return false;
	}

	@Override
	public boolean devolver() {
		return false;
	}

	@Override
	public boolean isEntregado() {
		return false;
	}
	public int compareTo(Object a) {
	    Serie otra = (Serie) a; // Casting

	    if (this.temporada > otra.temporada) return 1;
	    if (this.temporada < otra.temporada) return -1;
	    return 0;
	}

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
	}
}
