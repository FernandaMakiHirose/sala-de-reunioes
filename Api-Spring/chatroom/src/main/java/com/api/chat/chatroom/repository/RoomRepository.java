package com.api.chat.chatroom.repository;

// importa o model
import com.api.chat.chatroom.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

// diz que é uma interface repository
import org.springframework.stereotype.Repository;

// o repository faz acesso ao banco de dados
@Repository

// a interface extende o repository do jpa, passando o Room e o Long (id)
public interface RoomRepository extends JpaRepository<Room, Long> {
}
