package lk.ijse.dep11.edupanel.api;


import lk.ijse.dep11.edupanel.to.request.LecturerReqTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import javax.swing.text.AbstractDocument;
import javax.validation.Valid;
import java.sql.*;

@RestController
@RequestMapping("/api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {
    @Autowired
    private DataSource pool;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "multipart/form-data",produces = "application/json")
    public void createNewLecturer(@ModelAttribute @Valid LecturerReqTO lecturer){
        try {
            Connection connection = pool.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO lecturer(id, name, designation, qualifications, picture, linkedin) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, lecturer.getName());
            preparedStatement.setString(1, lecturer.getDesignation());
            preparedStatement.setString(1, lecturer.getQualifications());
            preparedStatement.setString(1, lecturer.getLinkedin());
            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            generatedKeys.next();

            int lecturerId=generatedKeys.getInt("id");
            String picture=lecturerId+"-"+lecturer.getName();

            if(lecturer.getPicture()!=null||!lecturer.getPicture().isEmpty()){
                PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE lecturer SET picture=? WHERE id=?");
                preparedStatement1.setString(1,picture);
                preparedStatement1.setInt(2,lecturerId);
                preparedStatement1.executeUpdate();

            }

            if (lecturer.getType().equalsIgnoreCase("full-time")){
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT `rank` FROM full_time_rank ORDER BY  `rank`DESC LIMIT ");
                int rank;
                if(!resultSet.next()) rank=1;



            }else {
                resultSet,
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        System.out.println(lecturer);
        System.out.println("createNewLecturer");
    }

    @PatchMapping("/{lecturer-id}")
    public void updateLecturerDetails(){
        System.out.println("updateLecturerDetails");
    }

    @DeleteMapping("/{lecturer-id}")
    public void deleteLecturer(){
        System.out.println("deleteLecturer");
    }

    @GetMapping
    public void getAllLecturers(){
        System.out.println("getAllLecturers");
    }
}