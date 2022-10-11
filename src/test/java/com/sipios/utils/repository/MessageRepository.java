package com.sipios.utils.repository;

import com.sipios.utils.entity.Message;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    @EntityGraph(attributePaths = {"author"})
    List<Message> getAllBy();
}
