package PP_3_1_2_springboot.service;

import PP_3_1_2_springboot.dao.UserDao;
import PP_3_1_2_springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImp implements UserService {

    final
    private UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getUserAll() {
        return userDao.getUserAll();
    }

    @Override
    @Transactional
    public void UserSave(User user) {
        userDao.UserSave(user);
    }

    @Override
    @Transactional
    public User showId(Long id) {
        return userDao.showId(id);
    }

    @Override
    @Transactional
    public void update(Long id, User updateUser) {
        userDao.update(id, updateUser);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }


}



