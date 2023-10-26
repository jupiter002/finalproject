package global.jupiter.finalproject.dao;

import global.jupiter.finalproject.model.Library;
import global.jupiter.finalproject.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("libdao")
public class LibraryDAO {

    @Autowired
    private LibraryRepository librepo;
    public void insertLibrary(Library lib) {
        librepo.save(lib);
        System.out.println("도서관 정보 저장 완료");
    }

    public List<Library> selectLibrary() {
        return librepo.findAll();
    }
}
