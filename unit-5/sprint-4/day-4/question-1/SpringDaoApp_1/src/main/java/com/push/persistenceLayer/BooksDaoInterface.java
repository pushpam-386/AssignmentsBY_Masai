package com.push.persistenceLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksDaoInterface extends JpaRepository<Books,Integer>{

}
