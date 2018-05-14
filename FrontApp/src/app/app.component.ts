import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  liczba: Number = 0;
  resArray: Array<number> = [];
  avg: Number = 0;
  constructor(private http: HttpClient) {
 
  }
  genUrl = 'http://localhost:8080/Random?count=';
  avgUrl='http://localhost:8080/AVG?list=';
 
  generate=function() {
    return this.http.get(this.genUrl + this.liczba).subscribe(
      res => {
        console.table(res);
		this.resArray = res;
      },
      err => {
        console.error(err);
        alert(err);
      }
    );
  }
  countAVG=function(){
	    return this.http.get(this.avgUrl + this.resArray).subscribe(
      res => {
        console.table(res);
		this.avg = res;
      },
      err => {
        console.error(err);
        alert(err);
      }
    );
  
  }
}