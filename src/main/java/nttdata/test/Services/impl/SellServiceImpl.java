package nttdata.test.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nttdata.test.Models.Sell;
import nttdata.test.Repositories.SellRepository;
import nttdata.test.Services.SellService;

@Service
public class SellServiceImpl implements SellService {

    @Autowired
    SellRepository service;

    @Override
    public Sell save(Sell sell) {
        return service.saveAndFlush(sell);
    }

}
