package org.helmo.HolyD.repositories;

import org.helmo.HolyD.domains.entities.DocumentEntity;
import org.helmo.HolyD.domains.entities.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {

}