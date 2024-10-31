/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package farmacia.com.Service;

import farmacia.com.domain.Queja;
import java.util.List;

public interface QuejaService {
   
    public List<Queja> getQuejas();
    
   
    public Queja getQueja(Queja queja);
    
   
    public void save(Queja queja);
    

    public void delete(Queja queja);
    }