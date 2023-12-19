import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminFunctionComponent } from './admin-functions.component';

describe('AdminFunctionComponent', () => {
  let component: AdminFunctionComponent;
  let fixture: ComponentFixture<AdminFunctionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminFunctionComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminFunctionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
