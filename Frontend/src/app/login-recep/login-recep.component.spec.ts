import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginRecepComponent } from './login-recep.component';

describe('LoginRecepComponent', () => {
  let component: LoginRecepComponent;
  let fixture: ComponentFixture<LoginRecepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LoginRecepComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(LoginRecepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
