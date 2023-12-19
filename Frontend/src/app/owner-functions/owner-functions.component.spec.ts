import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OwnerFunctionsComponent } from './owner-functions.component';

describe('OwnerFunctionsComponent', () => {
  let component: OwnerFunctionsComponent;
  let fixture: ComponentFixture<OwnerFunctionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [OwnerFunctionsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(OwnerFunctionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
