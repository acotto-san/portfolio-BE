
package com.miportfolio.argProgramaBackend.Repository;

import com.miportfolio.argProgramaBackend.Modelo.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculumRepository extends JpaRepository<Curriculum, Long>{
    
}
