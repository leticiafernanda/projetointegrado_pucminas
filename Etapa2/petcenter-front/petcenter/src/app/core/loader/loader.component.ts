import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-loader',
  templateUrl: './loader.component.html',
  styleUrls: ['./loader.component.scss'],
})
export class LoaderComponent implements OnInit {
  @Input() isLoading = false;
  @Input() size = 1;
  @Input() message: string | undefined;
  @Input() value = 100;
  @Input() diameter = 32;
  @Input() mode = 'indeterminate';
  @Input() strokeWidth = 5;
  @Input() overlay = false;
  @Input() color = 'primary';
  @Input() spinner = 'spinner';

  constructor() {}

  ngOnInit() {
    this.diameter = 32 * this.size;
  }
}
