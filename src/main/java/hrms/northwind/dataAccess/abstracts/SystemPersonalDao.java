package hrms.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.entities.concretes.SystemPersonal;

public interface SystemPersonalDao extends JpaRepository <SystemPersonal,Integer> {

}
