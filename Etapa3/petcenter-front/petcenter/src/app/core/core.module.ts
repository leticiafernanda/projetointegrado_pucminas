import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RouterModule } from "@angular/router";
import { NavbarComponent } from "./navbar/navbar.component";
import { MaterialModule } from "../material.module";
import { NavbarMenuComponent } from "./navbar-menu/navbar-menu.component";
import { LoaderComponent } from "./loader/loader.component";
import { NgHttpLoaderModule } from "ng-http-loader";

@NgModule({
  declarations: [LoaderComponent,NavbarComponent,NavbarMenuComponent],
  imports: [CommonModule, MaterialModule,RouterModule,NgHttpLoaderModule ],
  exports: [LoaderComponent,NavbarComponent,NavbarMenuComponent ]
})
export class CoreModule {}
