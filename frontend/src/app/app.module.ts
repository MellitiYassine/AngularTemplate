import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { provideHttpClient } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AvatarModule } from 'primeng/avatar';
import { AvatarGroupModule } from 'primeng/avatargroup';
import { BadgeModule } from 'primeng/badge';
import { ButtonModule } from 'primeng/button';
import { CalendarModule } from 'primeng/calendar';
import { DividerModule } from 'primeng/divider';
import { DropdownModule } from 'primeng/dropdown';
import { IconFieldModule } from 'primeng/iconfield';
import { InputIconModule } from 'primeng/inputicon';
import { MenuModule } from 'primeng/menu';
import { MenubarModule } from 'primeng/menubar';
import { OverlayModule } from 'primeng/overlay';
import { OverlayPanelModule } from 'primeng/overlaypanel';
import { RippleModule } from 'primeng/ripple';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddContactComponent } from './components/contact/add-contact/add-contact.component';
import { ContactListComponent } from './components/contact/contact-list/contact-list.component';
import { ContactsWindowComponent } from './components/contact/contacts/contact-window.component';
import { MainContentComponent } from './components/home/main-content/main-content.component';
import { MenuBarComponent } from './components/home/menu-bar/menu-bar.component';
import { SideBarComponent } from './components/home/side-bar/side-bar.component';
import { DialogModule } from 'primeng/dialog';

@NgModule({
  declarations: [
    AppComponent,
    MenuBarComponent,
    SideBarComponent,
    MainContentComponent,
    ContactsWindowComponent,
    ContactListComponent,
    AddContactComponent,
    ContactListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ButtonModule,
    BrowserAnimationsModule,
    CalendarModule,
    FormsModule,
    MenubarModule,
    AvatarModule,
    AvatarGroupModule,
    BadgeModule,
    DropdownModule,
    OverlayModule,
    OverlayPanelModule,
    InputIconModule,
    IconFieldModule,
    RippleModule,
    MenuModule,
    DividerModule,
    DialogModule
  ],
  providers: [provideHttpClient()],
  bootstrap: [AppComponent]
})
export class AppModule { }
