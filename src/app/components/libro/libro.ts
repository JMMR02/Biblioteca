import { Component } from '@angular/core';
import { Libro as LibroService } from '../../services/libro';

@Component({
  selector: 'app-libro',
  imports: [],
  templateUrl: './libro.html',
  styleUrl: './libro.css',
})
export class Libro {
  constructor(private libroService: LibroService) { }

  ngOnInit(): void {
    this.libroService.getLibros().subscribe(
      res => console.log(res),
      err => console.log(err)
    );
  }
}
