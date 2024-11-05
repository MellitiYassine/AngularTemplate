import { Component, Input, OnInit } from '@angular/core';
import { Contact } from '../../models/contact.model';

@Component({
  selector: 'app-contacts',
  templateUrl: './contacts.component.html',
  styleUrl: './contacts.component.css'
})

export class ContactsComponent implements OnInit{
  @Input() contact : any;

  
  ngOnInit(): void {
    console.log(this.contact);
    
  }
  
}
