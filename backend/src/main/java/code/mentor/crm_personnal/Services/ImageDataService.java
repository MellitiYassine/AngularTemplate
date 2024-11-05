package code.mentor.crm_personnal.Services;

import code.mentor.crm_personnal.Models.ImageData;
import code.mentor.crm_personnal.Repositories.ImageDataRepository;
import code.mentor.crm_personnal.Services.Interface.IImageDataService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ImageDataService implements IImageDataService {
    private ImageDataRepository imageDataRepository;

    @Override
    public ImageData uploadImage(MultipartFile file) throws IOException {

        return imageDataRepository.save(ImageData.builder().name(file.getOriginalFilename()).type(file.getContentType()).imageData(ImageUtil.compressImage(file.getBytes())).build());

    }

    @Override
    @Transactional
    public ImageData getInfoByImageByName(String name) {
        Optional<ImageData> dbImage = imageDataRepository.findByName(name);

        return ImageData.builder().name(dbImage.get().getName()).type(dbImage.get().getType()).imageData(ImageUtil.decompressImage(dbImage.get().getImageData())).build();

    }

    @Override
    @Transactional
    public byte[] getImage(String name) {
        Optional<ImageData> dbImage = imageDataRepository.findByName(name);
        byte[] image = ImageUtil.decompressImage(dbImage.get().getImageData());
        return image;
    }

}
