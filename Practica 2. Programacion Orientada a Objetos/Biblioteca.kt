/*
* Diseña un sistema de gestión de biblioteca
* autor: Diego Johann Humpiri Vargas
* fecha creación: 29 Marzo 2024
* fecha última modificación: 29 Marzo 2024
*/
abstract class Material (
        var titulo: String = "",
        var autor: String = "",
        var anioPublicacion: Int = 0,
    ) {
    abstract fun mostrarDetalle()
}
class Libro (
        titulo: String,
        autor: String,
        anioPublicacion: Int,
        var genero: String = "Sin género",
        var numeroPaginas: Int = 0
): Material(titulo, autor, anioPublicacion) {
    override fun mostrarDetalle() {
        println("======= Detalles del Libro =======")
        println("Título del Libro: ${this.titulo}")
        println("Autor: ${this.autor}")
        println("Año de publicación: ${this.anioPublicacion}")
        println("Género: ${this.genero}")
        println("Número de páginas: ${this.numeroPaginas}")
    }
}
class Revista (
    titulo: String,
    autor: String,
    anioPublicacion: Int,
    var issn: String = "",
    var volumen: Int = 1,
    var numero: Int = 1,
    var editorial: String = "Sin Editorial"
): Material(titulo, autor, anioPublicacion) {
    override fun mostrarDetalle() {
        println("======= Detalles de la Revista =======")
        println("Título del Libro: ${this.titulo}")
        println("Autor: ${this.autor}")
        println("Año de publicación: ${this.anioPublicacion}")
        println("ISSN: ${this.issn}")
        println("Volumen número: ${this.volumen}")
        println("Número: ${this.numero}")
        println("Editorial: ${this.editorial}")
    }
}
fun main() {
    var librote = Libro(
        "Harry Potter y el príncipe mestizo",
        "J. K. Rowling",
        2001,
        "Fantasía",
        251
    )
    librote.mostrarDetalle()
    var revista = Revista(
        "PC World",
        "Computers Inc.",
        2010,
        "942-5424-5343222-01",
        1,
        4,
        "Condorito Impresiones"

    )
    revista.mostrarDetalle()
}