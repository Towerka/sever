package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

import javax.servlet.ServletContext;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class Controller {
//    @Autowired
//    private ServletContext servletContext;
//    @RequestMapping("/getToken")
//    public ResponseEntity<InputStreamResource> downloadFile1(
//            @RequestParam(defaultValue = "text.txt") String fileName) throws IOException {
//
//
//        MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, fileName);
//        System.out.println("fileName: " + fileName);
//        System.out.println("mediaType: " + mediaType);
//        File file = new File("E://chromes" + "/" + fileName);
//        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        File file1 = new File("text.txt");
//        String path = file1.getAbsolutePath();
//        System.out.println(path);
//
//        return ResponseEntity.ok()
//                // Content-Disposition
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName())
//                // Content-Type
//                .contentType(mediaType)
//                // Contet-Length
//                .contentLength(file.length()) //
//                .body(resource);
//    }

    @PostMapping("/getToken")
    public void postBody(@RequestBody String fullName) {
        System.out.println("Hello " + fullName);
    }
    @GetMapping("/getToken")
    public void get() {
        System.out.println("Hello ");
    }
}

