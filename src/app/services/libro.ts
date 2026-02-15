import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class Libro {

  URL_API = 'http://localhost:8080/api/libro';

  constructor(private http: HttpClient) { }

  getLibros() {
    return this.http.get(this.URL_API);
  }
}
