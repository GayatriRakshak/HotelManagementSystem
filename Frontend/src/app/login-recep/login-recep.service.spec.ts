import { TestBed } from '@angular/core/testing';

import { LoginRecepService } from './login-recep.service';

describe('LoginRecepService', () => {
  let service: LoginRecepService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoginRecepService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
