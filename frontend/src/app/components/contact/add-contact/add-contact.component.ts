import { Component, Input, OnInit } from '@angular/core';
import { Contact } from '../../../models/contact.model';
import { ContactService } from '../../../services/contacts.service';

@Component({
  selector: 'app-add-contact',
  templateUrl: './add-contact.component.html',
  styleUrl: './add-contact.component.css'
})
export class AddContactComponent implements OnInit {
  @Input() contact: Contact = new Contact();

  constructor(public contactService: ContactService) { }

  ngOnInit(): void {
  }

  saveContact() {
    if (this.contact.id) {
      this.contactService.updateContact(this.contact).subscribe(res =>{
        console.log(res);
        
      });
    } else {
      this.contactService.createContact(this.contact).subscribe(res =>{
        console.log(res);
        
      })
    }
  }
}
