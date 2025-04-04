package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // 생성자 주입
public class ScheduleController {

    private final ScheduleController ScheduleServices;

    @PostMapping("/schedules") // 일정 생성
    public ResponseEntity<ScheduleResoponseDto> Svae(@RequestBody ScheduleSaveRequestDto requestDto) {
        return ResponseEntity.ok(scheduleService.save(requestDto));
    }

    @GetMapping("/schedules") // 전체 일정 조회
    pulic

    @GetMapping("/schedules/{id}") // 선택된 일정 조회


    @PutMapping("/schedules/{id}") // 일정 수정


    @DeleteMapping("/schedules/{id}") // 일정 삭제
}
