import { TestBed } from '@angular/core/testing';

import { LoginOwnerService } from './login-owner.service';

describe('LoginOwnerService', () => {
  let service: LoginOwnerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoginOwnerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
