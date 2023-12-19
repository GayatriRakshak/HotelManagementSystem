import { TestBed } from '@angular/core/testing';

import { AdminFunctionsService } from './admin-functions.service';

describe('AdminFunctionsService', () => {
  let service: AdminFunctionsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminFunctionsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
