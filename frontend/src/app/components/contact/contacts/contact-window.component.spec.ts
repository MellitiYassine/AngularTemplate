import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContactsWindowComponent } from './contact-window.component';

describe('ContactsComponent', () => {
  let component: ContactsWindowComponent;
  let fixture: ComponentFixture<ContactsWindowComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ContactsWindowComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ContactsWindowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
