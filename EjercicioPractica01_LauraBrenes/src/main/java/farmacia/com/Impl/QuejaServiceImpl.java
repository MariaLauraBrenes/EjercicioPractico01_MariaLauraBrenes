/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.com.Impl;

import farmacia.com.dao.QuejaDao;
import farmacia.com.domain.Queja;
import farmacia.com.Service.QuejaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class QuejaServiceImpl implements QuejaService {
    
    @Autowired
    private QuejaDao quejaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Queja> getQuejas() {
        var lista=quejaDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional (readOnly = true)
    public Queja getQueja(Queja queja) {
        return quejaDao.findById(queja.getIdQueja()).orElse(null);
    }
    @Override
    @Transactional
    public void save(Queja queja) {
         quejaDao.save(queja);
    }
    @Override
    @Transactional
    public void delete(Queja queja) {
        quejaDao.delete(queja);
    }

}