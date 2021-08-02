package com.laz.gradle.knowledge;

import com.laz.gradle.knowledge.service.DemoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GradleApplication.class)
public class DemoServiceTestCase {
    @InjectMocks
    private DemoService demoService;



    @Test
    public void testTest() throws Exception {

        Assert.assertEquals(1, demoService.test(1));
        Assert.assertEquals(2, demoService.test(2));
        Assert.assertEquals(3, demoService.test(3));
    }

}
