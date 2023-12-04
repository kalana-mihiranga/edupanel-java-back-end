package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers/part-time")
@CrossOrigin
public class FullTimeLecturerHttpController {
    @PatchMapping("ranks")
    public void arrangeFullTimeLecturesOrder(){
        System.out.println("arrangefulltimelecturers");

    }
    @GetMapping
    public void getAllFullTimeLecturers(){
        System.out.println("getAllFullTimelecturers");

    }
}
