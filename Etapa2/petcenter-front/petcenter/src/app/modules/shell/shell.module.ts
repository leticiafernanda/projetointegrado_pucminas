import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

import { ShellComponent } from './shell.component';
import { HeaderComponent } from './header/header.component';
import { ContentComponent } from './content/content.component';
import { FooterComponent } from './footer/footer.component';
import { MaterialModule } from 'src/app/material.module';

@NgModule({
  imports: [
    CommonModule,    
    RouterModule,   
    MaterialModule
    

  ],
  declarations: [      
    HeaderComponent,
    ContentComponent,
    FooterComponent
  ],
})
export class ShellModule {}
