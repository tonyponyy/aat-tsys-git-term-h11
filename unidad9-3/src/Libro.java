public class Libro{
	
    protected String isbn;
    protected int paginas;
    protected String titulo;
    protected String autor;
    
	public Libro() {
		this.isbn = "";
		this.paginas = 0;
		this.titulo = "";
		this.autor = "";
	}
	
	public Libro (String titulo, int pag, String tit, String autor) {
		this.titulo = titulo;
		this.paginas = pag;
		this.titulo = tit;
		this.autor = autor;
	}
	
}