import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExcluirAnimalComponent } from './excluir-animal.component';

describe('EdicaoAnimalComponent', () => {
  let component: ExcluirAnimalComponent;
  let fixture: ComponentFixture<ExcluirAnimalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExcluirAnimalComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExcluirAnimalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
