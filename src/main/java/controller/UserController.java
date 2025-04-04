package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserController userService;

    @PostMapping("/users") // 유저 생성


    @GetMapping("/users") // 유저 조회


    @GetMapping("/users/{id}") //선택된 유저 조회


    @GetMapping("/users/{id}") // 비밀번호 조회


    @PutMapping("/users/{id}") // 비밀번호 수정


    @PutMapping("/users/{id}") // 유저 수정


    @DeleteMapping("/users/{id}") // 유저 삭제
}
