package com.fastcampus.kotlinjava.keyword;

import java.io.InputStream;

public class JavaKeyword {

    private InputStream in;

    private Boolean is;


    public InputStream getIn() {
        return in;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }

    public Boolean getIs() {
        return is;
    }

    public void setIs(Boolean is) {
        this.is = is;
    }
}

enum CountryCodeJava {
    kr, jp, us;  // do는 do~while문의 예약어이기 때문에 컴파일 에러 발생
}
