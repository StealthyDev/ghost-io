package com.stealthydev.open.ghostio;

import com.stealthydev.open.ghostio.GhostIoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GhostIoApplication.class)
@WebAppConfiguration
public class GhostIoApplicationTests {

    @Test
    public void contextLoads() {
    }

}
