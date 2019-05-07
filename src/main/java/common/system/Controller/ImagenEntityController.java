package common.system.Controller;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import domain.System.BusinessEntity.ViewStockBE;
import domain.System.BusinessEntity.Base.Clothingline;
import domain.System.BusinessEntity.Base.Imagen;
import repository.System.DataAccess.MySql.ImagenDa;
@RestController
public class ImagenEntityController {
	   @RequestMapping(value = "/sid", method = RequestMethod.GET,
	            produces = MediaType.IMAGE_JPEG_VALUE)
	    public ResponseEntity<byte[]> getImage() throws IOException {

	    	ClassPathResource imgFile = new ClassPathResource("image/ropa.jpeg");
	        //byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());
	        ImagenDa obj = new ImagenDa();
 	        List<Imagen> imf  = null;
	        byte[] bytes= null;
	        imf= obj.list();
	        for (Imagen imagen : imf) {
	         bytes=imagen.getImagendata(); 
			}
	        return ResponseEntity
	                .ok()
	                .contentType(MediaType.IMAGE_JPEG)
	                .body(bytes);
	    }
	    @RequestMapping("/RegisterImagen")
	    public ModelAndView mensaje() {
	      
	    	return new ModelAndView("RegisterImagen", "command", new ViewStockBE());
	    }
	    @RequestMapping("/login")
	    public ModelAndView login() {
	      
	    	return new ModelAndView("login");
	    }
	    	   
}
