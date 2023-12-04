package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers/part-time")
@CrossOrigin
public class partTimeLecturerController {
    @PatchMapping("ranks")
    public void arrangePartTimeLecturesOrder(){
        System.out.println("arrange parttimelecturers");

    }
    @GetMapping
    public void getAllPartTimeLecturers(){
        System.out.println("getAll PArtTimelecturers");

    }
}