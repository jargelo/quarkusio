package dev.quarkusio.repositories;

import javax.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class RepositoriesAzureImplTest {


    private static final Logger LOG = Logger.getLogger(RepositoriesAzureImplTest.class);

    @Inject
    @ConfigProperty(name = "my.parameter")
    String parameter;

    @BeforeAll
    void initialize() {
        LOG.info("run beforeAll");
    }

    
    @Test
    @Order(1)
    void testThatAdminCanCreateRepository() {
        LOG.info("run test");

    }
}