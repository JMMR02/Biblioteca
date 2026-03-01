export interface Libro {
  idLibro: number;
  titulo: string;
  isbn: string;

  categoria: {
    idCategoria: number;
    nombre: string;
  };

  autor: {
    idAutor: number;
    nombre: string;
    nacionalidad?: string;
  };
}