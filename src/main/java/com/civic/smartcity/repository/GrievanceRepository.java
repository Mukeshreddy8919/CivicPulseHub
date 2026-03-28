package com.civic.smartcity.repository;

import com.civic.smartcity.model.Grievance;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1ea566780bdb2cdcc89e7693369acbc373719565
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;

public interface GrievanceRepository extends JpaRepository<Grievance, Long>, JpaSpecificationExecutor<Grievance> {
<<<<<<< HEAD
=======
=======
import java.util.List;

public interface GrievanceRepository extends JpaRepository<Grievance, Long> {
>>>>>>> c67173eb40a99dddb9e093279aabe9e9827ecb1b
>>>>>>> 1ea566780bdb2cdcc89e7693369acbc373719565
    List<Grievance> findByCitizenUsernameOrderBySubmittedAtDesc(String citizenUsername);
    List<Grievance> findAllByOrderBySubmittedAtDesc();
    List<Grievance> findByStatusOrderBySubmittedAtDesc(String status);
    List<Grievance> findByAssignedOfficerOrderBySubmittedAtDesc(String officer);
}
