//import org.junit.Before;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.r2dbc.core.DatabaseClient;
//import reactor.core.publisher.Hooks;
//import reactor.test.StepVerifier;
//import com.user.UserRepository;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class UserRepositoryTest {
//    @Autowired UserRepository userRepository;
//    @Autowired DatabaseClient database;
//
//
//    @Before
//    public void setUp() {
//        Hooks.onOperatorDebug();
//
//        List<String> statements = Arrays.asList(
//                                                "DROP TABLE IF EXISTS USER;",
//                                                "CREATE TABLE USER ( id SERIAL PRIMARY KEY, username VARCHAR(100) NOT NULL);");
//
//        statements.forEach(it -> database.execute()
//                .sql(it)
//                .fetch() //
//                .rowsUpdated() //
//                .as(StepVerifier::create) //
//                .expectNextCount(1) //
//                .verifyComplete());
//    }
//
//}
