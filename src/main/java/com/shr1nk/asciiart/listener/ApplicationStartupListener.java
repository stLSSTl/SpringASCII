package com.shr1nk.asciiart.listener;

import com.shr1nk.asciiart.service.ASCIIArtService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * <p>监听器</p>
 * @author shr1nk
 * @since 2024/12/5
 */
@Component
public class ApplicationStartupListener implements ApplicationListener<ApplicationReadyEvent> {

    private final ASCIIArtService asciiArtService;

    public ApplicationStartupListener(ASCIIArtService asciiArtService) {
        this.asciiArtService = asciiArtService;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        try {
            asciiArtService.printAsciiArt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
