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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
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

	@Override
	public String toString() {
		return " El Libro"+titulo+" con ISBN:" + isbn + " creado por el autor "+autor+" tiene paginas=" + paginas + ".";
	}
	
	
}