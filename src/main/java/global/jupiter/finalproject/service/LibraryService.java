package global.jupiter.finalproject.service;

import global.jupiter.finalproject.dao.LibraryDAO;
import global.jupiter.finalproject.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("libsrv")
public class LibraryService {

    @Autowired private LibraryDAO libdao;
    public void NewLibrary(Library lib) {
        libdao.insertLibrary(lib);
    }


    public List<Library> readLibrary() {


        return libdao.selectLibrary();
    }
}
