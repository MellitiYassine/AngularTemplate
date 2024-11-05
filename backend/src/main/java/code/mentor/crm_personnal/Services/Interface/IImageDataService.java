package code.mentor.crm_personnal.Services.Interface;

import code.mentor.crm_personnal.Models.ImageData;
import jakarta.transaction.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IImageDataService {
    ImageData uploadImage(MultipartFile file) throws IOException;

    @Transactional
    ImageData getInfoByImageByName(String name);

    @Transactional
    byte[] getImage(String name);
}
