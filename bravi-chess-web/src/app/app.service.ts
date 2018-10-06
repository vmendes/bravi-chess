import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../environments/environment';

@Injectable()
export class AppService {
  
  apiUrl: string = environment.config.apiUrl;
  
  constructor(private http: HttpClient) { }
  
  getPositions(position: string) {
	console.log(position);
    return this.http.get<string[]>(this.apiUrl + 'knight/possible-moves?position=' + position);
  }

  changeBoard(rows: number, columns: number) {
    return this.http.post(this.apiUrl + 'config/board?rows=' + rows + '&columns=' + columns, {});
  }

}