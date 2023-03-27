package com.controller;

import com.model.Painting;
import com.model.PaintingForm;
import com.service.PaintingService;
import com.service.PaintingServiceIpm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@PropertySource("classpath:upload_file.properties")
public class PaintingController {
    private final PaintingService paintingService=new PaintingServiceIpm();
    @Value("${file-upload}")
    private String fileUpload;

    @GetMapping("")
 public String homPage(Model model){
    List<Painting>paintings=paintingService.findAll();
    model.addAttribute("paintings",paintings);
    return "/homePage";
}
@GetMapping("/create")
public ModelAndView showCreateForm() {
    ModelAndView modelAndView = new ModelAndView("/create");
    modelAndView.addObject("paintingForm", new PaintingForm());
    return modelAndView;
}
@PostMapping("/save")
    public ModelAndView saveProduct(@ModelAttribute PaintingForm paintingForm) {
        MultipartFile multipartFile = paintingForm.getImg();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(paintingForm.getImg().getBytes(), new File(fileUpload + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Painting painting = new Painting(paintingForm.getId(), paintingForm.getCodePainting(), paintingForm.getPrice(),fileName);
        paintingService.save(painting);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("productForm", paintingForm);
        return modelAndView;
    }

}
