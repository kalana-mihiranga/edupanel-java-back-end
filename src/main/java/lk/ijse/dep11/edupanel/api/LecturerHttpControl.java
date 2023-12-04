package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lecturers")
@CrossOrigin
public class LecturerHttpControl {
    @PostMapping
    public void createNewLecturers(){
        System.out.println("cretae lecturerd");

    }

    @PatchMapping("/{lecturer-id")
    public void updateLecturerDetails(){
        System.out.println("cretae lecturerd");

    }

    @DeleteMapping("/{lecturer-id")
    public void deleteLecturer(){
        System.out.println("cretae lecturerd");

    }

    @GetMapping
    public void getAllLecturerd(){
        System.out.println("getall lecturerd");

    }


}
