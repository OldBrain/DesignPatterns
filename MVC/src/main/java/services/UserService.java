package services;

import lombok.RequiredArgsConstructor;
import models.User;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UserService {
    private final UserRepository userRepository;

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }


}
