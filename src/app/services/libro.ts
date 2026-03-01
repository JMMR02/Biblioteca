import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Libro as LibroModel } from '../models/libro';

@Injectable({
  providedIn: 'root',
})
export class Libro {

  URL_API = 'http://localhost:8080/api/libro';

  constructor(private http: HttpClient) { }
    libros : LibroModel[] = [];

  getLibros() {
    return this.http.get<LibroModel[]>(this.URL_API);
  }
}
