import { Component, OnInit } from '@angular/core';
import { LoaderComponent } from './core/loader/loader.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'petcenter';
  loading!: typeof LoaderComponent;
  ngOnInit(): void {
  this.loading = LoaderComponent;
  }

}
