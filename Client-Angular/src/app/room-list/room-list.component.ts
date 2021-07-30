import { RoomDetailsComponent } from 'src/app/room-details/room-details.component';
import { Observable } from "rxjs";
import { RoomService } from "../room.service";
import { Room } from "../room";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';

@Component({
  selector: "app-room-list",
  templateUrl: "./room-list.component.html",
  styleUrls: ["./room-list.component.css"]
})
export class RoomListComponent implements OnInit {
  rooms: Observable<Room[]>;

  constructor(private roomService: RoomService,
    private router: Router) {}

  // inicializa o componente, define e exibe suas propriedades de entrada.
  ngOnInit() {
    this.reloadData();
  }

  // pega a lista de rooms
  reloadData() {
    this.rooms = this.roomService.getRoomsList();
  }

  // deleta o room
  deleteRoom(id: number) {
    this.roomService.deleteRoom(id)
      .subscribe(
        // retorna a data
        data => {
          console.log(data);
          this.reloadData();
        }, // retorna o erro
        error => console.log(error));
  }

  // navega pela rota details
  roomDetails(id: number){
    this.router.navigate(['details', id]);
  }

  // navega pela rota update
  updateRoom(id: number){
    this.router.navigate(['update', id]);
  }
}
