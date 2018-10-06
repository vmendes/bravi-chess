import { Component, OnInit } from '@angular/core';
import { AppService} from "./app.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'bravi-chess-web';
  
  nRows = 8;
  nCols = 8;
  
  rows = [];
  columns = [];
  
  currentKnight: string = '';
  currentBoxes: string[] = [];
  
  constructor(private service: AppService) { }
  
  ngOnInit() {
	this.refreshBoard();
  }
  
  onClickBox(position: string) {
	this.currentKnight = position;
	this.service.getPositions(position).subscribe( data => {
        console.log(data);
		this.currentBoxes = data;
      });
  }
  
  onChangeBoard() {
	  this.service.changeBoard(this.nRows, this.nCols).subscribe( data => {
        this.refreshBoard();
      });
  }
  
  private refreshBoard() {
	this.rows = [];
	for (let i = 1; i <= this.nRows; i++) {
		this.rows.push("" + i);
	  
	}
	this.columns = [];
	for (let i = 0; i < this.nCols; i++) {
		this.columns.push(String.fromCharCode(i + 65));
	}
	this.currentKnight = '';
    this.currentBoxes = [];
  }
}
