package kz.m.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by pc on 22.01.2017.
 */

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:*/**/spring-data-config.xml"})
@PropertySource(value = {"classpath:application.properties"})
public class PersonCrudRepositoryTest {

    @Test
    public void test(){

    }
}