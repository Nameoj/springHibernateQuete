package com.quetewildcodeschool.example.springHibernateQuete.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quetewildcodeschool.example.springHibernateQuete.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

}
