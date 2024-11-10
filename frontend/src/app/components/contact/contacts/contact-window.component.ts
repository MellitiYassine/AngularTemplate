import { Component, Input, OnInit } from '@angular/core';
import { ContactService } from '../../../services/contacts.service';

@Component({
  selector: 'app-contacts',
  templateUrl: './contact-window.component.html',
  styleUrl: './contact-window.component.css'
})

export class ContactsWindowComponent implements OnInit{
  @Input() contact : any;
  visible: boolean = false;

  constructor(public contactService: ContactService){

  }
  
  ngOnInit(): void {
    console.log(this.contact);
    
  }

  delete(){
    this.contactService.deleteContact(this.contact.id).subscribe(res =>{
      console.log(res);
      
    })
  }

  edit(){
    this.visible = !this.visible
  }
  
}
