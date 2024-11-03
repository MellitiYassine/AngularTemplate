import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrl: './menu-bar.component.css'
})
export class MenuBarComponent implements OnInit {
  items: MenuItem[] | undefined;
  countries: any[] | undefined;

  selectedCountry: { name: string, code: string } = {
    name: 'English',
    code: 'GB'
  };

  ngOnInit() {
    this.items = [
      {
        label: 'Apps',

      },
      {
        label: 'Chat',
      },
      {
        label: 'Calendar',
      },
      {
        label: 'Email',
      }
    ]

    this.countries = [
      { name: 'English', code: 'GB' },
      { name: 'French', code: 'FR' },
      { name: 'German', code: 'DE' },
      { name: 'Chineese', code: 'CN' }
    ]
  }

}