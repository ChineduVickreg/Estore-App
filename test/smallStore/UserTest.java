package smallStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void userCanRegisterTest(){
        User newUser = new User();
        newUser.setName("bisi");
        newUser.setPhone("zeroEightZero");
        newUser.setHomeAddress("312, Lagos");
        newUser.setEmailAddress("chinedu@semicolon.africa");

        assertEquals(newUser.getName(), "bisi");
    }

    @Test
    void userCanRegisterInAStoreTest(){
        User newUser = new User();
        newUser.setName("bisi");
        newUser.setPhone("zeroEightZero");
        newUser.setHomeAddress("312, Lagos");
        newUser.setEmailAddress("chinedu@semicolon.africa");

        Estore store = new Estore();
        store.setStoreName("Amadi's store");

        store.registerUser(newUser);
        assertFalse(store.getRegisteredUsers().isEmpty());
        assertTrue(store.getRegisteredUsers().contains(newUser));
        store.getRegisteredUsers().forEach(user ->{System.out.println(user.toString());
        });

        User secondUser = new User();
        secondUser.setName("Ojo");
        secondUser.setPhone("zeroEightZero");
        secondUser.setHomeAddress("311, ogun");
        secondUser.setEmailAddress("ojo@semicolon.africa");

        store.registerUser(secondUser);
        assertTrue(store.getRegisteredUsers().contains(secondUser));
        store.getRegisteredUsers().forEach(user ->{System.out.println(user.toString());
        });

        store.getRegisteredUsers().forEach(System.out::println);
    }
}