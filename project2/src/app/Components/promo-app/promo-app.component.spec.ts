import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PromoAppComponent } from './promo-app.component';

describe('PromoAppComponent', () => {
  let component: PromoAppComponent;
  let fixture: ComponentFixture<PromoAppComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PromoAppComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PromoAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
