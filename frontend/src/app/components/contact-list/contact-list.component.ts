import { Component, OnInit } from '@angular/core';
import { ContactService } from '../../services/contacts.service';
import { Contact } from '../../models/contact.model';
@Component({
  selector: 'app-contact-list',
  templateUrl: './contact-list.component.html',
  styleUrl: './contact-list.component.css'
})


export class ContactListComponent implements OnInit{
  contacts: Contact[] = [];

  constructor(private contactService: ContactService){

  }

  ngOnInit(): void {
    this.getContacts();
  }

  getContacts(): void {
    this.contactService.getContacts().subscribe(
      (data) => {
        this.contacts = data;      
      },
      (error) => {
        console.error('Error fetching contacts:', error);
      }
    );
  }
}
