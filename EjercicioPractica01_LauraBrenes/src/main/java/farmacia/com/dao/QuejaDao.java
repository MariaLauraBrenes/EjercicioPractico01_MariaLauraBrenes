/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package farmacia.com.dao;

import farmacia.com.domain.Queja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuejaDao extends JpaRepository <Queja, Integer> {
    
}