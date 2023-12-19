import { TestBed } from '@angular/core/testing';

import { OwnerFunctionsService } from './owner-functions.service';

describe('OwnerFunctionsService', () => {
  let service: OwnerFunctionsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OwnerFunctionsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
