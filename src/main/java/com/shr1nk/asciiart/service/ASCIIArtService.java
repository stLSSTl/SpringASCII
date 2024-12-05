package com.shr1nk.asciiart.service;

import com.github.lalyos.jfiglet.FigletFont;
import com.shr1nk.asciiart.config.ASCIIArtConfig;
import org.springframework.stereotype.Service;
import java.io.IOException;
import com.shr1nk.asciiart.constant.AsciiArtConstant;


@Service
public class ASCIIArtService {

    private final ASCIIArtConfig asciiArtConfig;

    public ASCIIArtService(ASCIIArtConfig asciiArtConfig) {
        this.asciiArtConfig = asciiArtConfig;
    }

    public void printAsciiArt() throws IOException {
        String content = asciiArtConfig.getContent();
        // 如果配置文件中没有配置ASCII艺术字的内容，则会使用默认值
        if (content == null || content.isEmpty())
            content = AsciiArtConstant.ASCII_CONTENT_DEFAULT_VALUE;

        String asciiArt = FigletFont.convertOneLine(content);
        System.out.println(asciiArt);
    }
}
