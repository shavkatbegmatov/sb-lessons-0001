package brb.team.brr.service;

import brb.team.brr.dto.UserAddRequest;
import brb.team.brr.entity.Test;
import brb.team.brr.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    public int calculate(int a, int b) {
        return a / b;
    }

    public Test userAdd(UserAddRequest userAddRequest) {
        return testRepository.save(Test.builder()
                        .firstName(userAddRequest.getFirstName())
                        .lastName(userAddRequest.getLastName())
                        .age(userAddRequest.getAge())
                        .cityName(userAddRequest.getCityName())
                .build());
    }

}
