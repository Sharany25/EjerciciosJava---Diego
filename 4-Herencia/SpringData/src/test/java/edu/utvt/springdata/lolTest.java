package edu.utvt.springdata;
import edu.utvt.springdata.data.entities.Administrativo;
import edu.utvt.springdata.data.entities.Alumno;
import edu.utvt.springdata.data.repositories.AdministrativoRepository;
import edu.utvt.springdata.data.repositories.AlumnoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;

@SpringBootTest
public class lolTest {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Test
    void insertAlumno() {
        Alumno alumno = new Alumno();
        alumno.setNombre("Diego");
        alumno.setApellidos("Osorio");
        alumno.setEmail("diego@example.com");
        alumno.setFechaNacimiento(LocalDate.of(2004, 8, 23));
        alumnoRepository.save(alumno);
    }

    @Autowired
    private AdministrativoRepository administrativoRepository;

    @Test
    void insertAdministrativo() {
        Administrativo administrativo = new Administrativo();
        administrativo.setNombre("Alberto");
        administrativo.setApellidos("Lopez");
        administrativo.setEmail("alberto@gmail.com");
        administrativo.setFechaNacimiento(LocalDate.of(2024, 8, 23));
        administrativo.setSalario(Double.parseDouble("2004"));
        administrativoRepository.save(administrativo);
    }
}

