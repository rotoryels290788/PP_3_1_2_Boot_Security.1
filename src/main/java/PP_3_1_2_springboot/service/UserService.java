package PP_3_1_2_springboot.service;



import PP_3_1_2_springboot.model.User;

import java.util.List;


public interface UserService {

    List<User> getUserAll();

    void UserSave(User user);

    User showId(Long id);

    void update(Long id, User updateUser);

    void delete(Long id);
}