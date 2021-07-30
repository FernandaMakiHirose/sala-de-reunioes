import { RoomService } from '../room.service';
import { Room } from '../room';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-room',
  templateUrl: './create-room.component.html',
  styleUrls: ['./create-room.component.css']
})
export class CreateRoomComponent implements OnInit {

  // instância do room
  room: Room = new Room();
  submitted = false;

  constructor(private roomService: RoomService,
    private router: Router) { }

  ngOnInit() {
  }

  // cria a sala
  newRoom(): void {
    this.submitted = false;
    this.room = new Room();
  }

  // vai salvar a sala
  save() {
    this.roomService.createRoom(this.room)
      .subscribe(data => console.log(data), error => console.log(error));
    this.room = new Room();
    this.gotoList();
  }

  // se for submitted vai salvar
  onSubmit() {
    this.submitted = true;
    this.save();
  }

  // a rota para ir para a lista
  gotoList() {
    this.router.navigate(['/rooms']);
  }
}
