package ticket.booking.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.org.objectweb.asm.TypeReference;
import ticket.booking.entities.User;

import java.io.File;
import java.util.List;

public class UserBookingService {

    private User user;
    private List<User> userList;

    private  ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH = "../localDb/users.json";


    public UserBookingService(User user1){
        this.user=user1;
        File users =new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});




    }


}
