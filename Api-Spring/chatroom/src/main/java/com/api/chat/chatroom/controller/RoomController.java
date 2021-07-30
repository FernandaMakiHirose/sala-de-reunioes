package com.api.chat.chatroom.controller;

import com.api.chat.chatroom.exception.ResourceNotFoundException;
import com.api.chat.chatroom.model.Room;
import com.api.chat.chatroom.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

// cria controladores Restful
@RestController

// marca o método ou tipo anotado como permitindo solicitações de origem cruzada
@CrossOrigin(origins = "http://localhost:4200")

// mapeia solicitações HTTP para métodos de tratamento de controladores MVC e REST
@RequestMapping("/api/v1")
public class RoomController {

    // a anotação fornece um controle mais refinado sobre onde e como a fiação automática deve ser realizada
    @Autowired
    private RoomRepository roomRepository;

    // mapeia solicitações HTTP GET para métodos de tratamento específicos.
    @GetMapping("/rooms")
    public List<Room> getAllRooms() {
        // vai encontrar todos os room
        return roomRepository.findAll();
    }

    @GetMapping("/rooms/{id}")
    // pega o room pelo id
    public ResponseEntity<Room> getRoomById(@PathVariable(value = "id") long roomId)
        throws ResourceNotFoundException {

        // vai encontrar por id
            Room room = roomRepository.findById(roomId)
                    // se lançar exeção vai lançar uma mensagem
                    .orElseThrow(() -> new ResourceNotFoundException("Room not found::"+roomId));
            return ResponseEntity.ok().body(room);
    }

    // vai validar se o json é válido, se for válido vai salvar
    @PostMapping("/rooms")
    public Room createRoom(@Valid @RequestBody Room room) {
        return roomRepository.save(room);
    }

    // vai fazer update
    @PutMapping("rooms/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable(value = "id") Long roomId,
                                           @Valid @RequestBody Room roomDetails)
        throws ResourceNotFoundException {

        // chama o id
        Room room = roomRepository.findById(roomId)
                // resposta da exceção
                .orElseThrow(() -> new ResourceNotFoundException("Room not found for this id::"+roomId));
        // adiciona e recebe valores
        room.setName(roomDetails.getName());
        room.setDate(roomDetails.getDate());
        room.setStartHour(roomDetails.getStartHour());
        room.setEndHour(roomDetails.getEndHour());

        // retorna o roomRepository
        final Room updateRoom = roomRepository.save(room);
        return ResponseEntity.ok(updateRoom);
    }

    // deleta um room
    @DeleteMapping("/rooms/{id}")
    public Map<String, Boolean> deleteRoom(@PathVariable(value = "id") Long roomId)
        throws ResourceNotFoundException {

        Room room = roomRepository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFoundException("Room not found for this id::"+roomId));
        roomRepository.delete(room);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
