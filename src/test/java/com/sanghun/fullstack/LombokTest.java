package com.sanghun.fullstack;

import com.sanghun.fullstack.domain.ResultVO;
import org.junit.jupiter.api.Test;

public class LombokTest {
    @Test
    public void ResultTest() {
        ResultVO result = new ResultVO(0, "hong");
        System.out.println(result);
    }
}
