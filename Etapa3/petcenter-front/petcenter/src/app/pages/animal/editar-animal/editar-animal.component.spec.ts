import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarAnimalComponent } from './editar-animal.component';

describe('EdicaoAnimalComponent', () => {
  let component: EditarAnimalComponent;
  let fixture: ComponentFixture<EditarAnimalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditarAnimalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditarAnimalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
