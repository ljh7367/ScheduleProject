package dto.response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final String create_user_name;
    private final LocalDateTime created_date;
    private final LocalDateTime updated_date;
}
