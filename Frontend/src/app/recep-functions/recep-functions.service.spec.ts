import { TestBed } from '@angular/core/testing';

import { RecepFunctionsService } from './recep-functions.service';

describe('RecepFunctionsService', () => {
  let service: RecepFunctionsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RecepFunctionsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
