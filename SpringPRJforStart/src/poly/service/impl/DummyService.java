package poly.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import poly.service.IDummyService;

@Service("DummyService")
public class DummyService implements IDummyService {

    // 로그 파일 생성 및 로그 출력을 위한 log4j 프레임워크의 자바 객체
    private final Logger log = Logger.getLogger(this.getClass());

}
