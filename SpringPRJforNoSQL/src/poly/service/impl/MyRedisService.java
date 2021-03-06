package poly.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import poly.persistance.redis.IMyRedisMapper;
import poly.service.IMyRedisService;

import javax.annotation.Resource;

@Service("MyRedisService")
public class MyRedisService implements IMyRedisService {

    @Resource(name = "MyRedisMapper")
    private IMyRedisMapper myRedisMapper;

    private Logger log = Logger.getLogger(this.getClass());

    @Override
    public void doSaveData() throws Exception {

        log.info(this.getClass().getName() + ".doSaveData start");

        myRedisMapper.doSaveData();

        log.info(this.getClass().getName() + ".doSaveData end");

    }

    @Override
    public void doSaveDataforList() throws Exception {

        log.info(this.getClass().getName() + ".doSaveDataforList Start!");

        myRedisMapper.doSaveDataforList();

        log.info(this.getClass().getName() + ".doSaveDataforList End!");

    }

    @Override
    public void doSaveDataforListJSON() throws Exception {

        log.info(this.getClass().getName() + ".doSaveDataforListJSON Start!");

        myRedisMapper.doSaveDataforListJSON();

        log.info(this.getClass().getName() + ".doSaveDataforListJSON End!");

    }

    @Override
    public void doSaveDataforHashTable() throws Exception {

        log.info(this.getClass().getName() + ".doSaveDataforHashTable Start!");

        myRedisMapper.doSaveDataforHashTable();

        log.info(this.getClass().getName() + ".doSaveDataforHashTable End!");

    }

    @Override
    public void doSaveDataforSet() throws Exception {

        log.info(this.getClass().getName() + ".doSaveDataforSet Start!");

        myRedisMapper.doSaveDataforSet();

        log.info(this.getClass().getName() + ".doSaveDataforSet End!");

    }

    @Override
    public void doSaveDataforZSet() throws Exception {

        log.info(this.getClass().getName() + ".doSaveDataforZSet Start!");

        myRedisMapper.doSaveDataforZSet();

        log.info(this.getClass().getName() + ".doSaveDataforZSet End!");

    }
}
