package common.system.Controller;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
public class ImagenController {
	 @RequestMapping(value = "/sid", method = RequestMethod.GET,
	           produces = MediaType.IMAGE_JPEG_VALUE)

	    public void getImage(HttpServletResponse response) throws IOException {

		 ClassPathResource imgFile = new ClassPathResource("image/ropa.jpeg");

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
	       StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
	    }
}
