import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecepFunctionsComponent } from './recep-functions.component';

describe('RecepFunctionsComponent', () => {
  let component: RecepFunctionsComponent;
  let fixture: ComponentFixture<RecepFunctionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [RecepFunctionsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(RecepFunctionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
