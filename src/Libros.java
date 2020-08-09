
public class Libros {
	private int codigo;
	private String titulo; String autor;
	private double precio;
	private int cantidadExis; int libroCant; int respuesta;
	

	public Libros(int codigo, String titulo, String autor, double precio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public double getPrecio() {
		return precio;
	}


	public int getCantidadExis() {
		return cantidadExis;
	}


	public void setCantidadExis(int cantidadExis) {
		this.cantidadExis = cantidadExis;
	}


	public int getLibroCant() {
		return libroCant;
	}


	public void setLibroCant(int libroCant) {
		this.libroCant = libroCant;
	}


	public int getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}
	

	@Override
	public String toString() {
		return "Libros [CÓDIGO: " + codigo + " -- TÍTULO: " + titulo + " -- AUTOR: " + autor + " -- PRECIO: " + precio +"$" + "]";
	}
	
}
