package com.victorze.blog.utils;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class Flash {

    public static void success(String message, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("success", message);
    }

    public static void error(String message, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", message);
    }

}
