package com.lionst52.basic.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Description:
 *
 * @author 52 [wujian]
 * <p>
 * Date: 2020/03/18
 * <p>
 * Time: 14:53
 */
class LionstTest {
    private static final Logger log = Logger.getLogger(LionstTest.class.getName());

    @BeforeEach
    void beforeEachTest() {
        log.info("test begin");
    }

    @AfterEach
    void afterEachTest() {
        log.info("test end");
    }

    @Test
    void firstMethod() {
        Lionst lionst = new Lionst();
        String result = lionst.firstMethod("from junit");
        assertNotNull(result);
        assertEquals("Hello Method, para:from junit", result);
    }
}