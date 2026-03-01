import { Component } from '@angular/core';
import { Libro as LibroService } from '../../services/libro';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-libro',
  imports: [FormsModule, CommonModule],
  templateUrl: './libro.html',
  styleUrl: './libro.css',
})
export class Libro {
  constructor(public libroService: LibroService) { }

  ngOnInit(): void {
    this.getLibros();
  }
    getLibros() {
    this.libroService.getLibros().subscribe(
      res => {
        this.libroService.libros = res;
        console.log(this.libroService.libros);
      },
      err => console.log(err)
    );
  }
}
